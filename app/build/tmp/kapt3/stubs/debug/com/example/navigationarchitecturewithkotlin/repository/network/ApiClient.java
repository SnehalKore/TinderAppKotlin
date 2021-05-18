package com.example.navigationarchitecturewithkotlin.repository.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/repository/network/ApiClient;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "client", "Lretrofit2/Retrofit;", "getClient", "()Lretrofit2/Retrofit;", "retrofit", "app_debug"})
public final class ApiClient {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.navigationarchitecturewithkotlin.repository.network.ApiClient INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "https://randomuser.me";
    private static retrofit2.Retrofit retrofit;
    
    private ApiClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Retrofit getClient() {
        return null;
    }
}