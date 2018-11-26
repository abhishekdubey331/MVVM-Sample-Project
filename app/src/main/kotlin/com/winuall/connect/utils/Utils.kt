package com.winuall.connect.utils

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.winuall.connect.ui.quizzes.QuizActivity
import java.util.*
import javax.inject.Inject

/**
 * Created by Abhishek Dubey on 10.06.2018 at 00:57.
 * Copyright (c) 2018. All rights reserved.
 */
class Utils @Inject constructor(private val context: Context) {

  fun isConnectedToInternet(): Boolean {
    val connectivity = context.getSystemService(
        Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val info = connectivity.allNetworkInfo
    if (info != null)
      for (i in info.indices)
        if (info[i].state == NetworkInfo.State.CONNECTED) {
          return true
        }
    return false
  }



  fun startNewActivity(context: AppCompatActivity,bundle:Bundle?, calledActivity : Class<*> )
  {
    val intent = Intent(context, calledActivity)
    if (bundle!=null)
      intent.putExtras(bundle)
    context.startActivity(intent)
  }
}