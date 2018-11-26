package com.winuall.connect.ui.quizzes;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.orhanobut.logger.Logger;
import com.winuall.connect.R;
import com.winuall.connect.data.model.QuizResponse;
import dagger.android.AndroidInjection;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/winuall/connect/ui/quizzes/QuizActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "quizViewModel", "Lcom/winuall/connect/ui/quizzes/QuizViewModel;", "quizViewModelFactory", "Lcom/winuall/connect/ui/quizzes/QuizViewModelFactory;", "getQuizViewModelFactory", "()Lcom/winuall/connect/ui/quizzes/QuizViewModelFactory;", "setQuizViewModelFactory", "(Lcom/winuall/connect/ui/quizzes/QuizViewModelFactory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_debug"})
public final class QuizActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.winuall.connect.ui.quizzes.QuizViewModelFactory quizViewModelFactory;
    private com.winuall.connect.ui.quizzes.QuizViewModel quizViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.winuall.connect.ui.quizzes.QuizViewModelFactory getQuizViewModelFactory() {
        return null;
    }
    
    public final void setQuizViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.winuall.connect.ui.quizzes.QuizViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public QuizActivity() {
        super();
    }
}