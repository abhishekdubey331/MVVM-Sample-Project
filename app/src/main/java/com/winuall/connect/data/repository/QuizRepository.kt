package com.winuall.connect.data.repository

import com.pixplicity.easyprefs.library.Prefs
import com.winuall.connect.data.model.QuizResponse
import com.winuall.connect.data.remote.ApiInterface
import com.winuall.connect.utils.Constants
import com.winuall.connect.utils.Utils
import io.reactivex.Single


class QuizRepository(private val apiInterface: ApiInterface, private val utils: Utils) {

    fun getQuizzesFromServer(): Single<QuizResponse>? {
        val hasConnection =    utils.isConnectedToInternet()
        var observableFromApi: Single<QuizResponse>? = null
        if (hasConnection) {
            observableFromApi = getQuizzes()
        }
        return if (hasConnection)
            observableFromApi!!
        else
            null
    }

    private fun getQuizzes(): Single<QuizResponse> {
        return apiInterface.getQuizzesForUser(Prefs.getString(Constants.TOKEN, ""))
    }

    fun updateData() : Single<Boolean>{
        return Single.just(true)
    }

}