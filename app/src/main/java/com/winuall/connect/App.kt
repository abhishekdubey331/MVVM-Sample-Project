package com.winuall.connect

import android.app.Application
import android.content.ContextWrapper
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.pixplicity.easyprefs.library.Prefs
import com.squareup.leakcanary.LeakCanary
import com.thefinestartist.Base
import com.winuall.connect.di.AppModule
import org.koin.android.ext.android.startKoin

/**
 * Created by Abhishek Dubey on 10.06.2018 at 00:06.
 * Copyright (c) 2018. All rights reserved.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initAll()
    }

    private fun initAll() {
        Base.initialize(this);
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
        setUpKoinModules()
    }


    private fun setUpKoinModules() {
        startKoin(
            this,
            listOf(
                AppModule().getAppModules(),
                AppModule().getNetModule("")
            )
        )
    }

}