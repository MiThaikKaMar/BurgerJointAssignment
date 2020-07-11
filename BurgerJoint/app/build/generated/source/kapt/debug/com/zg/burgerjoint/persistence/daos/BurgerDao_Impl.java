package com.zg.burgerjoint.persistence.daos;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.zg.burgerjoint.data.vos.BurgerVO;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BurgerDao_Impl implements BurgerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BurgerVO> __insertionAdapterOfBurgerVO;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllBurgers;

  public BurgerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBurgerVO = new EntityInsertionAdapter<BurgerVO>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `burgers` (`burger_id_pk`,`burger_name`,`burger_description`,`burger_image_url`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BurgerVO value) {
        stmt.bindLong(1, value.getBurgerId());
        if (value.getBurgerName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBurgerName());
        }
        if (value.getBurgerDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBurgerDescription());
        }
        if (value.getBurgerImageUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBurgerImageUrl());
        }
      }
    };
    this.__preparedStmtOfDeleteAllBurgers = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM burgers";
        return _query;
      }
    };
  }

  @Override
  public void insertBurgers(final List<BurgerVO> burgers) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBurgerVO.insert(burgers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final BurgerVO burger) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBurgerVO.insert(burger);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllBurgers() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllBurgers.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllBurgers.release(_stmt);
    }
  }

  @Override
  public LiveData<List<BurgerVO>> getAllBurgers() {
    final String _sql = "SELECT * FROM burgers";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"burgers"}, false, new Callable<List<BurgerVO>>() {
      @Override
      public List<BurgerVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfBurgerId = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_id_pk");
          final int _cursorIndexOfBurgerName = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_name");
          final int _cursorIndexOfBurgerDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_description");
          final int _cursorIndexOfBurgerImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_image_url");
          final List<BurgerVO> _result = new ArrayList<BurgerVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BurgerVO _item;
            _item = new BurgerVO();
            final int _tmpBurgerId;
            _tmpBurgerId = _cursor.getInt(_cursorIndexOfBurgerId);
            _item.setBurgerId(_tmpBurgerId);
            final String _tmpBurgerName;
            _tmpBurgerName = _cursor.getString(_cursorIndexOfBurgerName);
            _item.setBurgerName(_tmpBurgerName);
            final String _tmpBurgerDescription;
            _tmpBurgerDescription = _cursor.getString(_cursorIndexOfBurgerDescription);
            _item.setBurgerDescription(_tmpBurgerDescription);
            final String _tmpBurgerImageUrl;
            _tmpBurgerImageUrl = _cursor.getString(_cursorIndexOfBurgerImageUrl);
            _item.setBurgerImageUrl(_tmpBurgerImageUrl);
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

  @Override
  public LiveData<BurgerVO> findBurgerById(final int id) {
    final String _sql = "SELECT * FROM burgers WHERE burger_id_pk = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"burgers"}, false, new Callable<BurgerVO>() {
      @Override
      public BurgerVO call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfBurgerId = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_id_pk");
          final int _cursorIndexOfBurgerName = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_name");
          final int _cursorIndexOfBurgerDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_description");
          final int _cursorIndexOfBurgerImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_image_url");
          final BurgerVO _result;
          if(_cursor.moveToFirst()) {
            _result = new BurgerVO();
            final int _tmpBurgerId;
            _tmpBurgerId = _cursor.getInt(_cursorIndexOfBurgerId);
            _result.setBurgerId(_tmpBurgerId);
            final String _tmpBurgerName;
            _tmpBurgerName = _cursor.getString(_cursorIndexOfBurgerName);
            _result.setBurgerName(_tmpBurgerName);
            final String _tmpBurgerDescription;
            _tmpBurgerDescription = _cursor.getString(_cursorIndexOfBurgerDescription);
            _result.setBurgerDescription(_tmpBurgerDescription);
            final String _tmpBurgerImageUrl;
            _tmpBurgerImageUrl = _cursor.getString(_cursorIndexOfBurgerImageUrl);
            _result.setBurgerImageUrl(_tmpBurgerImageUrl);
          } else {
            _result = null;
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

  @Override
  public BurgerVO findBurgerByIdOneShot(final int id) {
    final String _sql = "SELECT * FROM burgers WHERE burger_id_pk = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfBurgerId = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_id_pk");
      final int _cursorIndexOfBurgerName = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_name");
      final int _cursorIndexOfBurgerDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_description");
      final int _cursorIndexOfBurgerImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "burger_image_url");
      final BurgerVO _result;
      if(_cursor.moveToFirst()) {
        _result = new BurgerVO();
        final int _tmpBurgerId;
        _tmpBurgerId = _cursor.getInt(_cursorIndexOfBurgerId);
        _result.setBurgerId(_tmpBurgerId);
        final String _tmpBurgerName;
        _tmpBurgerName = _cursor.getString(_cursorIndexOfBurgerName);
        _result.setBurgerName(_tmpBurgerName);
        final String _tmpBurgerDescription;
        _tmpBurgerDescription = _cursor.getString(_cursorIndexOfBurgerDescription);
        _result.setBurgerDescription(_tmpBurgerDescription);
        final String _tmpBurgerImageUrl;
        _tmpBurgerImageUrl = _cursor.getString(_cursorIndexOfBurgerImageUrl);
        _result.setBurgerImageUrl(_tmpBurgerImageUrl);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
