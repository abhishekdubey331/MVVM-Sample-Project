package com.sample.project.ui.listeners;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/sample/project/ui/listeners/RecyclerItemTouchHelper;", "Landroid/support/v7/widget/helper/ItemTouchHelper$SimpleCallback;", "dragDirs", "", "swipeDirs", "listener", "Lcom/sample/project/ui/listeners/RecyclerItemTouchHelper$RecyclerItemTouchHelperListener;", "(IILcom/sample/project/ui/listeners/RecyclerItemTouchHelper$RecyclerItemTouchHelperListener;)V", "onMove", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "target", "onSwiped", "", "direction", "RecyclerItemTouchHelperListener", "app_debug"})
public final class RecyclerItemTouchHelper extends android.support.v7.widget.helper.ItemTouchHelper.SimpleCallback {
    private final com.sample.project.ui.listeners.RecyclerItemTouchHelper.RecyclerItemTouchHelperListener listener = null;
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    public RecyclerItemTouchHelper(int dragDirs, int swipeDirs, @org.jetbrains.annotations.NotNull()
    com.sample.project.ui.listeners.RecyclerItemTouchHelper.RecyclerItemTouchHelperListener listener) {
        super(0, 0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/sample/project/ui/listeners/RecyclerItemTouchHelper$RecyclerItemTouchHelperListener;", "", "onSwiped", "", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "direction", "", "position", "app_debug"})
    public static abstract interface RecyclerItemTouchHelperListener {
        
        public abstract void onSwiped(@org.jetbrains.annotations.NotNull()
        android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction, int position);
    }
}