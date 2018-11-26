package com.winuall.connect.ui.login

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.winuall.connect.data.model.UserResponse
import com.winuall.connect.data.repository.UserRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class LoginViewModel @Inject constructor(
        private val userRepository: UserRepository) : ViewModel() {

    var userResult: MutableLiveData<UserResponse> = MutableLiveData()
    var userError: MutableLiveData<String> = MutableLiveData()
    var userLoader: MutableLiveData<Boolean> = MutableLiveData()
    private lateinit var disposableObserver: DisposableSingleObserver<UserResponse>

    fun userResult(): LiveData<UserResponse> {
        return userResult
    }

    fun userError(): LiveData<String> {
        return userError
    }

    fun userLoader(): LiveData<Boolean> {
        return userLoader
    }

    fun makeLoginOnServer(userName: String , password: String) {
        disposableObserver = object : DisposableSingleObserver<UserResponse>() {
            override fun onSuccess(t: UserResponse) {
                userResult.postValue(t)
                userLoader.postValue(false)
            }
            override fun onError(e: Throwable) {
                userError.postValue(e.message)
                userLoader.postValue(false)
            }
        }

        userRepository.makeLoginOnServer(userName, password)!!
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(disposableObserver)

    }

    fun disposeElements() {
        if (!disposableObserver.isDisposed) disposableObserver.dispose()
    }

}