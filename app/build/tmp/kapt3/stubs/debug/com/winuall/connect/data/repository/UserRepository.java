package com.winuall.connect.data.repository;

import com.winuall.connect.data.model.UserResponse;
import com.winuall.connect.data.remote.ApiInterface;
import com.winuall.connect.utils.Utils;
import io.reactivex.Observable;
import io.reactivex.Single;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/winuall/connect/data/repository/UserRepository;", "", "apiInterface", "Lcom/winuall/connect/data/remote/ApiInterface;", "utils", "Lcom/winuall/connect/utils/Utils;", "(Lcom/winuall/connect/data/remote/ApiInterface;Lcom/winuall/connect/utils/Utils;)V", "loginUser", "Lio/reactivex/Single;", "Lcom/winuall/connect/data/model/UserResponse;", "userName", "", "password", "makeLoginOnServer", "app_debug"})
public final class UserRepository {
    private final com.winuall.connect.data.remote.ApiInterface apiInterface = null;
    private final com.winuall.connect.utils.Utils utils = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.Single<com.winuall.connect.data.model.UserResponse> makeLoginOnServer(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    private final io.reactivex.Single<com.winuall.connect.data.model.UserResponse> loginUser(java.lang.String userName, java.lang.String password) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.data.remote.ApiInterface apiInterface, @org.jetbrains.annotations.NotNull()
    com.winuall.connect.utils.Utils utils) {
        super();
    }
}