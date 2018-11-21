package com.sample.project.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001e\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0018\u00010\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u001e\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0015J\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\""}, d2 = {"Lcom/sample/project/ui/adapters/ShoppingListDetailsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/sample/project/ui/adapters/ShoppingListDetailsAdapter$ViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/sample/project/ui/dto/ShoppingListElementDTO;", "context", "Landroid/content/Context;", "listener", "Lcom/sample/project/ui/listeners/ShoppingItemCheckboxListener;", "isArchived", "", "(Ljava/util/ArrayList;Landroid/content/Context;Lcom/sample/project/ui/listeners/ShoppingItemCheckboxListener;Z)V", "getContext", "()Landroid/content/Context;", "()Z", "getList", "()Ljava/util/ArrayList;", "getListener", "()Lcom/sample/project/ui/listeners/ShoppingItemCheckboxListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "restoreItem", "item", "ViewHolder", "app_debug"})
public final class ShoppingListDetailsAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.sample.project.ui.adapters.ShoppingListDetailsAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.sample.project.ui.dto.ShoppingListElementDTO> list = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sample.project.ui.listeners.ShoppingItemCheckboxListener listener = null;
    private final boolean isArchived = false;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sample.project.ui.adapters.ShoppingListDetailsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.Nullable()
    com.sample.project.ui.adapters.ShoppingListDetailsAdapter.ViewHolder holder, int position) {
    }
    
    public final void removeItem(int position) {
    }
    
    public final void restoreItem(@org.jetbrains.annotations.NotNull()
    com.sample.project.ui.dto.ShoppingListElementDTO item, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sample.project.ui.dto.ShoppingListElementDTO> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.project.ui.listeners.ShoppingItemCheckboxListener getListener() {
        return null;
    }
    
    public final boolean isArchived() {
        return false;
    }
    
    public ShoppingListDetailsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sample.project.ui.dto.ShoppingListElementDTO> list, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.sample.project.ui.listeners.ShoppingItemCheckboxListener listener, boolean isArchived) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/sample/project/ui/adapters/ShoppingListDetailsAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/sample/project/ui/adapters/ShoppingListDetailsAdapter;Landroid/view/View;)V", "isCompleted", "Landroid/widget/CheckBox;", "()Landroid/widget/CheckBox;", "setCompleted", "(Landroid/widget/CheckBox;)V", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "viewClickListener", "Lcom/sample/project/ui/listeners/ShoppingItemCheckboxListener;", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView name;
        @org.jetbrains.annotations.NotNull()
        private android.widget.CheckBox isCompleted;
        private com.sample.project.ui.listeners.ShoppingItemCheckboxListener viewClickListener;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox isCompleted() {
            return null;
        }
        
        public final void setCompleted(@org.jetbrains.annotations.NotNull()
        android.widget.CheckBox p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}