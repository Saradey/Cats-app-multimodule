package com.evgeny.goncharov.coreapi.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0007H\'J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\r"}, d2 = {"Lcom/evgeny/goncharov/coreapi/database/dao/CatsWallDao;", "", "getCatBreed", "", "Lcom/evgeny/goncharov/coreapi/dto/database/CatBreed;", "getCatFromId", "id", "", "getCatLike", "value", "insertWallCat", "", "model", "coreApi_debug"})
public abstract interface CatsWallDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertWallCat(@org.jetbrains.annotations.NotNull()
    java.util.List<com.evgeny.goncharov.coreapi.dto.database.CatBreed> model);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM cat_breed")
    public abstract java.util.List<com.evgeny.goncharov.coreapi.dto.database.CatBreed> getCatBreed();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM cat_breed WHERE id = :id")
    public abstract com.evgeny.goncharov.coreapi.dto.database.CatBreed getCatFromId(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM cat_breed WHERE name OR id LIKE :value")
    public abstract java.util.List<com.evgeny.goncharov.coreapi.dto.database.CatBreed> getCatLike(@org.jetbrains.annotations.NotNull()
    java.lang.String value);
}