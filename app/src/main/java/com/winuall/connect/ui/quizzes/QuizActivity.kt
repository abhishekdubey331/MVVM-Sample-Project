package com.winuall.connect.ui.quizzes


import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.connect.winuall.R
import com.orhanobut.logger.Logger
import com.winuall.connect.data.model.QuizResponse
import com.winuall.connect.ui.appupdate.BottomSheetFragment
import com.winuall.connect.utils.Utils
import com.winuall.connect.utils.toast
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel


class QuizActivity : AppCompatActivity() {
    private val utils: Utils by inject()
    private val quizViewModel by viewModel<QuizViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        if (utils.isConnectedToInternet()) {
            quizViewModel.getUpdateDataPopUp()
            quizViewModel.getQuizzesFromServer()
        } else
            toast("No internet connection")
        quizViewModel.quizResult().observe(this, Observer<QuizResponse> {
            Logger.d(it)
        })
        // Open bottom sheet if update true
        quizViewModel.showUpdatePopUp().observe(this, Observer<Boolean> {
            if (it != null && it == true) {
                val strings: ArrayList<String> = ArrayList()
                strings.add("Some Bugs Resolved")
                val bottomSheetFragment = BottomSheetFragment().newInstance(strings)
                bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
            }
        })

    }

    override fun onDestroy() {
        quizViewModel.disposeElements()
        super.onDestroy()
    }
}
