package com.winuall.connect.di.module

import com.winuall.connect.ui.login.LoginActivity
import com.winuall.connect.ui.quizzes.QuizActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by Abhishek Dubey on 9.06.2018 at 21:04.
 * Copyright (c) 2018. All rights reserved.
 */
@Module
abstract class BuildersModule {

  @ContributesAndroidInjector
  abstract fun contributeLoginActivity(): LoginActivity

  @ContributesAndroidInjector
  abstract fun contributeQuizActivity(): QuizActivity

}