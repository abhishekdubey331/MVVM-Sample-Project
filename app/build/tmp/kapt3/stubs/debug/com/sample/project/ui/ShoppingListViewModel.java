package com.sample.project.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0015\u001a\u00020\u000fJ\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J(\u0010\u001c\u001a\u00020\u00062\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u001ej\b\u0012\u0004\u0012\u00020\u001a`\u001f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/sample/project/ui/ShoppingListViewModel;", "Landroid/arch/lifecycle/ViewModel;", "dataSource", "Lcom/sample/project/db/ShoppingListDao;", "(Lcom/sample/project/db/ShoppingListDao;)V", "archiveItem", "", "deletedShoppingListItem", "Lcom/sample/project/ui/dto/ShoppingListDTO;", "createShoppingList", "listName", "", "createShoppingListItem", "itemName", "shoppingListId", "", "getArchivedLists", "Lio/reactivex/Flowable;", "", "Lcom/sample/project/db/ShoppingList;", "getShoppingList", "id", "getShoppingLists", "reArchiveItem", "removeShoppingListItem", "deletedItem", "Lcom/sample/project/ui/dto/ShoppingListElementDTO;", "restoreShoppingListItem", "updateShoppingList", "shoppingList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class ShoppingListViewModel extends android.arch.lifecycle.ViewModel {
    private final com.sample.project.db.ShoppingListDao dataSource = null;
    
    public final void createShoppingList(@org.jetbrains.annotations.NotNull()
    java.lang.String listName) {
    }
    
    public final void createShoppingListItem(@org.jetbrains.annotations.NotNull()
    java.lang.String itemName, int shoppingListId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<com.sample.project.db.ShoppingList>> getShoppingLists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<com.sample.project.db.ShoppingList>> getArchivedLists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.sample.project.db.ShoppingList> getShoppingList(int id) {
        return null;
    }
    
    public final void archiveItem(@org.jetbrains.annotations.NotNull()
    com.sample.project.ui.dto.ShoppingListDTO deletedShoppingListItem) {
    }
    
    public final void reArchiveItem(@org.jetbrains.annotations.NotNull()
    com.sample.project.ui.dto.ShoppingListDTO deletedShoppingListItem) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void removeShoppingListItem(@org.jetbrains.annotations.NotNull()
    com.sample.project.ui.dto.ShoppingListElementDTO deletedItem, int shoppingListId) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void restoreShoppingListItem(@org.jetbrains.annotations.NotNull()
    com.sample.project.ui.dto.ShoppingListElementDTO deletedItem, int shoppingListId) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void updateShoppingList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sample.project.ui.dto.ShoppingListElementDTO> shoppingList, int shoppingListId) {
    }
    
    public ShoppingListViewModel(@org.jetbrains.annotations.NotNull()
    com.sample.project.db.ShoppingListDao dataSource) {
        super();
    }
}