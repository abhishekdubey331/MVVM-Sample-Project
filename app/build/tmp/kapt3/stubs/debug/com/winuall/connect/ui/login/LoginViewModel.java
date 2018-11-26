package com.winuall.connect.ui.login;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.winuall.connect.data.model.UserResponse;
import com.winuall.connect.data.repository.UserRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u001bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/winuall/connect/ui/login/LoginViewModel;", "Landroid/arch/lifecycle/ViewModel;", "userRepository", "Lcom/winuall/connect/data/repository/UserRepository;", "(Lcom/winuall/connect/data/repository/UserRepository;)V", "disposableObserver", "Lio/reactivex/observers/DisposableSingleObserver;", "Lcom/winuall/connect/data/model/UserResponse;", "userError", "Landroid/arch/lifecycle/MutableLiveData;", "", "getUserError", "()Landroid/arch/lifecycle/MutableLiveData;", "setUserError", "(Landroid/arch/lifecycle/MutableLiveData;)V", "userLoader", "", "getUserLoader", "setUserLoader", "userResult", "getUserResult", "setUserResult", "disposeElements", "", "makeLoginOnServer", "userName", "password", "Landroid/arch/lifecycle/LiveData;", "app_debug"})
public final class LoginViewModel extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<com.winuall.connect.data.model.UserResponse> userResult;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.String> userError;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> userLoader;
    private io.reactivex.observers.DisposableSingleObserver<com.winuall.connect.data.model.UserResponse> disposableObserver;
    private final com.winuall.connect.data.repository.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.winuall.connect.data.model.UserResponse> getUserResult() {
        return null;
    }
    
    public final void setUserResult(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<com.winuall.connect.data.model.UserResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getUserError() {
        return null;
    }
    
    public final void setUserError(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getUserLoader() {
        return null;
    }
    
    public final void setUserLoader(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.winuall.connect.data.model.UserResponse> userResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.String> userError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Boolean> userLoader() {
        return null;
    }
    
    public final void makeLoginOnServer(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void disposeElements() {
    }
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.data.repository.UserRepository userRepository) {
        super();
    }
}