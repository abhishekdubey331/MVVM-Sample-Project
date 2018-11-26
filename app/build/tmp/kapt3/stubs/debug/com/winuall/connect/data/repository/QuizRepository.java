package com.winuall.connect.data.repository;

import com.pixplicity.easyprefs.library.Prefs;
import com.winuall.connect.data.model.QuizResponse;
import com.winuall.connect.data.remote.ApiInterface;
import com.winuall.connect.utils.Utils;
import io.reactivex.Single;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/winuall/connect/data/repository/QuizRepository;", "", "apiInterface", "Lcom/winuall/connect/data/remote/ApiInterface;", "utils", "Lcom/winuall/connect/utils/Utils;", "(Lcom/winuall/connect/data/remote/ApiInterface;Lcom/winuall/connect/utils/Utils;)V", "getQuizzes", "Lio/reactivex/Single;", "Lcom/winuall/connect/data/model/QuizResponse;", "getQuizzesFromServer", "app_debug"})
public final class QuizRepository {
    private final com.winuall.connect.data.remote.ApiInterface apiInterface = null;
    private final com.winuall.connect.utils.Utils utils = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.Single<com.winuall.connect.data.model.QuizResponse> getQuizzesFromServer() {
        return null;
    }
    
    private final io.reactivex.Single<com.winuall.connect.data.model.QuizResponse> getQuizzes() {
        return null;
    }
    
    @javax.inject.Inject()
    public QuizRepository(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.data.remote.ApiInterface apiInterface, @org.jetbrains.annotations.NotNull()
    com.winuall.connect.utils.Utils utils) {
        super();
    }
}