package com.evgeny.goncharov.coreapi

const val VERSION_DATA_BASE = 1

const val CAT_BREED_TABLE_NAME = "cat_breed"
const val CHOOSE_CAT_BREED_TABLE_NAME = "choose_cat_breed"

const val DATA_BASE_NAME = "pisa"


const val CONNECTION_TIMEOUT = 30L
const val READ_TIMEOUT = 30L
const val WRITE_TIMEOUT = 30L

//urls
const val BASE_URL = "https://api.thecatapi.com/"

const val BREEDS_URL = "v1/breeds"
const val IMAGE_SEARCH_URL = "v1/images/search"
const val BREEDS_SEARCH_URL = "v1/breeds/search"

const val GET_PARAM_LIMIT = "limit"
const val GET_PARAM_PAGE = "page"
const val GET_PARAM_BREED_ID = "breed_id"
const val GET_PARAM_Q_SEARCH = "q"


//code
const val RU_CODE = "ru"
const val EN_CODE = "en"


const val LIMIT_PAGE_SIZE_CAT_WALL = 15

const val API_KEY = "93dbaff6-3db6-4ca8-bca8-cd03c57aed23"
const val HEADERS_VALUE = "x-api-key: $API_KEY"