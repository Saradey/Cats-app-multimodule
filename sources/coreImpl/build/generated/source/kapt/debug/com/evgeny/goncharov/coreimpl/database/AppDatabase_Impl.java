package com.evgeny.goncharov.coreimpl.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO;
import com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO_Impl;
import com.evgeny.goncharov.coreapi.database.dao.CatsWallDao;
import com.evgeny.goncharov.coreapi.database.dao.CatsWallDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CatsWallDao _catsWallDao;

  private volatile CatDescriptionDAO _catDescriptionDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `cat_breed` (`description` TEXT, `name` TEXT, `lifeSpan` TEXT, `id` TEXT NOT NULL, `origin` TEXT, `temperament` TEXT, `wikipediaUrl` TEXT, `weight` TEXT, `urlImageCat` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `choose_cat_breed` (`id` TEXT NOT NULL, `weight` TEXT, `name` TEXT, `temperament` TEXT, `origin` TEXT, `description` TEXT, `lifeSpan` TEXT, `wikipediaUrl` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"6136774dbbb5950ba28284be6543cd9b\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `cat_breed`");
        _db.execSQL("DROP TABLE IF EXISTS `choose_cat_breed`");
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
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCatBreed = new HashMap<String, TableInfo.Column>(9);
        _columnsCatBreed.put("description", new TableInfo.Column("description", "TEXT", false, 0));
        _columnsCatBreed.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        _columnsCatBreed.put("lifeSpan", new TableInfo.Column("lifeSpan", "TEXT", false, 0));
        _columnsCatBreed.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsCatBreed.put("origin", new TableInfo.Column("origin", "TEXT", false, 0));
        _columnsCatBreed.put("temperament", new TableInfo.Column("temperament", "TEXT", false, 0));
        _columnsCatBreed.put("wikipediaUrl", new TableInfo.Column("wikipediaUrl", "TEXT", false, 0));
        _columnsCatBreed.put("weight", new TableInfo.Column("weight", "TEXT", false, 0));
        _columnsCatBreed.put("urlImageCat", new TableInfo.Column("urlImageCat", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCatBreed = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCatBreed = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCatBreed = new TableInfo("cat_breed", _columnsCatBreed, _foreignKeysCatBreed, _indicesCatBreed);
        final TableInfo _existingCatBreed = TableInfo.read(_db, "cat_breed");
        if (! _infoCatBreed.equals(_existingCatBreed)) {
          throw new IllegalStateException("Migration didn't properly handle cat_breed(com.evgeny.goncharov.coreapi.dto.database.CatBreed).\n"
                  + " Expected:\n" + _infoCatBreed + "\n"
                  + " Found:\n" + _existingCatBreed);
        }
        final HashMap<String, TableInfo.Column> _columnsChooseCatBreed = new HashMap<String, TableInfo.Column>(8);
        _columnsChooseCatBreed.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsChooseCatBreed.put("weight", new TableInfo.Column("weight", "TEXT", false, 0));
        _columnsChooseCatBreed.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        _columnsChooseCatBreed.put("temperament", new TableInfo.Column("temperament", "TEXT", false, 0));
        _columnsChooseCatBreed.put("origin", new TableInfo.Column("origin", "TEXT", false, 0));
        _columnsChooseCatBreed.put("description", new TableInfo.Column("description", "TEXT", false, 0));
        _columnsChooseCatBreed.put("lifeSpan", new TableInfo.Column("lifeSpan", "TEXT", false, 0));
        _columnsChooseCatBreed.put("wikipediaUrl", new TableInfo.Column("wikipediaUrl", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysChooseCatBreed = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesChooseCatBreed = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoChooseCatBreed = new TableInfo("choose_cat_breed", _columnsChooseCatBreed, _foreignKeysChooseCatBreed, _indicesChooseCatBreed);
        final TableInfo _existingChooseCatBreed = TableInfo.read(_db, "choose_cat_breed");
        if (! _infoChooseCatBreed.equals(_existingChooseCatBreed)) {
          throw new IllegalStateException("Migration didn't properly handle choose_cat_breed(com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed).\n"
                  + " Expected:\n" + _infoChooseCatBreed + "\n"
                  + " Found:\n" + _existingChooseCatBreed);
        }
      }
    }, "6136774dbbb5950ba28284be6543cd9b", "f9d73d6a00aa41ac8a1cd0c5c6a99a41");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "cat_breed","choose_cat_breed");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `cat_breed`");
      _db.execSQL("DELETE FROM `choose_cat_breed`");
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
  public CatsWallDao createCatsWallDao() {
    if (_catsWallDao != null) {
      return _catsWallDao;
    } else {
      synchronized(this) {
        if(_catsWallDao == null) {
          _catsWallDao = new CatsWallDao_Impl(this);
        }
        return _catsWallDao;
      }
    }
  }

  @Override
  public CatDescriptionDAO createCatDescriptionDAO() {
    if (_catDescriptionDAO != null) {
      return _catDescriptionDAO;
    } else {
      synchronized(this) {
        if(_catDescriptionDAO == null) {
          _catDescriptionDAO = new CatDescriptionDAO_Impl(this);
        }
        return _catDescriptionDAO;
      }
    }
  }
}
