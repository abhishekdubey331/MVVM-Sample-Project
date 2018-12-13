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
import io.reactivex.disposables.CompositeDisposable


class QuizViewModel(private val quizRepository: QuizRepository) : ViewModel() {

    private var quizResult: MutableLiveData<QuizResponse> = MutableLiveData()
    private var quizError: MutableLiveData<String> = MutableLiveData()
    private var showPopUp: MutableLiveData<Boolean> = MutableLiveData()
    private var quizLoader: MutableLiveData<Boolean> = MutableLiveData()
    private lateinit var disposableObserver: DisposableSingleObserver<QuizResponse>
    private lateinit var showPopUpObserver: DisposableSingleObserver<Boolean>

    private val compositeDisposable = CompositeDisposable()

    fun quizResult(): LiveData<QuizResponse> {
        return quizResult
    }


    fun showUpdatePopUp(): LiveData<Boolean> {
        return showPopUp
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
        compositeDisposable.add(disposableObserver)
    }


    fun getUpdateDataPopUp() {
        showPopUpObserver = object : DisposableSingleObserver<Boolean>() {
            override fun onSuccess(t: Boolean) {
                showPopUp.postValue(true)
            }

            override fun onError(e: Throwable) {

            }
        }
        quizRepository.updateData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(showPopUpObserver)
        compositeDisposable.add(showPopUpObserver)
    }

    fun disposeElements() {
        if (!compositeDisposable.isDisposed) compositeDisposable.dispose()
    }

}