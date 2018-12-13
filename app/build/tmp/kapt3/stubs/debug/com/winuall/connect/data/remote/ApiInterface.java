package com.winuall.connect.data.remote;

import java.lang.System;

/**
 * * Created by Abhishek Dubey on 10.06.2018 at 00:14.
 * * Copyright (c) 2018. All rights reserved.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t2\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0007H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/winuall/connect/data/remote/ApiInterface;", "", "getCryptocurrencies", "Lio/reactivex/Observable;", "", "Lcom/winuall/connect/data/model/CryptoCurrency;", "start", "", "getQuizzesForUser", "Lio/reactivex/Single;", "Lcom/winuall/connect/data/model/QuizResponse;", "contentRange", "makeLoginOnServer", "Lcom/winuall/connect/data/model/UserResponse;", "username", "password", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "ticker/")
    public abstract io.reactivex.Observable<java.util.List<com.winuall.connect.data.model.CryptoCurrency>> getCryptocurrencies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "start")
    java.lang.String start);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "auth/login")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Single<com.winuall.connect.data.model.UserResponse> makeLoginOnServer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "phone")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "quizzes?syllabus=0&type=Exam")
    public abstract io.reactivex.Single<com.winuall.connect.data.model.QuizResponse> getQuizzesForUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String contentRange);
}