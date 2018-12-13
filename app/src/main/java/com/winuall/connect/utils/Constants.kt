package com.winuall.connect.utils

import org.json.JSONObject
import retrofit2.HttpException

/**
 * Created by Abhishek Dubey on 10.06.2018 at 01:02.
 * Copyright (c) 2018. All rights reserved.
 */
class Constants {

  companion object {

    const val DATABASE_NAME = "cryptocurrencies_db"

    const val TOKEN = "token"

    const  val BEARER = "bearer"


    fun getErrorMessage(e : Throwable): String {
      val error = e as HttpException
      val errorBody = error.response().errorBody()!!.string()
      val json = JSONObject(errorBody)
      return json.getJSONObject("error").getString("message")
    }

  }


}