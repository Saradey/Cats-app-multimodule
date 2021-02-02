package com.evgeny.goncharov.wallcats.interactors

import com.evgeny.goncharov.coreapi.consts.LIMIT_PAGE_SIZE_CAT_WALL
import com.evgeny.goncharov.coreapi.managers.AnalyticsManager
import com.evgeny.goncharov.coreapi.managers.NetworkManager
import com.evgeny.goncharov.wallcats.analytics.events.FatalLoadWallCatsEvents
import com.evgeny.goncharov.wallcats.model.request.WallCatRequest
import com.evgeny.goncharov.wallcats.model.view.CatBreedEntity
import com.evgeny.goncharov.wallcats.repository.WallCatRepository
import javax.inject.Inject

/**
 * Реализация бизнес логики экрана стены котов
 * @property repository источник даных экрана стены котов
 * @property networkManager предоставляет информацию о подключение к моб сети или wifi
 * @property analyticsManager для эвентов
 */
class WallCatInteractorImpl @Inject constructor(
    private val repository: WallCatRepository,
    private val networkManager: NetworkManager,
    private val analyticsManager: AnalyticsManager
) : WallCatInteractor {

    override suspend fun loadWallCat(): List<CatBreedEntity> {
        return if (networkManager.isConnect())
            try {
                loadFromInternet()
            } catch (e: Exception) {
                e.printStackTrace()
                analyticsManager.toEvent(FatalLoadWallCatsEvents)
                loadFromDatabase()
            }
        else loadFromDatabase()
    }

    override suspend fun loadNextPage(nextCount: Int): List<CatBreedEntity> {
        return if (networkManager.isConnect())
            repository.loadWallCatFromInternet(
                WallCatRequest(
                    limit = LIMIT_PAGE_SIZE_CAT_WALL,
                    page = nextCount
                )
            )
        else emptyList()
    }

    private suspend fun loadFromDatabase() = repository.loadWallCatFromDatabase()

    private suspend fun loadFromInternet() = repository.loadWallCatFromInternet(
        WallCatRequest(
            limit = LIMIT_PAGE_SIZE_CAT_WALL,
            page = 0
        )
    )
}