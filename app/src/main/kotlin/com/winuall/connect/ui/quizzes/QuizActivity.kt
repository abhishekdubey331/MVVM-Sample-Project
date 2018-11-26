package com.winuall.connect.ui.quizzes


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.orhanobut.logger.Logger
import com.winuall.connect.R
import com.winuall.connect.data.model.QuizResponse
import dagger.android.AndroidInjection
import javax.inject.Inject

class QuizActivity : AppCompatActivity() {

    @Inject
    lateinit var quizViewModelFactory: QuizViewModelFactory
    private lateinit var quizViewModel: QuizViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        AndroidInjection.inject(this)
        quizViewModel = ViewModelProviders.of(this, quizViewModelFactory).get(
                QuizViewModel::class.java)
        quizViewModel.getQuizzesFromServer()
        quizViewModel.quizResult().observe(this , Observer<QuizResponse> {
            Logger.d(it)
        })
    }

    override fun onDestroy() {
        quizViewModel.disposeElements()
        super.onDestroy()
    }
}
