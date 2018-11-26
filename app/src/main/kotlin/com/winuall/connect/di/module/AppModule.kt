package com.winuall.connect.di.module

import android.app.Application
import android.arch.lifecycle.ViewModelProvider
import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Room
import android.arch.persistence.room.migration.Migration
import com.pixplicity.easyprefs.library.Prefs
import com.winuall.connect.persistance.dao.CryptoCurrencyDao
import com.winuall.connect.persistance.local.Database
import com.winuall.connect.ui.login.LoginViewModelFactory
import com.winuall.connect.ui.quizzes.QuizViewModelFactory
import com.winuall.connect.utils.Constants
import com.winuall.connect.utils.Utils
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Abhishek Dubey on 9.06.2018 at 21:05.
 * Copyright (c) 2018. All rights reserved.
 */

@Module
class AppModule(private val app: Application) {
  companion object {
    val MIGRATION_1_2: Migration = object : Migration(1, 2) {
      override fun migrate(database: SupportSQLiteDatabase) {
        // Change the table name to the correct one
        database.execSQL("ALTER TABLE cryptocurrency RENAME TO cryptoCurrencies")
      }
    }
  }

  @Provides
  @Singleton
  fun provideApplication(): Application = app

  @Provides
  @Singleton
  fun provideCryptocurrenciesDatabase(app: Application): Database = Room.databaseBuilder(app,
      Database::class.java, Constants.DATABASE_NAME)
      /*.addMigrations(MIGRATION_1_2)*/
      .fallbackToDestructiveMigration()
      .build()

  @Provides
  @Singleton
  fun provideCryptocurrenciesDao(
      database: Database): CryptoCurrencyDao = database.cryptocurrenciesDao()



  @Provides
  @Singleton
  fun provideLoginViewModelFactory(
          factory: LoginViewModelFactory): ViewModelProvider.Factory = factory



  @Provides
  @Singleton
  fun provideQuizViewModelFactory(
          factory: QuizViewModelFactory): ViewModelProvider.Factory = factory


  @Provides
  @Singleton
  fun provideUtils(): Utils = Utils(app)

}
