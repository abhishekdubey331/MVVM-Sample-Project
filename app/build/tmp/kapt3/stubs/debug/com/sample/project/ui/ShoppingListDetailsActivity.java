package com.sample.project.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u001bH\u0014J\b\u0010\"\u001a\u00020\u001bH\u0014J\b\u0010#\u001a\u00020\rH\u0016J \u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/sample/project/ui/ShoppingListDetailsActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/sample/project/ui/listeners/RecyclerItemTouchHelper$RecyclerItemTouchHelperListener;", "Lcom/sample/project/ui/listeners/ShoppingItemCheckboxListener;", "()V", "dialogCreateNamePositiveButton", "Landroid/widget/Button;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "intExtra", "", "Ljava/lang/Integer;", "isArchived", "", "Ljava/lang/Boolean;", "mAdapter", "Lcom/sample/project/ui/adapters/ShoppingListDetailsAdapter;", "shoppingList", "Ljava/util/ArrayList;", "Lcom/sample/project/ui/dto/ShoppingListElementDTO;", "viewModel", "Lcom/sample/project/ui/ShoppingListViewModel;", "viewModelFactory", "Lcom/sample/project/ui/ViewModelFactory;", "getShoppingListDialog", "Landroid/support/v7/app/AlertDialog;", "onClick", "", "position", "isChecked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onSupportNavigateUp", "onSwiped", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "direction", "app_debug"})
public final class ShoppingListDetailsActivity extends android.support.v7.app.AppCompatActivity implements com.sample.project.ui.listeners.RecyclerItemTouchHelper.RecyclerItemTouchHelperListener, com.sample.project.ui.listeners.ShoppingItemCheckboxListener {
    private com.sample.project.ui.ViewModelFactory viewModelFactory;
    private com.sample.project.ui.ShoppingListViewModel viewModel;
    private java.lang.Integer intExtra;
    private java.lang.Boolean isArchived;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private java.util.ArrayList<com.sample.project.ui.dto.ShoppingListElementDTO> shoppingList;
    private com.sample.project.ui.adapters.ShoppingListDetailsAdapter mAdapter;
    private android.widget.Button dialogCreateNamePositiveButton;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final android.support.v7.app.AlertDialog getShoppingListDialog() {
        return null;
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    public void onClick(int position, boolean isChecked) {
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction, int position) {
    }
    
    public ShoppingListDetailsActivity() {
        super();
    }
}