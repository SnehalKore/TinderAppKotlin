package com.example.navigationarchitecturewithkotlin.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/viewModel/TinderMemberListViewModel;", "Lcom/example/navigationarchitecturewithkotlin/viewModel/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "networkState", "Landroidx/lifecycle/LiveData;", "Lcom/example/navigationarchitecturewithkotlin/repository/network/NetworkState;", "getNetworkState", "()Landroidx/lifecycle/LiveData;", "setNetworkState", "(Landroidx/lifecycle/LiveData;)V", "sampleData", "", "Lcom/example/navigationarchitecturewithkotlin/model/TinderMemberData;", "getSampleData", "setSampleData", "getData", "", "isConnected", "", "updateStatus", "status", "", "uuid", "app_debug"})
public final class TinderMemberListViewModel extends com.example.navigationarchitecturewithkotlin.viewModel.BaseViewModel {
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<java.util.List<com.example.navigationarchitecturewithkotlin.model.TinderMemberData>> sampleData;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<com.example.navigationarchitecturewithkotlin.repository.network.NetworkState> networkState;
    
    public TinderMemberListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.navigationarchitecturewithkotlin.model.TinderMemberData>> getSampleData() {
        return null;
    }
    
    public final void setSampleData(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<java.util.List<com.example.navigationarchitecturewithkotlin.model.TinderMemberData>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<com.example.navigationarchitecturewithkotlin.repository.network.NetworkState> getNetworkState() {
        return null;
    }
    
    public final void setNetworkState(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<com.example.navigationarchitecturewithkotlin.repository.network.NetworkState> p0) {
    }
    
    public final void getData(boolean isConnected) {
    }
    
    public final void updateStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
    }
}