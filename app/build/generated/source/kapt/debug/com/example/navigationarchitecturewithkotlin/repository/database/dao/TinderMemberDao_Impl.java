package com.example.navigationarchitecturewithkotlin.repository.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.navigationarchitecturewithkotlin.model.LoginModel;
import com.example.navigationarchitecturewithkotlin.model.MemberNameModel;
import com.example.navigationarchitecturewithkotlin.model.PictureDataModel;
import com.example.navigationarchitecturewithkotlin.model.TinderMemberData;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class TinderMemberDao_Impl implements TinderMemberDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TinderMemberData> __insertionAdapterOfTinderMemberData;

  private final SharedSQLiteStatement __preparedStmtOfUpdateStatus;

  public TinderMemberDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTinderMemberData = new EntityInsertionAdapter<TinderMemberData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TinderMemberData` (`id`,`gender`,`phone`,`status`,`large`,`medium`,`thumbnail`,`title`,`first`,`last`,`uuid`,`username`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TinderMemberData value) {
        stmt.bindLong(1, value.getID());
        if (value.getGender() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getGender());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhone());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStatus());
        }
        final PictureDataModel _tmpPicture = value.getPicture();
        if(_tmpPicture != null) {
          if (_tmpPicture.getLarge() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpPicture.getLarge());
          }
          if (_tmpPicture.getMedium() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpPicture.getMedium());
          }
          if (_tmpPicture.getThumbnail() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpPicture.getThumbnail());
          }
        } else {
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
        final MemberNameModel _tmpName = value.getName();
        if(_tmpName != null) {
          if (_tmpName.getTitle() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpName.getTitle());
          }
          if (_tmpName.getFirst() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpName.getFirst());
          }
          if (_tmpName.getLast() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindString(10, _tmpName.getLast());
          }
        } else {
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
        }
        final LoginModel _tmpLogin = value.getLogin();
        if(_tmpLogin != null) {
          if (_tmpLogin.getUuid() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmpLogin.getUuid());
          }
          if (_tmpLogin.getUsername() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindString(12, _tmpLogin.getUsername());
          }
        } else {
          stmt.bindNull(11);
          stmt.bindNull(12);
        }
      }
    };
    this.__preparedStmtOfUpdateStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE TinderMemberData SET status = ? WHERE uuid=?";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<TinderMemberData> memberList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTinderMemberData.insert(memberList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final TinderMemberData member) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTinderMemberData.insert(member);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateStatus(final String status, final String uuid) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateStatus.acquire();
    int _argIndex = 1;
    if (status == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, status);
    }
    _argIndex = 2;
    if (uuid == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, uuid);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateStatus.release(_stmt);
    }
  }

  @Override
  public LiveData<List<TinderMemberData>> fetchAllMembers() {
    final String _sql = "SELECT * FROM TinderMemberData ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"TinderMemberData"}, false, new Callable<List<TinderMemberData>>() {
      @Override
      public List<TinderMemberData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfID = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfLarge = CursorUtil.getColumnIndexOrThrow(_cursor, "large");
          final int _cursorIndexOfMedium = CursorUtil.getColumnIndexOrThrow(_cursor, "medium");
          final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfFirst = CursorUtil.getColumnIndexOrThrow(_cursor, "first");
          final int _cursorIndexOfLast = CursorUtil.getColumnIndexOrThrow(_cursor, "last");
          final int _cursorIndexOfUuid = CursorUtil.getColumnIndexOrThrow(_cursor, "uuid");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final List<TinderMemberData> _result = new ArrayList<TinderMemberData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TinderMemberData _item;
            final int _tmpID;
            _tmpID = _cursor.getInt(_cursorIndexOfID);
            final String _tmpGender;
            _tmpGender = _cursor.getString(_cursorIndexOfGender);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final PictureDataModel _tmpPicture;
            if (! (_cursor.isNull(_cursorIndexOfLarge) && _cursor.isNull(_cursorIndexOfMedium) && _cursor.isNull(_cursorIndexOfThumbnail))) {
              final String _tmpLarge;
              _tmpLarge = _cursor.getString(_cursorIndexOfLarge);
              final String _tmpMedium;
              _tmpMedium = _cursor.getString(_cursorIndexOfMedium);
              final String _tmpThumbnail;
              _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
              _tmpPicture = new PictureDataModel(_tmpLarge,_tmpMedium,_tmpThumbnail);
            }  else  {
              _tmpPicture = null;
            }
            final MemberNameModel _tmpName;
            if (! (_cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfFirst) && _cursor.isNull(_cursorIndexOfLast))) {
              final String _tmpTitle;
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              final String _tmpFirst;
              _tmpFirst = _cursor.getString(_cursorIndexOfFirst);
              final String _tmpLast;
              _tmpLast = _cursor.getString(_cursorIndexOfLast);
              _tmpName = new MemberNameModel(_tmpTitle,_tmpFirst,_tmpLast);
            }  else  {
              _tmpName = null;
            }
            final LoginModel _tmpLogin;
            if (! (_cursor.isNull(_cursorIndexOfUuid) && _cursor.isNull(_cursorIndexOfUsername))) {
              final String _tmpUuid;
              _tmpUuid = _cursor.getString(_cursorIndexOfUuid);
              final String _tmpUsername;
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
              _tmpLogin = new LoginModel(_tmpUuid,_tmpUsername);
            }  else  {
              _tmpLogin = null;
            }
            _item = new TinderMemberData(_tmpID,_tmpGender,_tmpPhone,_tmpPicture,_tmpName,_tmpLogin,_tmpStatus);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
