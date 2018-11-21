package com.sample.project

import android.app.Application
import com.sample.project.utils.AppModule
import org.koin.android.ext.android.startKoin


class ApplicationController : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(AppModule.getModule()))
    }
}