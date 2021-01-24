package com.evgeny.goncharov.wallcats.interactors

import com.evgeny.goncharov.wallcats.model.view.CatDescriptionEntity
import com.evgeny.goncharov.wallcats.repository.CatDescriptionRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Реализация бизнес логики экрана описание кота
 * @property repository источник данных экрана описание кота
 */
class CatDescriptionInteractorImpl @Inject constructor(
    private val repository: CatDescriptionRepository
) : CatDescriptionInteractor {

    /** Id выбранного кота */
    private var catId = ""

    override fun setCatId(catId: String) {
        this.catId = catId
    }

    override suspend fun loadChooseCat(): CatDescriptionEntity? =
        withContext(Dispatchers.Main) {
            var cat: CatDescriptionEntity? = null
            cat = try {
                repository.loadChooseCatFromInternet(catId)
            } catch (exception: Exception) {
                exception.printStackTrace()
                loadChooseCatFromDatabase()
            }
            cat
        }

    private suspend fun loadChooseCatFromDatabase(): CatDescriptionEntity? {
        val model = repository.loadChooseCatFromDatabase(catId)
        return model ?: run {
            repository.loadChooseCatFromDatabaseSpare(catId)
        }
    }
}