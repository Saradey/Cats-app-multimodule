package com.evgeny.goncharov.wallcats.interactors

import com.evgeny.goncharov.wallcats.gateways.CatDescriptionGateway
import com.evgeny.goncharov.wallcats.model.view.CatDescription
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Реализация бизнес логики экрана описание кота
 * @property gateway источник данных экрана описание кота
 */
class CatDescriptionInteractorImpl @Inject constructor(
    private val gateway: CatDescriptionGateway
) : CatDescriptionInteractor {

    /** Id выбранного кота */
    private var catId = ""

    override fun setCatId(catId: String) {
        this.catId = catId
    }

    override suspend fun loadChooseCat(): CatDescription? =
        withContext(Dispatchers.Main) {
            var cat: CatDescription? = null
            cat = try {
                gateway.loadChooseCatFromInternet(catId)
            } catch (exception: Exception) {
                exception.printStackTrace()
                loadChooseCatFromDatabase()
            }
            cat
        }

    private suspend fun loadChooseCatFromDatabase(): CatDescription? {
        val model = gateway.loadChooseCatFromDatabase(catId)
        return model ?: run {
            gateway.loadChooseCatFromDatabaseSpare(catId)
        }
    }
}