package com.winuall.connect.persistance.local;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import com.winuall.connect.persistance.dao.CryptoCurrencyDao;
import com.winuall.connect.persistance.dao.CryptoCurrencyDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class Database_Impl extends Database {
  private volatile CryptoCurrencyDao _cryptoCurrencyDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `cryptoCurrencies` (`id` TEXT NOT NULL, `name` TEXT, `symbol` TEXT NOT NULL, `rank` INTEGER NOT NULL, `price_usd` REAL, `price_btc` TEXT, `24h_volume_usd` TEXT, `market_cap_usd` TEXT, `available_supply` TEXT, `total_supply` TEXT, `max_supply` TEXT, `percent_change_1h` TEXT, `percent_change_24h` TEXT, `percent_change_7d` TEXT, `last_updated` REAL NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"4113619787830a376c487760f153770d\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `cryptoCurrencies`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCryptoCurrencies = new HashMap<String, TableInfo.Column>(15);
        _columnsCryptoCurrencies.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsCryptoCurrencies.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        _columnsCryptoCurrencies.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0));
        _columnsCryptoCurrencies.put("rank", new TableInfo.Column("rank", "INTEGER", true, 0));
        _columnsCryptoCurrencies.put("price_usd", new TableInfo.Column("price_usd", "REAL", false, 0));
        _columnsCryptoCurrencies.put("price_btc", new TableInfo.Column("price_btc", "TEXT", false, 0));
        _columnsCryptoCurrencies.put("24h_volume_usd", new TableInfo.Column("24h_volume_usd", "TEXT", false, 0));
        _columnsCryptoCurrencies.put("market_cap_usd", new TableInfo.Column("market_cap_usd", "TEXT", false, 0));
        _columnsCryptoCurrencies.put("available_supply", new TableInfo.Column("available_supply", "TEXT", false, 0));
        _columnsCryptoCurrencies.put("total_supply", new TableInfo.Column("total_supply", "TEXT", false, 0));
        _columnsCryptoCurrencies.put("max_supply", new TableInfo.Column("max_supply", "TEXT", false, 0));
        _columnsCryptoCurrencies.put("percent_change_1h", new TableInfo.Column("percent_change_1h", "TEXT", false, 0));
        _columnsCryptoCurrencies.put("percent_change_24h", new TableInfo.Column("percent_change_24h", "TEXT", false, 0));
        _columnsCryptoCurrencies.put("percent_change_7d", new TableInfo.Column("percent_change_7d", "TEXT", false, 0));
        _columnsCryptoCurrencies.put("last_updated", new TableInfo.Column("last_updated", "REAL", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCryptoCurrencies = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCryptoCurrencies = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCryptoCurrencies = new TableInfo("cryptoCurrencies", _columnsCryptoCurrencies, _foreignKeysCryptoCurrencies, _indicesCryptoCurrencies);
        final TableInfo _existingCryptoCurrencies = TableInfo.read(_db, "cryptoCurrencies");
        if (! _infoCryptoCurrencies.equals(_existingCryptoCurrencies)) {
          throw new IllegalStateException("Migration didn't properly handle cryptoCurrencies(com.winuall.connect.data.model.CryptoCurrency).\n"
                  + " Expected:\n" + _infoCryptoCurrencies + "\n"
                  + " Found:\n" + _existingCryptoCurrencies);
        }
      }
    }, "4113619787830a376c487760f153770d", "a0aea9bdf202bcb1ebce7a8ea0b77e1d");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "cryptoCurrencies");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `cryptoCurrencies`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CryptoCurrencyDao cryptocurrenciesDao() {
    if (_cryptoCurrencyDao != null) {
      return _cryptoCurrencyDao;
    } else {
      synchronized(this) {
        if(_cryptoCurrencyDao == null) {
          _cryptoCurrencyDao = new CryptoCurrencyDao_Impl(this);
        }
        return _cryptoCurrencyDao;
      }
    }
  }
}
