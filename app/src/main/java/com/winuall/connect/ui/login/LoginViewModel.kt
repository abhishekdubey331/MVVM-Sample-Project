package com.winuall.connect.ui.login

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.pixplicity.easyprefs.library.Prefs
import com.winuall.connect.data.model.UserResponse
import com.winuall.connect.data.repository.UserRepository
import com.winuall.connect.utils.Constants
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers


class LoginViewModel(private val userRepository: UserRepository) : ViewModel() {

    var userResult: MutableLiveData<UserResponse> = MutableLiveData()
    var userError: MutableLiveData<String> = MutableLiveData()
    var userLoader: MutableLiveData<Boolean> = MutableLiveData()
    private lateinit var disposableObserver: DisposableSingleObserver<UserResponse>

    fun userResult(): LiveData<UserResponse> {
        return userResult
    }

    fun isLoggedIn() : Boolean {
        return (Prefs.getString(Constants.TOKEN, null)!=null)
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
                userError.postValue(Constants.getErrorMessage(e))
                userLoader.postValue(false)
            }
        }
        userRepository.makeLoginOnServer(userName, password)
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe(disposableObserver)
    }

    fun disposeElements() {
        if (!disposableObserver.isDisposed) disposableObserver.dispose()
    }

}