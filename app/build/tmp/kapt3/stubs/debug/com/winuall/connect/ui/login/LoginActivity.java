package com.winuall.connect.ui.login;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.orhanobut.logger.Logger;
import com.pixplicity.easyprefs.library.Prefs;
import dagger.android.AndroidInjection;
import com.winuall.connect.R;
import com.winuall.connect.data.model.UserResponse;
import com.winuall.connect.ui.quizzes.QuizActivity;
import com.winuall.connect.utils.Utils;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/winuall/connect/ui/login/LoginActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "loginViewModel", "Lcom/winuall/connect/ui/login/LoginViewModel;", "loginViewModelFactory", "Lcom/winuall/connect/ui/login/LoginViewModelFactory;", "getLoginViewModelFactory", "()Lcom/winuall/connect/ui/login/LoginViewModelFactory;", "setLoginViewModelFactory", "(Lcom/winuall/connect/ui/login/LoginViewModelFactory;)V", "utils", "Lcom/winuall/connect/utils/Utils;", "getUtils", "()Lcom/winuall/connect/utils/Utils;", "setUtils", "(Lcom/winuall/connect/utils/Utils;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_debug"})
public final class LoginActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.winuall.connect.ui.login.LoginViewModelFactory loginViewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.winuall.connect.utils.Utils utils;
    private com.winuall.connect.ui.login.LoginViewModel loginViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.winuall.connect.ui.login.LoginViewModelFactory getLoginViewModelFactory() {
        return null;
    }
    
    public final void setLoginViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.ui.login.LoginViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.winuall.connect.utils.Utils getUtils() {
        return null;
    }
    
    public final void setUtils(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.utils.Utils p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public LoginActivity() {
        super();
    }
}