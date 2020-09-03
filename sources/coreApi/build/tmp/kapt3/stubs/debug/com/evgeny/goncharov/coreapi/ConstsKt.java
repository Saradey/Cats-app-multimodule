package com.evgeny.goncharov.coreapi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"API_KEY", "", "BASE_URL", "BREEDS_SEARCH_URL", "BREEDS_URL", "CAT_BREED_TABLE_NAME", "CHOOSE_CAT_BREED_TABLE_NAME", "CONNECTION_TIMEOUT", "", "DATA_BASE_NAME", "EN_CODE", "GET_PARAM_BREED_ID", "GET_PARAM_LIMIT", "GET_PARAM_PAGE", "GET_PARAM_Q_SEARCH", "HEADERS_VALUE", "IMAGE_SEARCH_URL", "LIMIT_PAGE_SIZE_CAT_WALL", "", "READ_TIMEOUT", "RU_CODE", "VERSION_DATA_BASE", "WRITE_TIMEOUT", "coreApi_debug"})
public final class ConstsKt {
    public static final int VERSION_DATA_BASE = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CAT_BREED_TABLE_NAME = "cat_breed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHOOSE_CAT_BREED_TABLE_NAME = "choose_cat_breed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATA_BASE_NAME = "pisa";
    public static final long CONNECTION_TIMEOUT = 30L;
    public static final long READ_TIMEOUT = 30L;
    public static final long WRITE_TIMEOUT = 30L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.thecatapi.com/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BREEDS_URL = "v1/breeds";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_SEARCH_URL = "v1/images/search";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BREEDS_SEARCH_URL = "v1/breeds/search";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_PARAM_LIMIT = "limit";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_PARAM_PAGE = "page";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_PARAM_BREED_ID = "breed_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_PARAM_Q_SEARCH = "q";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RU_CODE = "ru";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EN_CODE = "en";
    public static final int LIMIT_PAGE_SIZE_CAT_WALL = 15;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "93dbaff6-3db6-4ca8-bca8-cd03c57aed23";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADERS_VALUE = "x-api-key: 93dbaff6-3db6-4ca8-bca8-cd03c57aed23";
}