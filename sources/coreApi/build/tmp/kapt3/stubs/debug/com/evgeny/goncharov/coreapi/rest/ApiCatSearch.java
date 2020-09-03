package com.evgeny.goncharov.coreapi.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\'\u00a8\u0006\t"}, d2 = {"Lcom/evgeny/goncharov/coreapi/rest/ApiCatSearch;", "", "getCatDescriptionAsync", "Lkotlinx/coroutines/Deferred;", "", "Lcom/evgeny/goncharov/coreapi/dto/database/ChooseCatBreed;", "request", "", "", "coreApi_debug"})
public abstract interface ApiCatSearch {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "v1/breeds/search")
    @retrofit2.http.Headers(value = {"x-api-key: 93dbaff6-3db6-4ca8-bca8-cd03c57aed23"})
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed>> getCatDescriptionAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> request);
}