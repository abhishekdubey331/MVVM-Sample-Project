package com.winuall.connect

import android.app.Activity
import android.app.Application
import android.content.ContextWrapper
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.pixplicity.easyprefs.library.Prefs
import com.squareup.leakcanary.LeakCanary
import com.winuall.connect.di.component.DaggerAppComponent
import com.winuall.connect.di.module.AppModule
import com.winuall.connect.di.module.NetModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by Abhishek Dubey on 10.06.2018 at 00:06.
 * Copyright (c) 2018. All rights reserved.
 */
class App : Application(), HasActivityInjector {
  @Inject
  lateinit var activityInjector: DispatchingAndroidInjector<Activity>

  override fun onCreate() {
    super.onCreate()
    DaggerAppComponent.builder()
        .appModule(AppModule(this))
        .netModule(NetModule("your_base_ur"))
        .build()
        .inject(this)
      initAll()
  }

    private fun initAll()
    {
        Prefs.Builder()
                .setContext(this)
                .setMode(ContextWrapper.MODE_PRIVATE)
                .setPrefsName(packageName)
                .setUseDefaultSharedPreference(true)
                .build()

        Logger.addLogAdapter(AndroidLogAdapter())
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)
    }
  override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}