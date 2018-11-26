package com.winuall.connect.ui.quizzes

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject


@Suppress("UNCHECKED_CAST")
class QuizViewModelFactory @Inject constructor(
        private val quizViewModel: QuizViewModel) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QuizViewModel::class.java)) {
            return quizViewModel as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}