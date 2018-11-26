package com.winuall.connect.data.repository;

import com.orhanobut.logger.Logger;
import com.winuall.connect.data.model.CryptoCurrency;
import com.winuall.connect.data.remote.ApiInterface;
import com.winuall.connect.persistance.dao.CryptoCurrencyDao;
import com.winuall.connect.utils.Constants;
import com.winuall.connect.utils.Utils;
import io.reactivex.Observable;
import javax.inject.Inject;

/**
 * * Created by Abhishek Dubey on 10.06.2018 at 00:37.
 * * Copyright (c) 2018. All rights reserved.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0002J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/winuall/connect/data/repository/CryptoCurrencyRepository;", "", "apiInterface", "Lcom/winuall/connect/data/remote/ApiInterface;", "cryptoCurrencyDao", "Lcom/winuall/connect/persistance/dao/CryptoCurrencyDao;", "utils", "Lcom/winuall/connect/utils/Utils;", "(Lcom/winuall/connect/data/remote/ApiInterface;Lcom/winuall/connect/persistance/dao/CryptoCurrencyDao;Lcom/winuall/connect/utils/Utils;)V", "getCryptocurrencies", "Lio/reactivex/Observable;", "", "Lcom/winuall/connect/data/model/CryptoCurrency;", "limit", "", "offset", "getCryptocurrenciesFromApi", "getCryptocurrenciesFromDb", "app_debug"})
public final class CryptoCurrencyRepository {
    private final com.winuall.connect.data.remote.ApiInterface apiInterface = null;
    private final com.winuall.connect.persistance.dao.CryptoCurrencyDao cryptoCurrencyDao = null;
    private final com.winuall.connect.utils.Utils utils = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.winuall.connect.data.model.CryptoCurrency>> getCryptocurrencies(int limit, int offset) {
        return null;
    }
    
    private final io.reactivex.Observable<java.util.List<com.winuall.connect.data.model.CryptoCurrency>> getCryptocurrenciesFromApi() {
        return null;
    }
    
    private final io.reactivex.Observable<java.util.List<com.winuall.connect.data.model.CryptoCurrency>> getCryptocurrenciesFromDb(int limit, int offset) {
        return null;
    }
    
    @javax.inject.Inject()
    public CryptoCurrencyRepository(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.data.remote.ApiInterface apiInterface, @org.jetbrains.annotations.NotNull()
    com.winuall.connect.persistance.dao.CryptoCurrencyDao cryptoCurrencyDao, @org.jetbrains.annotations.NotNull()
    com.winuall.connect.utils.Utils utils) {
        super();
    }
}