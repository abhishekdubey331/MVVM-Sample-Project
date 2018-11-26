package com.winuall.connect.persistance.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EmptyResultSetException;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.winuall.connect.data.model.CryptoCurrency;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
public class CryptoCurrencyDao_Impl implements CryptoCurrencyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCryptoCurrency;

  public CryptoCurrencyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCryptoCurrency = new EntityInsertionAdapter<CryptoCurrency>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `cryptoCurrencies`(`id`,`name`,`symbol`,`rank`,`price_usd`,`price_btc`,`24h_volume_usd`,`market_cap_usd`,`available_supply`,`total_supply`,`max_supply`,`percent_change_1h`,`percent_change_24h`,`percent_change_7d`,`last_updated`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CryptoCurrency value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getSymbol() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSymbol());
        }
        stmt.bindLong(4, value.getRank());
        if (value.getPriceUsd() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindDouble(5, value.getPriceUsd());
        }
        if (value.getPriceBtc() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPriceBtc());
        }
        if (value.getVolumeUsd24h() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getVolumeUsd24h());
        }
        if (value.getMarketCapUsd() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getMarketCapUsd());
        }
        if (value.getAvailableSupply() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getAvailableSupply());
        }
        if (value.getTotalSupply() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getTotalSupply());
        }
        if (value.getMaxSupply() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getMaxSupply());
        }
        if (value.getPercentChange1h() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getPercentChange1h());
        }
        if (value.getPercentChange24h() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getPercentChange24h());
        }
        if (value.getPercentChange7d() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getPercentChange7d());
        }
        stmt.bindDouble(15, value.getLastUpdated());
      }
    };
  }

  @Override
  public void insertCryptocurrency(CryptoCurrency cryptoCurrency) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCryptoCurrency.insert(cryptoCurrency);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllCryptocurrencies(List<CryptoCurrency> cryptoCurrencies) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCryptoCurrency.insert(cryptoCurrencies);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Single<List<CryptoCurrency>> queryCryptocurrencies(int limit, int offset) {
    final String _sql = "SELECT * FROM cryptoCurrencies ORDER BY rank limit ? offset ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    _argIndex = 2;
    _statement.bindLong(_argIndex, offset);
    return Single.fromCallable(new Callable<List<CryptoCurrency>>() {
      public List<CryptoCurrency> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfSymbol = _cursor.getColumnIndexOrThrow("symbol");
          final int _cursorIndexOfRank = _cursor.getColumnIndexOrThrow("rank");
          final int _cursorIndexOfPriceUsd = _cursor.getColumnIndexOrThrow("price_usd");
          final int _cursorIndexOfPriceBtc = _cursor.getColumnIndexOrThrow("price_btc");
          final int _cursorIndexOfVolumeUsd24h = _cursor.getColumnIndexOrThrow("24h_volume_usd");
          final int _cursorIndexOfMarketCapUsd = _cursor.getColumnIndexOrThrow("market_cap_usd");
          final int _cursorIndexOfAvailableSupply = _cursor.getColumnIndexOrThrow("available_supply");
          final int _cursorIndexOfTotalSupply = _cursor.getColumnIndexOrThrow("total_supply");
          final int _cursorIndexOfMaxSupply = _cursor.getColumnIndexOrThrow("max_supply");
          final int _cursorIndexOfPercentChange1h = _cursor.getColumnIndexOrThrow("percent_change_1h");
          final int _cursorIndexOfPercentChange24h = _cursor.getColumnIndexOrThrow("percent_change_24h");
          final int _cursorIndexOfPercentChange7d = _cursor.getColumnIndexOrThrow("percent_change_7d");
          final int _cursorIndexOfLastUpdated = _cursor.getColumnIndexOrThrow("last_updated");
          final java.util.List<com.winuall.connect.data.model.CryptoCurrency> _result = new java.util.ArrayList<com.winuall.connect.data.model.CryptoCurrency>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final com.winuall.connect.data.model.CryptoCurrency _item;
            final java.lang.String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final java.lang.String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final java.lang.String _tmpSymbol;
            _tmpSymbol = _cursor.getString(_cursorIndexOfSymbol);
            final int _tmpRank;
            _tmpRank = _cursor.getInt(_cursorIndexOfRank);
            final java.lang.Double _tmpPriceUsd;
            if (_cursor.isNull(_cursorIndexOfPriceUsd)) {
              _tmpPriceUsd = null;
            } else {
              _tmpPriceUsd = _cursor.getDouble(_cursorIndexOfPriceUsd);
            }
            final java.lang.String _tmpPriceBtc;
            _tmpPriceBtc = _cursor.getString(_cursorIndexOfPriceBtc);
            final java.lang.String _tmpVolumeUsd24h;
            _tmpVolumeUsd24h = _cursor.getString(_cursorIndexOfVolumeUsd24h);
            final java.lang.String _tmpMarketCapUsd;
            _tmpMarketCapUsd = _cursor.getString(_cursorIndexOfMarketCapUsd);
            final java.lang.String _tmpAvailableSupply;
            _tmpAvailableSupply = _cursor.getString(_cursorIndexOfAvailableSupply);
            final java.lang.String _tmpTotalSupply;
            _tmpTotalSupply = _cursor.getString(_cursorIndexOfTotalSupply);
            final java.lang.String _tmpMaxSupply;
            _tmpMaxSupply = _cursor.getString(_cursorIndexOfMaxSupply);
            final java.lang.String _tmpPercentChange1h;
            _tmpPercentChange1h = _cursor.getString(_cursorIndexOfPercentChange1h);
            final java.lang.String _tmpPercentChange24h;
            _tmpPercentChange24h = _cursor.getString(_cursorIndexOfPercentChange24h);
            final java.lang.String _tmpPercentChange7d;
            _tmpPercentChange7d = _cursor.getString(_cursorIndexOfPercentChange7d);
            final double _tmpLastUpdated;
            _tmpLastUpdated = _cursor.getDouble(_cursorIndexOfLastUpdated);
            _item = new com.winuall.connect.data.model.CryptoCurrency(_tmpId,_tmpName,_tmpSymbol,_tmpRank,_tmpPriceUsd,_tmpPriceBtc,_tmpVolumeUsd24h,_tmpMarketCapUsd,_tmpAvailableSupply,_tmpTotalSupply,_tmpMaxSupply,_tmpPercentChange1h,_tmpPercentChange24h,_tmpPercentChange7d,_tmpLastUpdated);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    });
  }
}
