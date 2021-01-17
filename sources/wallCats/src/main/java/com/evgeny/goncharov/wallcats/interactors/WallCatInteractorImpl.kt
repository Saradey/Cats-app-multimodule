package com.evgeny.goncharov.wallcats.interactors

import com.evgeny.goncharov.coreapi.LIMIT_PAGE_SIZE_CAT_WALL
import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.wallcats.model.request.WallCatRequest
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import com.evgeny.goncharov.wallcats.repository.WallCatRepository
import javax.inject.Inject

/**
 * Реализация бизнес логики экрана стены котов
 * @property gateway источник даных экрана стены котов
 */
class WallCatInteractorImpl @Inject constructor(
    private val gateway: WallCatRepository
) : WallCatInteractor {

    override suspend fun loadWallCat() = try {
        sortCats(loadFromInternet())
    } catch (e: Exception) {
        e.printStackTrace()
        sortCats(loadFromDatabase())
    }

    override suspend fun loadNextPage(nextCount: Int) = sortCats(
        gateway.loadWallCatFromInternet(
            WallCatRequest(
                limit = LIMIT_PAGE_SIZE_CAT_WALL,
                page = nextCount
            )
        )
    )

    private suspend fun loadFromDatabase() = gateway.loadWallCatFromDatabase()

    private suspend fun loadFromInternet() = gateway.loadWallCatFromInternet(
        WallCatRequest(
            limit = LIMIT_PAGE_SIZE_CAT_WALL,
            page = 0
        )
    )

    private fun sortCats(models: List<CatBreedView>) = when (gateway.getSortType()) {
        SortType.SortName -> models.sortedBy {
            it.name?.first()
        }
        SortType.SortLifeSpan -> models.sortedBy {
            it.lifeSpan
        }
        else -> models.sortedBy {
            it.weightKg
        }
    }
}