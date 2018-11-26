package com.winuall.connect.ui.login

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject

/**
 * Created by Abhishek Dubey on 10.06.2018 at 00:47.
 * Copyright (c) 2018. All rights reserved.
 */

@Suppress("UNCHECKED_CAST")
class LoginViewModelFactory @Inject constructor(
    private val loginViewModel: LoginViewModel) : ViewModelProvider.Factory {

  override fun <T : ViewModel> create(modelClass: Class<T>): T {
    if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
      return loginViewModel as T
    }
    throw IllegalArgumentException("Unknown class name")
  }
}