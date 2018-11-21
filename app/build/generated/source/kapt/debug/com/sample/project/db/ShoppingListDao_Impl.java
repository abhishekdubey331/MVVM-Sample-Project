package com.sample.project.db;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.RxRoom;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public class ShoppingListDao_Impl implements ShoppingListDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfShoppingList;

  private final ShoppingListDatabaseConverters __shoppingListDatabaseConverters = new ShoppingListDatabaseConverters();

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfShoppingList;

  private final SharedSQLiteStatement __preparedStmtOfArchiveShoppingList;

  private final SharedSQLiteStatement __preparedStmtOfReArchiveShoppingList;

  public ShoppingListDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfShoppingList = new EntityInsertionAdapter<ShoppingList>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `shopping_list`(`id`,`name`,`is_archived`,`timestamp`,`items`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ShoppingList value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final int _tmp;
        _tmp = value.isArchived() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        final Long _tmp_1;
        _tmp_1 = __shoppingListDatabaseConverters.dateToTimestamp(value.getTimestamp());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __shoppingListDatabaseConverters.shoppingListItemsToString(value.getItems());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
      }
    };
    this.__updateAdapterOfShoppingList = new EntityDeletionOrUpdateAdapter<ShoppingList>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `shopping_list` SET `id` = ?,`name` = ?,`is_archived` = ?,`timestamp` = ?,`items` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ShoppingList value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final int _tmp;
        _tmp = value.isArchived() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        final Long _tmp_1;
        _tmp_1 = __shoppingListDatabaseConverters.dateToTimestamp(value.getTimestamp());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __shoppingListDatabaseConverters.shoppingListItemsToString(value.getItems());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        stmt.bindLong(6, value.getId());
      }
    };
    this.__preparedStmtOfArchiveShoppingList = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE shopping_list SET is_archived = 1 where id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfReArchiveShoppingList = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE shopping_list SET  is_archived = 0 where id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertShoppingList(ShoppingList shoppingList) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfShoppingList.insert(shoppingList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateShoppingList(ShoppingList shoppingList) {
    __db.beginTransaction();
    try {
      __updateAdapterOfShoppingList.handle(shoppingList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void archiveShoppingList(int id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfArchiveShoppingList.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, id);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfArchiveShoppingList.release(_stmt);
    }
  }

  @Override
  public void reArchiveShoppingList(int id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfReArchiveShoppingList.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, id);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfReArchiveShoppingList.release(_stmt);
    }
  }

  @Override
  public Flowable<ShoppingList> getShoppingList(int id) {
    final String _sql = "SELECT * FROM shopping_list where id = ? limit 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createFlowable(__db, new String[]{"shopping_list"}, new Callable<ShoppingList>() {
      @Override
      public ShoppingList call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfIsArchived = _cursor.getColumnIndexOrThrow("is_archived");
          final int _cursorIndexOfTimestamp = _cursor.getColumnIndexOrThrow("timestamp");
          final int _cursorIndexOfItems = _cursor.getColumnIndexOrThrow("items");
          final ShoppingList _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final boolean _tmpIsArchived;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsArchived);
            _tmpIsArchived = _tmp != 0;
            final Date _tmpTimestamp;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            _tmpTimestamp = __shoppingListDatabaseConverters.fromTimestamp(_tmp_1);
            final ArrayList<ShoppingListItem> _tmpItems;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfItems);
            _tmpItems = __shoppingListDatabaseConverters.stringToShoppingListItems(_tmp_2);
            _result = new ShoppingList(_tmpId,_tmpName,_tmpIsArchived,_tmpTimestamp,_tmpItems);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<ShoppingList>> getActiveShoppingLists() {
    final String _sql = "SELECT * FROM shopping_list where not is_archived";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"shopping_list"}, new Callable<List<ShoppingList>>() {
      @Override
      public List<ShoppingList> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfIsArchived = _cursor.getColumnIndexOrThrow("is_archived");
          final int _cursorIndexOfTimestamp = _cursor.getColumnIndexOrThrow("timestamp");
          final int _cursorIndexOfItems = _cursor.getColumnIndexOrThrow("items");
          final List<ShoppingList> _result = new ArrayList<ShoppingList>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ShoppingList _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final boolean _tmpIsArchived;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsArchived);
            _tmpIsArchived = _tmp != 0;
            final Date _tmpTimestamp;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            _tmpTimestamp = __shoppingListDatabaseConverters.fromTimestamp(_tmp_1);
            final ArrayList<ShoppingListItem> _tmpItems;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfItems);
            _tmpItems = __shoppingListDatabaseConverters.stringToShoppingListItems(_tmp_2);
            _item = new ShoppingList(_tmpId,_tmpName,_tmpIsArchived,_tmpTimestamp,_tmpItems);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<ShoppingList>> getArchivedShoppingLists() {
    final String _sql = "SELECT * FROM shopping_list where is_archived";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"shopping_list"}, new Callable<List<ShoppingList>>() {
      @Override
      public List<ShoppingList> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfIsArchived = _cursor.getColumnIndexOrThrow("is_archived");
          final int _cursorIndexOfTimestamp = _cursor.getColumnIndexOrThrow("timestamp");
          final int _cursorIndexOfItems = _cursor.getColumnIndexOrThrow("items");
          final List<ShoppingList> _result = new ArrayList<ShoppingList>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ShoppingList _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final boolean _tmpIsArchived;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsArchived);
            _tmpIsArchived = _tmp != 0;
            final Date _tmpTimestamp;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            _tmpTimestamp = __shoppingListDatabaseConverters.fromTimestamp(_tmp_1);
            final ArrayList<ShoppingListItem> _tmpItems;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfItems);
            _tmpItems = __shoppingListDatabaseConverters.stringToShoppingListItems(_tmp_2);
            _item = new ShoppingList(_tmpId,_tmpName,_tmpIsArchived,_tmpTimestamp,_tmpItems);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
