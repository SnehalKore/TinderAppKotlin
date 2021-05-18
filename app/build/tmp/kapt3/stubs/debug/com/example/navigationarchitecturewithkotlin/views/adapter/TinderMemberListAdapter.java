package com.example.navigationarchitecturewithkotlin.views.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/views/adapter/TinderMemberListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/navigationarchitecturewithkotlin/model/TinderMemberData;", "Lcom/example/navigationarchitecturewithkotlin/views/adapter/TinderMemberListAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "()V", "layoutInflater", "Landroid/view/LayoutInflater;", "listener", "Lcom/example/navigationarchitecturewithkotlin/views/interfaces/MemberListAdapterListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListener", "MyViewHolder", "app_debug"})
public final class TinderMemberListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.navigationarchitecturewithkotlin.model.TinderMemberData, com.example.navigationarchitecturewithkotlin.views.adapter.TinderMemberListAdapter.MyViewHolder> {
    private android.view.LayoutInflater layoutInflater;
    private com.example.navigationarchitecturewithkotlin.views.interfaces.MemberListAdapterListener listener;
    private android.content.Context context;
    
    public TinderMemberListAdapter() {
        super(null);
    }
    
    public TinderMemberListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.navigationarchitecturewithkotlin.views.adapter.TinderMemberListAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.navigationarchitecturewithkotlin.views.adapter.TinderMemberListAdapter.MyViewHolder holder, int position) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.example.navigationarchitecturewithkotlin.views.interfaces.MemberListAdapterListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/views/adapter/TinderMemberListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/navigationarchitecturewithkotlin/databinding/ListRowBinding;", "(Lcom/example/navigationarchitecturewithkotlin/views/adapter/TinderMemberListAdapter;Lcom/example/navigationarchitecturewithkotlin/databinding/ListRowBinding;)V", "getBinding", "()Lcom/example/navigationarchitecturewithkotlin/databinding/ListRowBinding;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.navigationarchitecturewithkotlin.databinding.ListRowBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.navigationarchitecturewithkotlin.databinding.ListRowBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.navigationarchitecturewithkotlin.databinding.ListRowBinding getBinding() {
            return null;
        }
    }
}