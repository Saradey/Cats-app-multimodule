package com.evgeny.goncharov.searchcats.interactor

import com.evgeny.goncharov.coreapi.dto.request.GetChooseCatRequest
import com.evgeny.goncharov.searchcats.repository.SearchCatRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Реализация бизнес кейсов экрана поиска котов
 * @property repository источник данных искомых котов
 */
class SearchCatInteractorImpl @Inject constructor(
    private val repository: SearchCatRepository
) : SearchCatInteractor {

    override suspend fun setInputTextSearchView(text: String) = withContext(Dispatchers.Main) {
        val result = try {
            repository.loadFromInternet(GetChooseCatRequest(text).createRequest()).filter {
                it.catName.startsWith(text, true)
            }
        } catch (exp: Exception) {
            exp.printStackTrace()
            repository.loadFromDatabase(text)
        }
        result.sortedBy {
            it.catName
        }
    }
}