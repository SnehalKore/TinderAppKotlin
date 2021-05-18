package com.example.navigationarchitecturewithkotlin.repository.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/repository/network/NetworkState;", "", "status", "Lcom/example/navigationarchitecturewithkotlin/repository/network/NetworkState$Status;", "msg", "", "(Lcom/example/navigationarchitecturewithkotlin/repository/network/NetworkState$Status;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getStatus", "()Lcom/example/navigationarchitecturewithkotlin/repository/network/NetworkState$Status;", "Companion", "Status", "app_debug"})
public final class NetworkState {
    @org.jetbrains.annotations.NotNull()
    private final com.example.navigationarchitecturewithkotlin.repository.network.NetworkState.Status status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String msg = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.navigationarchitecturewithkotlin.repository.network.NetworkState.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.navigationarchitecturewithkotlin.repository.network.NetworkState LOADED = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.navigationarchitecturewithkotlin.repository.network.NetworkState LOADING = null;
    
    public NetworkState(@org.jetbrains.annotations.NotNull()
    com.example.navigationarchitecturewithkotlin.repository.network.NetworkState.Status status, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.navigationarchitecturewithkotlin.repository.network.NetworkState.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMsg() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/repository/network/NetworkState$Status;", "", "(Ljava/lang/String;I)V", "RUNNING", "SUCCESS", "FAILED", "app_debug"})
    public static enum Status {
        /*public static final*/ RUNNING /* = new RUNNING() */,
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ FAILED /* = new FAILED() */;
        
        Status() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/repository/network/NetworkState$Companion;", "", "()V", "LOADED", "Lcom/example/navigationarchitecturewithkotlin/repository/network/NetworkState;", "getLOADED", "()Lcom/example/navigationarchitecturewithkotlin/repository/network/NetworkState;", "LOADING", "getLOADING", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.navigationarchitecturewithkotlin.repository.network.NetworkState getLOADED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.navigationarchitecturewithkotlin.repository.network.NetworkState getLOADING() {
            return null;
        }
    }
}