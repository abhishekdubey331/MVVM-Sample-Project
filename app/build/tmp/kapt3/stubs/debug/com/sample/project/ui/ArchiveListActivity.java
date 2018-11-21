package com.sample.project.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0010H\u0014J\b\u0010\u001d\u001a\u00020\u0010H\u0014J\b\u0010\u001e\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/sample/project/ui/ArchiveListActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/sample/project/ui/listeners/RecyclerViewClickListener;", "()V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "mAdapter", "Lcom/sample/project/ui/adapters/ShoppingListAdapter;", "shoppingList", "Ljava/util/ArrayList;", "Lcom/sample/project/ui/dto/ShoppingListDTO;", "viewModel", "Lcom/sample/project/ui/ShoppingListViewModel;", "viewModelFactory", "Lcom/sample/project/ui/ViewModelFactory;", "goToShoppingListDetailsActivity", "", "id", "", "isArchived", "", "onClick", "view", "Landroid/view/View;", "position", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onSupportNavigateUp", "app_debug"})
public final class ArchiveListActivity extends android.support.v7.app.AppCompatActivity implements com.sample.project.ui.listeners.RecyclerViewClickListener {
    private com.sample.project.ui.ViewModelFactory viewModelFactory;
    private com.sample.project.ui.ShoppingListViewModel viewModel;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private java.util.ArrayList<com.sample.project.ui.dto.ShoppingListDTO> shoppingList;
    private com.sample.project.ui.adapters.ShoppingListAdapter mAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void goToShoppingListDetailsActivity(int id, boolean isArchived) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    public ArchiveListActivity() {
        super();
    }
}