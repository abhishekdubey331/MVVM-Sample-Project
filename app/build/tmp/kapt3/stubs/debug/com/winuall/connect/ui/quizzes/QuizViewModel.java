package com.winuall.connect.ui.quizzes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0019J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/winuall/connect/ui/quizzes/QuizViewModel;", "Landroid/arch/lifecycle/ViewModel;", "quizRepository", "Lcom/winuall/connect/data/repository/QuizRepository;", "(Lcom/winuall/connect/data/repository/QuizRepository;)V", "disposableObserver", "Lio/reactivex/observers/DisposableSingleObserver;", "Lcom/winuall/connect/data/model/QuizResponse;", "quizError", "Landroid/arch/lifecycle/MutableLiveData;", "", "getQuizError", "()Landroid/arch/lifecycle/MutableLiveData;", "setQuizError", "(Landroid/arch/lifecycle/MutableLiveData;)V", "quizLoader", "", "getQuizLoader", "setQuizLoader", "quizResult", "getQuizResult", "setQuizResult", "disposeElements", "", "getQuizzesFromServer", "Landroid/arch/lifecycle/LiveData;", "app_debug"})
public final class QuizViewModel extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<com.winuall.connect.data.model.QuizResponse> quizResult;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.String> quizError;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> quizLoader;
    private io.reactivex.observers.DisposableSingleObserver<com.winuall.connect.data.model.QuizResponse> disposableObserver;
    private final com.winuall.connect.data.repository.QuizRepository quizRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.winuall.connect.data.model.QuizResponse> getQuizResult() {
        return null;
    }
    
    public final void setQuizResult(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<com.winuall.connect.data.model.QuizResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getQuizError() {
        return null;
    }
    
    public final void setQuizError(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getQuizLoader() {
        return null;
    }
    
    public final void setQuizLoader(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.winuall.connect.data.model.QuizResponse> quizResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.String> quizError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Boolean> quizLoader() {
        return null;
    }
    
    public final void getQuizzesFromServer() {
    }
    
    public final void disposeElements() {
    }
    
    public QuizViewModel(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.data.repository.QuizRepository quizRepository) {
        super();
    }
}