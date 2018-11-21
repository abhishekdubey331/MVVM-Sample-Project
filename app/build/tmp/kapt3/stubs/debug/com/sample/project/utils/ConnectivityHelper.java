package com.sample.project.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/sample/project/utils/ConnectivityHelper;", "", "()V", "getNetworkInfo", "Landroid/net/NetworkInfo;", "context", "Landroid/content/Context;", "isConnected", "", "isConnectedFast", "isConnectedMobile", "isConnectedWifi", "isConnectionFast", "type", "", "subType", "app_debug"})
public final class ConnectivityHelper {
    
    /**
     * * Get the network info
     *     * @param context
     *     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final android.net.NetworkInfo getNetworkInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * Check if there is any connectivity
     *     * @param context
     *     * @return
     */
    public final boolean isConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * Check if there is any connectivity to a Wifi network
     *     * @param context
     *     * @param type
     *     * @return
     */
    public final boolean isConnectedWifi(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * Check if there is any connectivity to a mobile network
     *     * @param context
     *     * @param type
     *     * @return
     */
    public final boolean isConnectedMobile(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * Check if there is fast connectivity
     *     * @param context
     *     * @return
     */
    public final boolean isConnectedFast(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * Check if the connection is fast
     *     * @param type
     *     * @param subType
     *     * @return
     */
    public final boolean isConnectionFast(int type, int subType) {
        return false;
    }
    
    public ConnectivityHelper() {
        super();
    }
}