package com.winuall.connect.di.component;

import com.winuall.connect.App;
import com.winuall.connect.di.module.AppModule;
import com.winuall.connect.di.module.BuildersModule;
import com.winuall.connect.di.module.NetModule;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import javax.inject.Singleton;

/**
 * * Created by Abhishek Dubey on 9.06.2018 at 21:07.
 * * Copyright (c) 2018. All rights reserved.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/winuall/connect/di/component/AppComponent;", "", "inject", "", "app", "Lcom/winuall/connect/App;", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.winuall.connect.di.module.BuildersModule.class, com.winuall.connect.di.module.AppModule.class, com.winuall.connect.di.module.NetModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.App app);
}