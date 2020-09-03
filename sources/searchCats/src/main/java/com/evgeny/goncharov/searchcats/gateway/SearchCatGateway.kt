package com.evgeny.goncharov.searchcats.gateway

import com.evgeny.goncharov.searchcats.model.CatCatched

interface SearchCatGateway {

    suspend fun loadFromInternet(request: Map<String, String>): List<CatCatched>

    suspend fun loadFromDatabase(text: String): List<CatCatched>
}