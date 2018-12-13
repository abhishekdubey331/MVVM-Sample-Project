package com.winuall.connect.utils

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.util.DisplayMetrics
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.orhanobut.logger.Logger

/**
 * Created by Abhishek Dubey on 10.06.2018 at 01:00.
 * Copyright (c) 2018. All rights reserved.
 */

fun Context.hideKeyboard() {
  try {
    val inputManager = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    if ((this as Activity).currentFocus == null || this.currentFocus.windowToken == null) {
      return
    }
    inputManager.hideSoftInputFromWindow(this.currentFocus.windowToken,
        InputMethodManager.HIDE_NOT_ALWAYS)
  } catch (exception: Exception) {
    Logger.d(exception.localizedMessage)
  }
}

fun Context.convertDpToPixel(dp: Float): Float {
  return dp * (this.resources.displayMetrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
}

fun Context.toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
fun Context.toast(msg: Int) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

fun Context.longToast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
fun Context.longToast(msg: Int) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()