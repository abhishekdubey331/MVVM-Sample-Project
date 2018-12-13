package com.winuall.connect.utils

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.thefinestartist.Base

/**
 * Created by Abhishek Dubey on 10.06.2018 at 00:57.
 * Copyright (c) 2018. All rights reserved.
 */
class Utils(private val context: Context) {
  fun isConnectedToInternet(): Boolean {
    val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    return cm.activeNetworkInfo?.isConnected ?: false
  }

  fun startNewActivity(context: AppCompatActivity,bundle:Bundle?, calledActivity : Class<*> ) {
    val intent = Intent(context, calledActivity)
    if (bundle!=null)
      intent.putExtras(bundle)
    context.startActivity(intent)
  }
}