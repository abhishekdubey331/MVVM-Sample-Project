package com.winuall.connect.persistance.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.winuall.connect.data.model.CryptoCurrency
import com.winuall.connect.persistance.dao.CryptoCurrencyDao

/**
 * Created by Abhishek Dubey on 9.06.2018 at 23:59.
 * Copyright (c) 2018. All rights reserved.
 */
@Database(entities = [(CryptoCurrency::class)], version = 1)
abstract class Database : RoomDatabase() {
  abstract fun cryptocurrenciesDao(): CryptoCurrencyDao
}