package com.sample.project.utils

import org.koin.dsl.module.Module
import org.koin.dsl.module.module


object AppModule{

    fun getModule() : Module = module {
        single {
            ConnectivityHelper()
        }
    }

}