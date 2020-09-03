package com.evgeny.goncharov.coreimpl.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.evgeny.goncharov.coreapi.dto.converters.WeightTypeConverter.class})
@androidx.room.Database(version = 1, entities = {com.evgeny.goncharov.coreapi.dto.database.CatBreed.class, com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/evgeny/goncharov/coreimpl/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/evgeny/goncharov/coreapi/database/DatabaseContract;", "()V", "coreImpl_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase implements com.evgeny.goncharov.coreapi.database.DatabaseContract {
    
    public AppDatabase() {
        super();
    }
}