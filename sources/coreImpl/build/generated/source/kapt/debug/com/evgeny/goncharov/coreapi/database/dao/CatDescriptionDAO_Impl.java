package com.evgeny.goncharov.coreapi.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.evgeny.goncharov.coreapi.dto.converters.WeightTypeConverter;
import com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed;
import com.evgeny.goncharov.coreapi.dto.database.Weight;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unchecked")
public final class CatDescriptionDAO_Impl implements CatDescriptionDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfChooseCatBreed;

  private final WeightTypeConverter __weightTypeConverter = new WeightTypeConverter();

  public CatDescriptionDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChooseCatBreed = new EntityInsertionAdapter<ChooseCatBreed>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `choose_cat_breed`(`id`,`weight`,`name`,`temperament`,`origin`,`description`,`lifeSpan`,`wikipediaUrl`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ChooseCatBreed value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        final String _tmp;
        _tmp = __weightTypeConverter.fromWeight(value.getWeight());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getTemperament() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTemperament());
        }
        if (value.getOrigin() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOrigin());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        if (value.getLifeSpan() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLifeSpan());
        }
        if (value.getWikipediaUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getWikipediaUrl());
        }
      }
    };
  }

  @Override
  public void insert(ChooseCatBreed arg0) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfChooseCatBreed.insert(arg0);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public ChooseCatBreed selectModelFromId(String arg0) {
    final String _sql = "SELECT * FROM choose_cat_breed WHERE name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (arg0 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, arg0);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfWeight = _cursor.getColumnIndexOrThrow("weight");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfTemperament = _cursor.getColumnIndexOrThrow("temperament");
      final int _cursorIndexOfOrigin = _cursor.getColumnIndexOrThrow("origin");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfLifeSpan = _cursor.getColumnIndexOrThrow("lifeSpan");
      final int _cursorIndexOfWikipediaUrl = _cursor.getColumnIndexOrThrow("wikipediaUrl");
      final ChooseCatBreed _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final Weight _tmpWeight;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfWeight);
        _tmpWeight = __weightTypeConverter.toWeight(_tmp);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpTemperament;
        _tmpTemperament = _cursor.getString(_cursorIndexOfTemperament);
        final String _tmpOrigin;
        _tmpOrigin = _cursor.getString(_cursorIndexOfOrigin);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpLifeSpan;
        _tmpLifeSpan = _cursor.getString(_cursorIndexOfLifeSpan);
        final String _tmpWikipediaUrl;
        _tmpWikipediaUrl = _cursor.getString(_cursorIndexOfWikipediaUrl);
        _result = new ChooseCatBreed(_tmpId,_tmpWeight,_tmpName,_tmpTemperament,_tmpOrigin,_tmpDescription,_tmpLifeSpan,_tmpWikipediaUrl);
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
