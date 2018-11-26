package com.winuall.connect.persistance.local;

import android.arch.persistence.room.RoomDatabase;
import com.winuall.connect.data.model.CryptoCurrency;
import com.winuall.connect.persistance.dao.CryptoCurrencyDao;

/**
 * * Created by Abhishek Dubey on 9.06.2018 at 23:59.
 * * Copyright (c) 2018. All rights reserved.
 */
@android.arch.persistence.room.Database(entities = {com.winuall.connect.data.model.CryptoCurrency.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/winuall/connect/persistance/local/Database;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "cryptocurrenciesDao", "Lcom/winuall/connect/persistance/dao/CryptoCurrencyDao;", "app_debug"})
public abstract class Database extends android.arch.persistence.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.winuall.connect.persistance.dao.CryptoCurrencyDao cryptocurrenciesDao();
    
    public Database() {
        super();
    }
}