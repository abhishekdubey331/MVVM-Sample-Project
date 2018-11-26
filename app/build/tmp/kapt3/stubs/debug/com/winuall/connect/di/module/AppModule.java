package com.winuall.connect.di.module;

import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.migration.Migration;
import com.pixplicity.easyprefs.library.Prefs;
import com.winuall.connect.persistance.dao.CryptoCurrencyDao;
import com.winuall.connect.persistance.local.Database;
import com.winuall.connect.ui.login.LoginViewModelFactory;
import com.winuall.connect.ui.quizzes.QuizViewModelFactory;
import com.winuall.connect.utils.Constants;
import com.winuall.connect.utils.Utils;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * * Created by Abhishek Dubey on 9.06.2018 at 21:05.
 * * Copyright (c) 2018. All rights reserved.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/winuall/connect/di/module/AppModule;", "", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "provideApplication", "provideCryptocurrenciesDao", "Lcom/winuall/connect/persistance/dao/CryptoCurrencyDao;", "database", "Lcom/winuall/connect/persistance/local/Database;", "provideCryptocurrenciesDatabase", "provideLoginViewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/winuall/connect/ui/login/LoginViewModelFactory;", "provideQuizViewModelFactory", "Lcom/winuall/connect/ui/quizzes/QuizViewModelFactory;", "provideUtils", "Lcom/winuall/connect/utils/Utils;", "Companion", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final android.app.Application app = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.arch.persistence.room.migration.Migration MIGRATION_1_2 = null;
    public static final com.winuall.connect.di.module.AppModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.app.Application provideApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.winuall.connect.persistance.local.Database provideCryptocurrenciesDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.winuall.connect.persistance.dao.CryptoCurrencyDao provideCryptocurrenciesDao(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.persistance.local.Database database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.arch.lifecycle.ViewModelProvider.Factory provideLoginViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.ui.login.LoginViewModelFactory factory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.arch.lifecycle.ViewModelProvider.Factory provideQuizViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.ui.quizzes.QuizViewModelFactory factory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.winuall.connect.utils.Utils provideUtils() {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/winuall/connect/di/module/AppModule$Companion;", "", "()V", "MIGRATION_1_2", "Landroid/arch/persistence/room/migration/Migration;", "getMIGRATION_1_2", "()Landroid/arch/persistence/room/migration/Migration;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.arch.persistence.room.migration.Migration getMIGRATION_1_2() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}