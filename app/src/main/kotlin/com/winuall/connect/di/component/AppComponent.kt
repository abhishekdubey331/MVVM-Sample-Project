package com.winuall.connect.di.component

import com.winuall.connect.App
import com.winuall.connect.di.module.AppModule
import com.winuall.connect.di.module.BuildersModule
import com.winuall.connect.di.module.NetModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


/**
 * Created by Abhishek Dubey on 9.06.2018 at 21:07.
 * Copyright (c) 2018. All rights reserved.
 */
@Singleton
@Component(
    modules = [(AndroidInjectionModule::class), (BuildersModule::class), (AppModule::class), (NetModule::class)]
)
interface AppComponent {
  fun inject(app: App)
}
