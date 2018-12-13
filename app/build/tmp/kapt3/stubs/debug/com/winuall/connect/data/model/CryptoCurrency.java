package com.winuall.connect.data.model;

import java.lang.System;

/**
 * * Created by Abhishek Dubey on 9.06.2018 at 23:50.
 * * Copyright (c) 2018. All rights reserved.
 */
@android.arch.persistence.room.Entity(tableName = "cryptoCurrencies")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b1\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u00b1\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\tH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0007H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00ba\u0001\u00108\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0013\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u00d6\u0003J\t\u0010>\u001a\u00020\u0007H\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016\u00a8\u0006@"}, d2 = {"Lcom/winuall/connect/data/model/CryptoCurrency;", "Ljava/io/Serializable;", "id", "", "name", "symbol", "rank", "", "priceUsd", "", "priceBtc", "volumeUsd24h", "marketCapUsd", "availableSupply", "totalSupply", "maxSupply", "percentChange1h", "percentChange24h", "percentChange7d", "lastUpdated", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getAvailableSupply", "()Ljava/lang/String;", "getId", "getLastUpdated", "()D", "getMarketCapUsd", "getMaxSupply", "getName", "getPercentChange1h", "getPercentChange24h", "getPercentChange7d", "getPriceBtc", "getPriceUsd", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRank", "()I", "getSymbol", "getTotalSupply", "getVolumeUsd24h", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/winuall/connect/data/model/CryptoCurrency;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class CryptoCurrency implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "id")
    @android.arch.persistence.room.PrimaryKey()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "symbol")
    private final java.lang.String symbol = null;
    @android.arch.persistence.room.ColumnInfo(name = "rank")
    private final int rank = 0;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "price_usd")
    private final java.lang.Double priceUsd = null;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "price_btc")
    private final java.lang.String priceBtc = null;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "24h_volume_usd")
    private final java.lang.String volumeUsd24h = null;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "market_cap_usd")
    private final java.lang.String marketCapUsd = null;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "available_supply")
    private final java.lang.String availableSupply = null;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "total_supply")
    private final java.lang.String totalSupply = null;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "max_supply")
    private final java.lang.String maxSupply = null;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "percent_change_1h")
    private final java.lang.String percentChange1h = null;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "percent_change_24h")
    private final java.lang.String percentChange24h = null;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "percent_change_7d")
    private final java.lang.String percentChange7d = null;
    @android.arch.persistence.room.ColumnInfo(name = "last_updated")
    private final double lastUpdated = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSymbol() {
        return null;
    }
    
    public final int getRank() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPriceUsd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPriceBtc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVolumeUsd24h() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMarketCapUsd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvailableSupply() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalSupply() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMaxSupply() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPercentChange1h() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPercentChange24h() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPercentChange7d() {
        return null;
    }
    
    public final double getLastUpdated() {
        return 0.0;
    }
    
    public CryptoCurrency(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "symbol")
    java.lang.String symbol, @com.squareup.moshi.Json(name = "rank")
    int rank, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "price_usd")
    java.lang.Double priceUsd, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "price_btc")
    java.lang.String priceBtc, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "24h_volume_usd")
    java.lang.String volumeUsd24h, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "market_cap_usd")
    java.lang.String marketCapUsd, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "available_supply")
    java.lang.String availableSupply, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total_supply")
    java.lang.String totalSupply, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "max_supply")
    java.lang.String maxSupply, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "percent_change_1h")
    java.lang.String percentChange1h, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "percent_change_24h")
    java.lang.String percentChange24h, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "percent_change_7d")
    java.lang.String percentChange7d, @com.squareup.moshi.Json(name = "last_updated")
    double lastUpdated) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    /**
     * * Created by Abhishek Dubey on 9.06.2018 at 23:50.
     * * Copyright (c) 2018. All rights reserved.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.winuall.connect.data.model.CryptoCurrency copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "symbol")
    java.lang.String symbol, @com.squareup.moshi.Json(name = "rank")
    int rank, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "price_usd")
    java.lang.Double priceUsd, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "price_btc")
    java.lang.String priceBtc, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "24h_volume_usd")
    java.lang.String volumeUsd24h, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "market_cap_usd")
    java.lang.String marketCapUsd, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "available_supply")
    java.lang.String availableSupply, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total_supply")
    java.lang.String totalSupply, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "max_supply")
    java.lang.String maxSupply, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "percent_change_1h")
    java.lang.String percentChange1h, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "percent_change_24h")
    java.lang.String percentChange24h, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "percent_change_7d")
    java.lang.String percentChange7d, @com.squareup.moshi.Json(name = "last_updated")
    double lastUpdated) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}