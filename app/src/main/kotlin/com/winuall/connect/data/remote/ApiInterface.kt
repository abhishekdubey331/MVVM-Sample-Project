package com.winuall.connect.data.remote

import com.winuall.connect.data.model.CryptoCurrency
import com.winuall.connect.data.model.QuizResponse
import com.winuall.connect.data.model.UserResponse
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.*


/**
 * Created by Abhishek Dubey on 10.06.2018 at 00:14.
 * Copyright (c) 2018. All rights reserved.
 */
interface ApiInterface {

    @GET("ticker/")
    fun getCryptocurrencies(@Query("start") start: String): Observable<List<CryptoCurrency>>


    @FormUrlEncoded
    @POST("/api/auth/login")
    fun makeLoginOnServer(@Field("phone") username: String,
                          @Field("password") password: String) : Single<UserResponse>


    @GET("/api/quizzes?syllabus=0&type=Exam")
    fun getQuizzesForUser(@Header("Authorization")  contentRange:String) : Single<QuizResponse>



}