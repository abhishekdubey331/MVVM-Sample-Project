package com.winuall.connect.ui.oldpapers

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.orhanobut.logger.Logger
import com.winuall.connect.data.model.OldExamContent
import com.winuall.connect.data.repository.OldExamsRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers


class OldPapersViewModel(private val oldExamsRepository: OldExamsRepository) : ViewModel() {


    private var oldExamContent: MutableLiveData<OldExamContent> = MutableLiveData()
    private var oldExamError: MutableLiveData<String> = MutableLiveData()
    private lateinit var disposableObserver: DisposableSingleObserver<OldExamContent>
    private val compositeDisposable = CompositeDisposable()

    fun oldExamContent(): LiveData<OldExamContent> {
        return oldExamContent
    }

    fun oldExamContentError(): LiveData<String> {
        return oldExamError
    }

    fun getOldExamDataFromServer() {
        disposableObserver = object : DisposableSingleObserver<OldExamContent>() {

            override fun onSuccess(quizResponse: OldExamContent) {
                oldExamContent.postValue(quizResponse)
            }

            override fun onError(e: Throwable) {
                Logger.d(e.localizedMessage)
                oldExamError.postValue(e.message)
            }
        }
        oldExamsRepository.getOldExamDataFromServer()!!
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(disposableObserver)
        compositeDisposable.add(disposableObserver)
    }


}