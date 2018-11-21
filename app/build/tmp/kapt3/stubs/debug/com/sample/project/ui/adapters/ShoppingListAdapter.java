package com.sample.project.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0018\u00010\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001e\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012J\u0016\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/sample/project/ui/adapters/ShoppingListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/sample/project/ui/adapters/ShoppingListAdapter$ViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/sample/project/ui/dto/ShoppingListDTO;", "context", "Landroid/content/Context;", "listener", "Lcom/sample/project/ui/listeners/RecyclerViewClickListener;", "(Ljava/util/ArrayList;Landroid/content/Context;Lcom/sample/project/ui/listeners/RecyclerViewClickListener;)V", "getContext", "()Landroid/content/Context;", "convertDateTime", "", "date", "Ljava/util/Date;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "restoreItem", "shoppingListItem", "ViewHolder", "app_debug"})
public final class ShoppingListAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.sample.project.ui.adapters.ShoppingListAdapter.ViewHolder> {
    private final java.util.ArrayList<com.sample.project.ui.dto.ShoppingListDTO> list = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.sample.project.ui.listeners.RecyclerViewClickListener listener = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.Nullable()
    com.sample.project.ui.adapters.ShoppingListAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sample.project.ui.adapters.ShoppingListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void removeItem(int position) {
    }
    
    public final void restoreItem(@org.jetbrains.annotations.NotNull()
    com.sample.project.ui.dto.ShoppingListDTO shoppingListItem, int position) {
    }
    
    private final java.lang.String convertDateTime(java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public ShoppingListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sample.project.ui.dto.ShoppingListDTO> list, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.sample.project.ui.listeners.RecyclerViewClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/sample/project/ui/adapters/ShoppingListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "clickListener", "Lcom/sample/project/ui/listeners/RecyclerViewClickListener;", "(Lcom/sample/project/ui/adapters/ShoppingListAdapter;Landroid/view/View;Lcom/sample/project/ui/listeners/RecyclerViewClickListener;)V", "allShoppingListItems", "Landroid/widget/TextView;", "getAllShoppingListItems", "()Landroid/widget/TextView;", "setAllShoppingListItems", "(Landroid/widget/TextView;)V", "completedShoppingListItems", "getCompletedShoppingListItems", "setCompletedShoppingListItems", "name", "getName", "setName", "timestamp", "getTimestamp", "setTimestamp", "viewClickListener", "onClick", "", "v", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView name;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView timestamp;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView completedShoppingListItems;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView allShoppingListItems;
        private com.sample.project.ui.listeners.RecyclerViewClickListener viewClickListener;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTimestamp() {
            return null;
        }
        
        public final void setTimestamp(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCompletedShoppingListItems() {
            return null;
        }
        
        public final void setCompletedShoppingListItems(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getAllShoppingListItems() {
            return null;
        }
        
        public final void setAllShoppingListItems(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.sample.project.ui.listeners.RecyclerViewClickListener clickListener) {
            super(null);
        }
    }
}