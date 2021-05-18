package com.example.navigationarchitecturewithkotlin.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0016\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0016\u0010\u001c\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/repository/NavRepository;", "", "mDatabase", "Lcom/example/navigationarchitecturewithkotlin/repository/database/AppDatabase;", "serverApi", "Lcom/example/navigationarchitecturewithkotlin/repository/network/ApiInterface;", "mAppExecutors", "Lcom/example/navigationarchitecturewithkotlin/repository/AppExecutors;", "(Lcom/example/navigationarchitecturewithkotlin/repository/database/AppDatabase;Lcom/example/navigationarchitecturewithkotlin/repository/network/ApiInterface;Lcom/example/navigationarchitecturewithkotlin/repository/AppExecutors;)V", "gson", "Lcom/google/gson/Gson;", "memberListLiveData", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/example/navigationarchitecturewithkotlin/model/TinderMemberData;", "networkState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/navigationarchitecturewithkotlin/repository/network/NetworkState;", "getMemberList", "isConnected", "", "getMemberListFromDB", "", "getNetworkState", "getUpdateMemberFromDB", "status", "", "uuid", "insertMemberListInDB", "response", "Lretrofit2/Response;", "Lcom/example/navigationarchitecturewithkotlin/model/DataModel;", "Companion", "app_debug"})
public final class NavRepository {
    private final com.example.navigationarchitecturewithkotlin.repository.database.AppDatabase mDatabase = null;
    private final com.example.navigationarchitecturewithkotlin.repository.network.ApiInterface serverApi = null;
    private final com.example.navigationarchitecturewithkotlin.repository.AppExecutors mAppExecutors = null;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.example.navigationarchitecturewithkotlin.model.TinderMemberData>> memberListLiveData;
    private androidx.lifecycle.MutableLiveData<com.example.navigationarchitecturewithkotlin.repository.network.NetworkState> networkState;
    private final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.navigationarchitecturewithkotlin.repository.NavRepository.Companion Companion = null;
    private static com.example.navigationarchitecturewithkotlin.repository.NavRepository sInstance;
    
    public NavRepository(@org.jetbrains.annotations.NotNull()
    com.example.navigationarchitecturewithkotlin.repository.database.AppDatabase mDatabase, @org.jetbrains.annotations.NotNull()
    com.example.navigationarchitecturewithkotlin.repository.network.ApiInterface serverApi, @org.jetbrains.annotations.NotNull()
    com.example.navigationarchitecturewithkotlin.repository.AppExecutors mAppExecutors) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.navigationarchitecturewithkotlin.repository.network.NetworkState> getNetworkState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.navigationarchitecturewithkotlin.model.TinderMemberData>> getMemberList(boolean isConnected) {
        return null;
    }
    
    private final void getMemberListFromDB() {
    }
    
    public final void getUpdateMemberFromDB(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
    }
    
    private final void insertMemberListInDB(retrofit2.Response<com.example.navigationarchitecturewithkotlin.model.DataModel> response) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/repository/NavRepository$Companion;", "", "()V", "sInstance", "Lcom/example/navigationarchitecturewithkotlin/repository/NavRepository;", "getInstance", "mDatabase", "Lcom/example/navigationarchitecturewithkotlin/repository/database/AppDatabase;", "serverApi", "Lcom/example/navigationarchitecturewithkotlin/repository/network/ApiInterface;", "mAppExecutors", "Lcom/example/navigationarchitecturewithkotlin/repository/AppExecutors;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.navigationarchitecturewithkotlin.repository.NavRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.example.navigationarchitecturewithkotlin.repository.database.AppDatabase mDatabase, @org.jetbrains.annotations.NotNull()
        com.example.navigationarchitecturewithkotlin.repository.network.ApiInterface serverApi, @org.jetbrains.annotations.NotNull()
        com.example.navigationarchitecturewithkotlin.repository.AppExecutors mAppExecutors) {
            return null;
        }
    }
}