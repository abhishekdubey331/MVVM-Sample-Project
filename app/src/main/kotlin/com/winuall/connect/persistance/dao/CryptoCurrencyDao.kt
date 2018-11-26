package com.winuall.connect.persistance.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.winuall.connect.data.model.CryptoCurrency
import io.reactivex.Single

/**
 * Created by Abhishek Dubey on 9.06.2018 at 23:58.
 * Copyright (c) 2018. All rights reserved.
 */
@Dao
interface CryptoCurrencyDao {

  @Query("SELECT * FROM cryptoCurrencies ORDER BY rank limit :limit offset :offset")
  fun queryCryptocurrencies(limit: Int, offset: Int): Single<List<CryptoCurrency>>

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun insertCryptocurrency(cryptoCurrency: CryptoCurrency)

  @Insert(
      onConflict = OnConflictStrategy.REPLACE
  )
  fun insertAllCryptocurrencies(cryptoCurrencies: List<CryptoCurrency>)
}