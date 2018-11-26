package com.winuall.connect.ui.quizzes

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.orhanobut.logger.Logger
import com.winuall.connect.data.model.QuizResponse
import com.winuall.connect.data.repository.QuizRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class QuizViewModel @Inject constructor(private val quizRepository: QuizRepository) : ViewModel() {

    var quizResult: MutableLiveData<QuizResponse> = MutableLiveData()
    var quizError: MutableLiveData<String> = MutableLiveData()
    var quizLoader: MutableLiveData<Boolean> = MutableLiveData()
    private lateinit var disposableObserver: DisposableSingleObserver<QuizResponse>

    fun quizResult(): LiveData<QuizResponse> {
        return quizResult
    }

    fun quizError(): LiveData<String> {
        return quizError
    }

    fun quizLoader(): LiveData<Boolean> {
        return quizLoader
    }

    fun getQuizzesFromServer() {

        disposableObserver = object : DisposableSingleObserver<QuizResponse>() {

            override fun onSuccess(quizResponse: QuizResponse) {
                quizResult.postValue(quizResponse)
                quizLoader.postValue(false)
            }

            override fun onError(e: Throwable) {
                Logger.d(e.localizedMessage)
                quizError.postValue(e.message)
                quizLoader.postValue(false)
            }
        }

        quizRepository.getQuizzesFromServer()!!
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(disposableObserver)


    }

    fun disposeElements() {
        if (!disposableObserver.isDisposed) disposableObserver.dispose()
    }

}