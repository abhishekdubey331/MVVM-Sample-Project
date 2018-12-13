package com.winuall.connect.data.repository

import com.pixplicity.easyprefs.library.Prefs
import com.winuall.connect.data.model.OldExamContent
import com.winuall.connect.data.remote.ApiInterface
import com.winuall.connect.utils.Constants
import com.winuall.connect.utils.Utils
import io.reactivex.Single


class OldExamsRepository(private val apiInterface: ApiInterface, private val utils: Utils) {

    fun getOldExamDataFromServer(): Single<OldExamContent>? {
        val hasConnection =    utils.isConnectedToInternet()
        var observableFromApi: Single<OldExamContent>? = null
        if (hasConnection) {
            observableFromApi = getOldExams()
        }
        return if (hasConnection)
            observableFromApi!!
        else
            null
    }

    private fun getOldExams(): Single<OldExamContent> {
        return apiInterface.getOldExamsFromServer(Prefs.getString(Constants.TOKEN, ""))
    }

}