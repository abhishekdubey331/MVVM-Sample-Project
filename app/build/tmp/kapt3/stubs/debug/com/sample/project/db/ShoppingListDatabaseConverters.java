package com.sample.project.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010H\u0007J \u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/sample/project/db/ShoppingListDatabaseConverters;", "", "()V", "dateToTimestamp", "", "date", "Ljava/util/Date;", "(Ljava/util/Date;)Ljava/lang/Long;", "fromTimestamp", "value", "(Ljava/lang/Long;)Ljava/util/Date;", "shoppingListItemsToString", "", "list", "Ljava/util/ArrayList;", "Lcom/sample/project/db/ShoppingListItem;", "Lkotlin/collections/ArrayList;", "stringToShoppingListItems", "json", "app_debug"})
public final class ShoppingListDatabaseConverters {
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public final java.util.Date fromTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public final java.lang.Long dateToTimestamp(@org.jetbrains.annotations.Nullable()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public final java.util.ArrayList<com.sample.project.db.ShoppingListItem> stringToShoppingListItems(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public final java.lang.String shoppingListItemsToString(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sample.project.db.ShoppingListItem> list) {
        return null;
    }
    
    public ShoppingListDatabaseConverters() {
        super();
    }
}