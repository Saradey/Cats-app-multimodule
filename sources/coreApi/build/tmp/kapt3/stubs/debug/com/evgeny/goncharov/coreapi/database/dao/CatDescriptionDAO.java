package com.evgeny.goncharov.coreapi.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/evgeny/goncharov/coreapi/database/dao/CatDescriptionDAO;", "", "insert", "", "model", "Lcom/evgeny/goncharov/coreapi/dto/database/ChooseCatBreed;", "selectModelFromId", "name", "", "coreApi_debug"})
public abstract interface CatDescriptionDAO {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed model);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM choose_cat_breed WHERE name = :name")
    public abstract com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed selectModelFromId(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
}