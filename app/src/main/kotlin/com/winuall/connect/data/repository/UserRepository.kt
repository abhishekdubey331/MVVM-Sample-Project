package com.winuall.connect.data.repository

import com.winuall.connect.data.model.UserResponse
import com.winuall.connect.data.remote.ApiInterface
import com.winuall.connect.utils.Utils
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject


class UserRepository @Inject constructor(private val apiInterface: ApiInterface, private val utils: Utils) {

    fun makeLoginOnServer(userName: String , password : String): Single<UserResponse>? {
        val hasConnection = utils.isConnectedToInternet()
        var observableFromApi: Single<UserResponse>? = null
        if (hasConnection) {
            observableFromApi = loginUser(userName,password)
        }
        return if (hasConnection)
            observableFromApi!!
        else
            null
    }

    private fun loginUser(userName: String , password : String): Single<UserResponse> {
        return apiInterface.makeLoginOnServer(userName,password)
    }

}