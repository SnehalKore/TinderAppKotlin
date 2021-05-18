package com.example.navigationarchitecturewithkotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/NavigationArchApplication;", "Landroid/app/Application;", "()V", "apiInterface", "Lcom/example/navigationarchitecturewithkotlin/repository/network/ApiInterface;", "getApiInterface", "()Lcom/example/navigationarchitecturewithkotlin/repository/network/ApiInterface;", "appRepository", "Lcom/example/navigationarchitecturewithkotlin/repository/NavRepository;", "getAppRepository", "()Lcom/example/navigationarchitecturewithkotlin/repository/NavRepository;", "mAppExecutors", "Lcom/example/navigationarchitecturewithkotlin/repository/AppExecutors;", "getDatabase", "Lcom/example/navigationarchitecturewithkotlin/repository/database/AppDatabase;", "onCreate", "", "app_debug"})
public final class NavigationArchApplication extends android.app.Application {
    private com.example.navigationarchitecturewithkotlin.repository.AppExecutors mAppExecutors;
    
    public NavigationArchApplication() {
        super();
    }
    
    private final com.example.navigationarchitecturewithkotlin.repository.network.ApiInterface getApiInterface() {
        return null;
    }
    
    private final com.example.navigationarchitecturewithkotlin.repository.database.AppDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.navigationarchitecturewithkotlin.repository.NavRepository getAppRepository() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
}