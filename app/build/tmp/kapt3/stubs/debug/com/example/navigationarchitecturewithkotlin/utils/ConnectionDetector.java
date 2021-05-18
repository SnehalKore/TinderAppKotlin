package com.example.navigationarchitecturewithkotlin.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/utils/ConnectionDetector;", "", "()V", "Companion", "app_debug"})
public final class ConnectionDetector {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.navigationarchitecturewithkotlin.utils.ConnectionDetector.Companion Companion = null;
    
    public ConnectionDetector() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/utils/ConnectionDetector$Companion;", "", "()V", "isMobileNetworkAvailable", "", "ctx", "Landroid/content/Context;", "isWifiAvailable", "networkStatus", "context", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean networkStatus(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        private final boolean isMobileNetworkAvailable(android.content.Context ctx) {
            return false;
        }
        
        private final boolean isWifiAvailable(android.content.Context ctx) {
            return false;
        }
    }
}