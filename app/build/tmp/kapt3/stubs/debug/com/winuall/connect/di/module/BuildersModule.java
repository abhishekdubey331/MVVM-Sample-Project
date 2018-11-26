package com.winuall.connect.di.module;

import com.winuall.connect.ui.login.LoginActivity;
import com.winuall.connect.ui.quizzes.QuizActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * * Created by Abhishek Dubey on 9.06.2018 at 21:04.
 * * Copyright (c) 2018. All rights reserved.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/winuall/connect/di/module/BuildersModule;", "", "()V", "contributeLoginActivity", "Lcom/winuall/connect/ui/login/LoginActivity;", "contributeQuizActivity", "Lcom/winuall/connect/ui/quizzes/QuizActivity;", "app_debug"})
@dagger.Module()
public abstract class BuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.winuall.connect.ui.login.LoginActivity contributeLoginActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.winuall.connect.ui.quizzes.QuizActivity contributeQuizActivity();
    
    public BuildersModule() {
        super();
    }
}