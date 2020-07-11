package com.zg.burgerjoint.persistence;

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
import com.zg.burgerjoint.persistence.daos.BurgerDao;
import com.zg.burgerjoint.persistence.daos.BurgerDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BurgerJointDatabase_Impl extends BurgerJointDatabase {
  private volatile BurgerDao _burgerDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `burgers` (`burger_id_pk` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `burger_name` TEXT NOT NULL, `burger_description` TEXT NOT NULL, `burger_image_url` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f04b21af539282585dba2824caf34f3f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `burgers`");
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
        final HashMap<String, TableInfo.Column> _columnsBurgers = new HashMap<String, TableInfo.Column>(4);
        _columnsBurgers.put("burger_id_pk", new TableInfo.Column("burger_id_pk", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBurgers.put("burger_name", new TableInfo.Column("burger_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBurgers.put("burger_description", new TableInfo.Column("burger_description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBurgers.put("burger_image_url", new TableInfo.Column("burger_image_url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBurgers = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBurgers = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBurgers = new TableInfo("burgers", _columnsBurgers, _foreignKeysBurgers, _indicesBurgers);
        final TableInfo _existingBurgers = TableInfo.read(_db, "burgers");
        if (! _infoBurgers.equals(_existingBurgers)) {
          return new RoomOpenHelper.ValidationResult(false, "burgers(com.zg.burgerjoint.data.vos.BurgerVO).\n"
                  + " Expected:\n" + _infoBurgers + "\n"
                  + " Found:\n" + _existingBurgers);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f04b21af539282585dba2824caf34f3f", "f00982582ebba97a305d1c5b725b0f73");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "burgers");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `burgers`");
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
  public BurgerDao getBurgerDao() {
    if (_burgerDao != null) {
      return _burgerDao;
    } else {
      synchronized(this) {
        if(_burgerDao == null) {
          _burgerDao = new BurgerDao_Impl(this);
        }
        return _burgerDao;
      }
    }
  }
}
