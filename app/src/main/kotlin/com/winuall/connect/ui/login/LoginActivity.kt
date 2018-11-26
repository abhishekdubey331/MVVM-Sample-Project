package com.winuall.connect.ui.login

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.orhanobut.logger.Logger
import com.pixplicity.easyprefs.library.Prefs
import dagger.android.AndroidInjection
import com.winuall.connect.R
import com.winuall.connect.data.model.UserResponse
import com.winuall.connect.ui.quizzes.QuizActivity
import com.winuall.connect.utils.Utils
import com.winuall.connect.utils.toast
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    @Inject
    lateinit var loginViewModelFactory: LoginViewModelFactory
    @Inject
    lateinit var utils: Utils
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        AndroidInjection.inject(this)
        loginViewModel = ViewModelProviders.of(this, loginViewModelFactory).get(
                LoginViewModel::class.java)
        loginViewModel.makeLoginOnServer("sdemo", "sdemo")
        loginViewModel.userResult().observe(this, Observer<UserResponse> {
            toast(it!!.name)
            Prefs.putString("token","bearer "+it.token)
            utils.startNewActivity(this,null,QuizActivity::class.java)
            Logger.d(it)
        })
    }

    override fun onDestroy() {
        loginViewModel.disposeElements()
        super.onDestroy()
    }

}
