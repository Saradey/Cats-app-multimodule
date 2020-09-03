package com.evgeny.goncharov.wallcats.gateways

import com.evgeny.goncharov.wallcats.model.request.WallCatRequest
import com.evgeny.goncharov.wallcats.model.view.CatBreedView

interface WallCatGateway {

    suspend fun loadWallCatFromInternet(request: WallCatRequest): List<CatBreedView>

    suspend fun loadWallCatFromDatabase(): List<CatBreedView>
}