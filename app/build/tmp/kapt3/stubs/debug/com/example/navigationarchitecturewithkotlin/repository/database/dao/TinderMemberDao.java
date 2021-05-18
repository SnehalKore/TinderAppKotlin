package com.example.navigationarchitecturewithkotlin.repository.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\'J\u0016\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/repository/database/dao/TinderMemberDao;", "", "fetchAllMembers", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/navigationarchitecturewithkotlin/model/TinderMemberData;", "insert", "", "member", "insertAll", "memberList", "updateStatus", "status", "", "uuid", "Companion", "app_debug"})
public abstract interface TinderMemberDao {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.navigationarchitecturewithkotlin.repository.database.dao.TinderMemberDao.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String tableName = "TinderMemberData";
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.navigationarchitecturewithkotlin.model.TinderMemberData> memberList);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.navigationarchitecturewithkotlin.model.TinderMemberData member);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM TinderMemberData ORDER BY id DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.navigationarchitecturewithkotlin.model.TinderMemberData>> fetchAllMembers();
    
    @androidx.room.Query(value = "UPDATE TinderMemberData SET status = :status WHERE uuid=:uuid")
    public abstract void updateStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String uuid);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/repository/database/dao/TinderMemberDao$Companion;", "", "()V", "tableName", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String tableName = "TinderMemberData";
        
        private Companion() {
            super();
        }
    }
}