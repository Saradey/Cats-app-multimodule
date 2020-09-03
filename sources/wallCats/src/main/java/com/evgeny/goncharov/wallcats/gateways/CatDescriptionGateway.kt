package com.evgeny.goncharov.wallcats.gateways

import com.evgeny.goncharov.wallcats.model.view.CatDescription

interface CatDescriptionGateway {

    suspend fun loadChooseCatFromInternet(catId: String): CatDescription?

    suspend fun loadChooseCatFromDatabase(catId: String): CatDescription?

    suspend fun loadChooseCatFromDatabaseSpare(catId: String): CatDescription?
}