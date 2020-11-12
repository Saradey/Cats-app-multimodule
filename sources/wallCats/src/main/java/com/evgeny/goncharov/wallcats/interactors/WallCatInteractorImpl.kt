package com.evgeny.goncharov.wallcats.interactors

import com.evgeny.goncharov.coreapi.LIMIT_PAGE_SIZE_CAT_WALL
import com.evgeny.goncharov.wallcats.gateways.WallCatGateway
import com.evgeny.goncharov.wallcats.model.request.WallCatRequest
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import javax.inject.Inject

/**
 * Реализауия бизнес логики экрана стены котов
 * @property gateway источник даных экрана стены котов
 */
class WallCatInteractorImpl @Inject constructor(
    private val gateway: WallCatGateway
) : WallCatInteractor {

    override suspend fun loadWallCat(): List<CatBreedView> = try {
        loadFromInternet()
    } catch (e: Exception) {
        e.printStackTrace()
        loadFromDatabase()
    }

    override suspend fun loadNexPage(nextCount: Int): List<CatBreedView> =
        gateway.loadWallCatFromInternet(
            WallCatRequest(
                limit = LIMIT_PAGE_SIZE_CAT_WALL,
                page = nextCount
            )
        )

    private suspend fun loadFromDatabase(): List<CatBreedView> =
        gateway.loadWallCatFromDatabase()

    private suspend fun loadFromInternet(): List<CatBreedView> =
        gateway.loadWallCatFromInternet(
            WallCatRequest(
                limit = LIMIT_PAGE_SIZE_CAT_WALL,
                page = 0
            )
        )
}