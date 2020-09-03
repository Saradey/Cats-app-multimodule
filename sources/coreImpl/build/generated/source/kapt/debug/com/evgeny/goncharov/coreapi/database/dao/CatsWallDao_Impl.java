package com.evgeny.goncharov.coreapi.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.evgeny.goncharov.coreapi.dto.converters.WeightTypeConverter;
import com.evgeny.goncharov.coreapi.dto.database.CatBreed;
import com.evgeny.goncharov.coreapi.dto.database.Weight;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class CatsWallDao_Impl implements CatsWallDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCatBreed;

  private final WeightTypeConverter __weightTypeConverter = new WeightTypeConverter();

  public CatsWallDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCatBreed = new EntityInsertionAdapter<CatBreed>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `cat_breed`(`description`,`name`,`lifeSpan`,`id`,`origin`,`temperament`,`wikipediaUrl`,`weight`,`urlImageCat`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CatBreed value) {
        if (value.getDescription() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getDescription());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getLifeSpan() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLifeSpan());
        }
        if (value.getId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getId());
        }
        if (value.getOrigin() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOrigin());
        }
        if (value.getTemperament() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTemperament());
        }
        if (value.getWikipediaUrl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getWikipediaUrl());
        }
        final String _tmp;
        _tmp = __weightTypeConverter.fromWeight(value.getWeight());
        if (_tmp == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp);
        }
        if (value.getUrlImageCat() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getUrlImageCat());
        }
      }
    };
  }

  @Override
  public void insertWallCat(List<CatBreed> arg0) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCatBreed.insert(arg0);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<CatBreed> getCatBreed() {
    final String _sql = "SELECT * FROM cat_breed";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfLifeSpan = _cursor.getColumnIndexOrThrow("lifeSpan");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfOrigin = _cursor.getColumnIndexOrThrow("origin");
      final int _cursorIndexOfTemperament = _cursor.getColumnIndexOrThrow("temperament");
      final int _cursorIndexOfWikipediaUrl = _cursor.getColumnIndexOrThrow("wikipediaUrl");
      final int _cursorIndexOfWeight = _cursor.getColumnIndexOrThrow("weight");
      final int _cursorIndexOfUrlImageCat = _cursor.getColumnIndexOrThrow("urlImageCat");
      final List<CatBreed> _result = new ArrayList<CatBreed>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CatBreed _item;
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpLifeSpan;
        _tmpLifeSpan = _cursor.getString(_cursorIndexOfLifeSpan);
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpOrigin;
        _tmpOrigin = _cursor.getString(_cursorIndexOfOrigin);
        final String _tmpTemperament;
        _tmpTemperament = _cursor.getString(_cursorIndexOfTemperament);
        final String _tmpWikipediaUrl;
        _tmpWikipediaUrl = _cursor.getString(_cursorIndexOfWikipediaUrl);
        final Weight _tmpWeight;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfWeight);
        _tmpWeight = __weightTypeConverter.toWeight(_tmp);
        final String _tmpUrlImageCat;
        _tmpUrlImageCat = _cursor.getString(_cursorIndexOfUrlImageCat);
        _item = new CatBreed(_tmpDescription,_tmpName,_tmpLifeSpan,_tmpId,_tmpOrigin,_tmpTemperament,_tmpWikipediaUrl,_tmpWeight,_tmpUrlImageCat);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public CatBreed getCatFromId(String arg0) {
    final String _sql = "SELECT * FROM cat_breed WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (arg0 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, arg0);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfLifeSpan = _cursor.getColumnIndexOrThrow("lifeSpan");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfOrigin = _cursor.getColumnIndexOrThrow("origin");
      final int _cursorIndexOfTemperament = _cursor.getColumnIndexOrThrow("temperament");
      final int _cursorIndexOfWikipediaUrl = _cursor.getColumnIndexOrThrow("wikipediaUrl");
      final int _cursorIndexOfWeight = _cursor.getColumnIndexOrThrow("weight");
      final int _cursorIndexOfUrlImageCat = _cursor.getColumnIndexOrThrow("urlImageCat");
      final CatBreed _result;
      if(_cursor.moveToFirst()) {
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpLifeSpan;
        _tmpLifeSpan = _cursor.getString(_cursorIndexOfLifeSpan);
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpOrigin;
        _tmpOrigin = _cursor.getString(_cursorIndexOfOrigin);
        final String _tmpTemperament;
        _tmpTemperament = _cursor.getString(_cursorIndexOfTemperament);
        final String _tmpWikipediaUrl;
        _tmpWikipediaUrl = _cursor.getString(_cursorIndexOfWikipediaUrl);
        final Weight _tmpWeight;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfWeight);
        _tmpWeight = __weightTypeConverter.toWeight(_tmp);
        final String _tmpUrlImageCat;
        _tmpUrlImageCat = _cursor.getString(_cursorIndexOfUrlImageCat);
        _result = new CatBreed(_tmpDescription,_tmpName,_tmpLifeSpan,_tmpId,_tmpOrigin,_tmpTemperament,_tmpWikipediaUrl,_tmpWeight,_tmpUrlImageCat);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CatBreed> getCatLike(String arg0) {
    final String _sql = "SELECT * FROM cat_breed WHERE name OR id LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (arg0 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, arg0);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfLifeSpan = _cursor.getColumnIndexOrThrow("lifeSpan");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfOrigin = _cursor.getColumnIndexOrThrow("origin");
      final int _cursorIndexOfTemperament = _cursor.getColumnIndexOrThrow("temperament");
      final int _cursorIndexOfWikipediaUrl = _cursor.getColumnIndexOrThrow("wikipediaUrl");
      final int _cursorIndexOfWeight = _cursor.getColumnIndexOrThrow("weight");
      final int _cursorIndexOfUrlImageCat = _cursor.getColumnIndexOrThrow("urlImageCat");
      final List<CatBreed> _result = new ArrayList<CatBreed>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CatBreed _item;
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpLifeSpan;
        _tmpLifeSpan = _cursor.getString(_cursorIndexOfLifeSpan);
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpOrigin;
        _tmpOrigin = _cursor.getString(_cursorIndexOfOrigin);
        final String _tmpTemperament;
        _tmpTemperament = _cursor.getString(_cursorIndexOfTemperament);
        final String _tmpWikipediaUrl;
        _tmpWikipediaUrl = _cursor.getString(_cursorIndexOfWikipediaUrl);
        final Weight _tmpWeight;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfWeight);
        _tmpWeight = __weightTypeConverter.toWeight(_tmp);
        final String _tmpUrlImageCat;
        _tmpUrlImageCat = _cursor.getString(_cursorIndexOfUrlImageCat);
        _item = new CatBreed(_tmpDescription,_tmpName,_tmpLifeSpan,_tmpId,_tmpOrigin,_tmpTemperament,_tmpWikipediaUrl,_tmpWeight,_tmpUrlImageCat);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
