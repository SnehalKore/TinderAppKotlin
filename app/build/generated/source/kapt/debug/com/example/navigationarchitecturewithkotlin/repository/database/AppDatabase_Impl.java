package com.example.navigationarchitecturewithkotlin.repository.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.navigationarchitecturewithkotlin.repository.database.dao.TinderMemberDao;
import com.example.navigationarchitecturewithkotlin.repository.database.dao.TinderMemberDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile TinderMemberDao _tinderMemberDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TinderMemberData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `gender` TEXT NOT NULL, `phone` TEXT NOT NULL, `status` TEXT DEFAULT 'Not updated', `large` TEXT NOT NULL, `medium` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `title` TEXT NOT NULL, `first` TEXT NOT NULL, `last` TEXT NOT NULL, `uuid` TEXT NOT NULL, `username` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c563e6baccf6b058105d0b6ced1a368e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `TinderMemberData`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTinderMemberData = new HashMap<String, TableInfo.Column>(12);
        _columnsTinderMemberData.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTinderMemberData.put("gender", new TableInfo.Column("gender", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTinderMemberData.put("phone", new TableInfo.Column("phone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTinderMemberData.put("status", new TableInfo.Column("status", "TEXT", false, 0, "'Not updated'", TableInfo.CREATED_FROM_ENTITY));
        _columnsTinderMemberData.put("large", new TableInfo.Column("large", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTinderMemberData.put("medium", new TableInfo.Column("medium", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTinderMemberData.put("thumbnail", new TableInfo.Column("thumbnail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTinderMemberData.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTinderMemberData.put("first", new TableInfo.Column("first", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTinderMemberData.put("last", new TableInfo.Column("last", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTinderMemberData.put("uuid", new TableInfo.Column("uuid", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTinderMemberData.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTinderMemberData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTinderMemberData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTinderMemberData = new TableInfo("TinderMemberData", _columnsTinderMemberData, _foreignKeysTinderMemberData, _indicesTinderMemberData);
        final TableInfo _existingTinderMemberData = TableInfo.read(_db, "TinderMemberData");
        if (! _infoTinderMemberData.equals(_existingTinderMemberData)) {
          return new RoomOpenHelper.ValidationResult(false, "TinderMemberData(com.example.navigationarchitecturewithkotlin.model.TinderMemberData).\n"
                  + " Expected:\n" + _infoTinderMemberData + "\n"
                  + " Found:\n" + _existingTinderMemberData);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c563e6baccf6b058105d0b6ced1a368e", "166f8e942b82b273ccbccdebe4678c6f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "TinderMemberData");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `TinderMemberData`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public TinderMemberDao tinderMemberDao() {
    if (_tinderMemberDao != null) {
      return _tinderMemberDao;
    } else {
      synchronized(this) {
        if(_tinderMemberDao == null) {
          _tinderMemberDao = new TinderMemberDao_Impl(this);
        }
        return _tinderMemberDao;
      }
    }
  }
}
