package com.sample.project.db;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/sample/project/db/ShoppingListDao;", "", "archiveShoppingList", "", "id", "", "getActiveShoppingLists", "Lio/reactivex/Flowable;", "", "Lcom/sample/project/db/ShoppingList;", "getArchivedShoppingLists", "getShoppingList", "insertShoppingList", "shoppingList", "reArchiveShoppingList", "updateShoppingList", "app_debug"})
public abstract interface ShoppingListDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM shopping_list where id = :id limit 1")
    public abstract io.reactivex.Flowable<com.sample.project.db.ShoppingList> getShoppingList(int id);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM shopping_list where not is_archived")
    public abstract io.reactivex.Flowable<java.util.List<com.sample.project.db.ShoppingList>> getActiveShoppingLists();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM shopping_list where is_archived")
    public abstract io.reactivex.Flowable<java.util.List<com.sample.project.db.ShoppingList>> getArchivedShoppingLists();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertShoppingList(@org.jetbrains.annotations.NotNull()
    com.sample.project.db.ShoppingList shoppingList);
    
    @android.arch.persistence.room.Update()
    public abstract void updateShoppingList(@org.jetbrains.annotations.NotNull()
    com.sample.project.db.ShoppingList shoppingList);
    
    @android.arch.persistence.room.Query(value = "UPDATE shopping_list SET is_archived = 1 where id = :id")
    public abstract void archiveShoppingList(int id);
    
    @android.arch.persistence.room.Query(value = "UPDATE shopping_list SET  is_archived = 0 where id = :id")
    public abstract void reArchiveShoppingList(int id);
}