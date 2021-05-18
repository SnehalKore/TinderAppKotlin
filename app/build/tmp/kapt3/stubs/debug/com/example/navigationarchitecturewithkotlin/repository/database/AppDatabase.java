package com.example.navigationarchitecturewithkotlin.repository.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.navigationarchitecturewithkotlin.model.TinderMemberData.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/repository/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "mIsDatabaseCreated", "Landroidx/lifecycle/MutableLiveData;", "", "getDatabaseCreated", "Landroidx/lifecycle/LiveData;", "setDatabaseCreated", "", "tinderMemberDao", "Lcom/example/navigationarchitecturewithkotlin/repository/database/dao/TinderMemberDao;", "updateDatabaseCreated", "context", "Landroid/content/Context;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mIsDatabaseCreated = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.navigationarchitecturewithkotlin.repository.database.AppDatabase.Companion Companion = null;
    private static com.example.navigationarchitecturewithkotlin.repository.database.AppDatabase sInstance;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATABASE_NAME = "tinder_db";
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.navigationarchitecturewithkotlin.repository.database.dao.TinderMemberDao tinderMemberDao();
    
    /**
     * Check whether the database already exists and expose it via [.getDatabaseCreated]
     */
    private final void updateDatabaseCreated(android.content.Context context) {
    }
    
    private final void setDatabaseCreated() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public androidx.lifecycle.LiveData<java.lang.Boolean> getDatabaseCreated() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/repository/database/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "getDATABASE_NAME$annotations", "getDATABASE_NAME", "()Ljava/lang/String;", "sInstance", "Lcom/example/navigationarchitecturewithkotlin/repository/database/AppDatabase;", "buildDatabase", "appContext", "Landroid/content/Context;", "executors", "Lcom/example/navigationarchitecturewithkotlin/repository/AppExecutors;", "getInstance", "context", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATABASE_NAME() {
            return null;
        }
        
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getDATABASE_NAME$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.navigationarchitecturewithkotlin.repository.database.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.example.navigationarchitecturewithkotlin.repository.AppExecutors executors) {
            return null;
        }
        
        /**
         * Build the database. [Builder.build] only sets up the database configuration and
         * creates a new instance of the database.
         * The SQLite database is only created when it's accessed for the first time.
         */
        private final com.example.navigationarchitecturewithkotlin.repository.database.AppDatabase buildDatabase(android.content.Context appContext, com.example.navigationarchitecturewithkotlin.repository.AppExecutors executors) {
            return null;
        }
    }
}