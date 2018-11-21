package com.sample.project.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001eH\u0016J\u0012\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u001bH\u0014J\b\u0010/\u001a\u00020\u001bH\u0014J \u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/sample/project/ui/ShoppingListActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/sample/project/ui/listeners/RecyclerItemTouchHelper$RecyclerItemTouchHelperListener;", "Lcom/sample/project/ui/listeners/RecyclerViewClickListener;", "()V", "connectivityHelper", "Lcom/sample/project/utils/ConnectivityHelper;", "getConnectivityHelper", "()Lcom/sample/project/utils/ConnectivityHelper;", "connectivityHelper$delegate", "Lkotlin/Lazy;", "dialogCreateNamePositiveButton", "Landroid/widget/Button;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "mAdapter", "Lcom/sample/project/ui/adapters/ShoppingListAdapter;", "shoppingList", "Ljava/util/ArrayList;", "Lcom/sample/project/ui/dto/ShoppingListDTO;", "viewModel", "Lcom/sample/project/ui/ShoppingListViewModel;", "viewModelFactory", "Lcom/sample/project/ui/ViewModelFactory;", "getShoppingListDialog", "Landroid/support/v7/app/AlertDialog;", "goToArchiveListActivity", "", "goToShoppingListDetailsActivity", "id", "", "isArchived", "", "onClick", "view", "Landroid/view/View;", "position", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStart", "onStop", "onSwiped", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "direction", "app_debug"})
public final class ShoppingListActivity extends android.support.v7.app.AppCompatActivity implements com.sample.project.ui.listeners.RecyclerItemTouchHelper.RecyclerItemTouchHelperListener, com.sample.project.ui.listeners.RecyclerViewClickListener {
    private com.sample.project.ui.ViewModelFactory viewModelFactory;
    private com.sample.project.ui.ShoppingListViewModel viewModel;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private java.util.ArrayList<com.sample.project.ui.dto.ShoppingListDTO> shoppingList;
    private com.sample.project.ui.adapters.ShoppingListAdapter mAdapter;
    private android.widget.Button dialogCreateNamePositiveButton;
    private final kotlin.Lazy connectivityHelper$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.sample.project.utils.ConnectivityHelper getConnectivityHelper() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void goToArchiveListActivity() {
    }
    
    private final void goToShoppingListDetailsActivity(int id, boolean isArchived) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction, int position) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final android.support.v7.app.AlertDialog getShoppingListDialog() {
        return null;
    }
    
    public ShoppingListActivity() {
        super();
    }
}