package com.winuall.connect.data.repository

import com.orhanobut.logger.Logger
import com.winuall.connect.data.model.CryptoCurrency
import com.winuall.connect.data.remote.ApiInterface
import com.winuall.connect.persistance.dao.CryptoCurrencyDao
import com.winuall.connect.utils.Constants
import com.winuall.connect.utils.Utils
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by Abhishek Dubey on 10.06.2018 at 00:37.
 * Copyright (c) 2018. All rights reserved.
 */
class CryptoCurrencyRepository @Inject constructor(private val apiInterface: ApiInterface,
                                                   private val cryptoCurrencyDao: CryptoCurrencyDao, private val utils: Utils) {

  fun getCryptocurrencies(limit: Int, offset: Int): Observable<List<CryptoCurrency>> {
    val hasConnection = utils.isConnectedToInternet()
    var observableFromApi: Observable<List<CryptoCurrency>>? = null
    if (hasConnection) {
      observableFromApi = getCryptocurrenciesFromApi()
    }
    val observableFromDb = getCryptocurrenciesFromDb(limit, offset)

    return if (hasConnection) Observable.concatArrayEager(observableFromApi, observableFromDb)
    else observableFromDb
  }

  private fun getCryptocurrenciesFromApi(): Observable<List<CryptoCurrency>> {
    return apiInterface.getCryptocurrencies(Constants.START_ZERO_VALUE)
        .doOnNext {
          Logger.e(it.size.toString())
          for (item in it) {
            cryptoCurrencyDao.insertCryptocurrency(item)
          }
        }
  }

  private fun getCryptocurrenciesFromDb(limit: Int, offset: Int): Observable<List<CryptoCurrency>> {
    return cryptoCurrencyDao.queryCryptocurrencies(limit, offset)
        .toObservable()
        .doOnNext {
          Logger.e(it.size.toString())
        }
  }
}