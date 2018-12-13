package com.winuall.connect.persistance.dao;

import java.lang.System;

/**
 * * Created by Abhishek Dubey on 9.06.2018 at 23:58.
 * * Copyright (c) 2018. All rights reserved.
 */
@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/winuall/connect/persistance/dao/CryptoCurrencyDao;", "", "insertAllCryptocurrencies", "", "cryptoCurrencies", "", "Lcom/winuall/connect/data/model/CryptoCurrency;", "insertCryptocurrency", "cryptoCurrency", "queryCryptocurrencies", "Lio/reactivex/Single;", "limit", "", "offset", "app_debug"})
public abstract interface CryptoCurrencyDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM cryptoCurrencies ORDER BY rank limit :limit offset :offset")
    public abstract io.reactivex.Single<java.util.List<com.winuall.connect.data.model.CryptoCurrency>> queryCryptocurrencies(int limit, int offset);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertCryptocurrency(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.data.model.CryptoCurrency cryptoCurrency);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllCryptocurrencies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.winuall.connect.data.model.CryptoCurrency> cryptoCurrencies);
}