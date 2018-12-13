package com.winuall.connect.ui.login

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.connect.winuall.R
import com.orhanobut.logger.Logger
import com.pixplicity.easyprefs.library.Prefs
import com.winuall.connect.data.model.UserResponse
import com.winuall.connect.ui.quizzes.QuizActivity
import com.winuall.connect.utils.Constants
import com.winuall.connect.utils.Utils
import com.winuall.connect.utils.toast
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val utils: Utils by inject()
    private val loginViewModel by viewModel<LoginViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        if (loginViewModel.isLoggedIn()) { // Check user is logged in
            utils.startNewActivity(this, null, QuizActivity::class.java)
            finish()
        } else {
            loginViewModelObserve()
            makeLogin.setOnClickListener {
                startLogin()
            }
        }
    }

    private fun startLogin() {
        if (userName.text.toString().length > 2 && password.text.toString().length > 2) {
            if (utils.isConnectedToInternet())
                loginViewModel.makeLoginOnServer(userName.text.toString(), password.text.toString())
            else
                toast("No internet connection")
        } else
            toast("Please fill username & password")
    }


    private fun loginViewModelObserve() {
        loginViewModel.userResult().observe(this, Observer<UserResponse> {
            toast("Welcome ${it?.name}")
            Logger.d("Token " + it?.token)
            Prefs.putString(Constants.TOKEN, "${Constants.BEARER} " + it?.token)
            utils.startNewActivity(this, null, QuizActivity::class.java)
            finish()
            Logger.d(it)
        })

        loginViewModel.userError().observe(this, Observer<String> {
            if (it != null) {
                toast("Error: $it")
            }
        })
    }

    override fun onDestroy() {
        if (!loginViewModel.isLoggedIn())
            loginViewModel.disposeElements()
        super.onDestroy()
    }

}
