package com.winuall.connect.di

import android.arch.persistence.room.Room
import com.orhanobut.logger.Logger
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.thefinestartist.Base
import com.winuall.connect.data.remote.ApiInterface
import com.winuall.connect.data.repository.QuizRepository
import com.winuall.connect.data.repository.UserRepository
import com.winuall.connect.persistance.dao.CryptoCurrencyDao
import com.winuall.connect.persistance.local.Database
import com.winuall.connect.ui.login.LoginViewModel
import com.winuall.connect.ui.quizzes.QuizViewModel
import com.winuall.connect.utils.Constants
import com.winuall.connect.utils.Utils
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Abhishek Dubey on 9.06.2018 at 21:05.
 * Copyright (c) 2018. All rights reserved.
 */

class AppModule {

    fun getAppModules() : Module{
        return module {
            single { provideCryptocurrenciesDatabase() }
            single { provideCryptocurrenciesDao(get()) }
            viewModel { LoginViewModel(get()) }
            single { UserRepository(get(), get()) }
            single { QuizRepository(get(), get()) }
            factory { Utils(get()) }
            viewModel { QuizViewModel(get()) }
        }
    }


    private fun provideCryptocurrenciesDatabase(): Database = Room.databaseBuilder(
        Base.getContext(),
        Database::class.java, Constants.DATABASE_NAME
    )
        /*.addMigrations(MIGRATION_1_2)*/
        .fallbackToDestructiveMigration()
        .build()

   private fun provideCryptocurrenciesDao(
        database: Database
    ): CryptoCurrencyDao = database.cryptocurrenciesDao()


   fun getNetModule(baseUrl: String) = module {

        single {
            HttpLoggingInterceptor(
                HttpLoggingInterceptor.Logger { message ->
                    Logger.d("NETWORK: $message")
                }).apply {
                level = HttpLoggingInterceptor.Level.NONE
            }
        }

        single {
            OkHttpClient.Builder()
                .addInterceptor(get<HttpLoggingInterceptor>())
                .build()
        }


        single {
            Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()
        }

        single {
            Retrofit.Builder()
                .client(get())
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        }

        single { get<Retrofit>().create(ApiInterface::class.java) }
    }

}
