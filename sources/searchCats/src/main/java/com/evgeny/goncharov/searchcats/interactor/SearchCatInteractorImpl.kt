package com.evgeny.goncharov.searchcats.interactor

import com.evgeny.goncharov.coreapi.dto.request.GetChooseCatRequest
import com.evgeny.goncharov.searchcats.gateway.SearchCatGateway
import javax.inject.Inject

/**
 * Реализация бизнес кейсов экрана поиска котов
 * @property gateway источник данных искомых котов
 */
class SearchCatInteractorImpl @Inject constructor(
    private val gateway: SearchCatGateway
) : SearchCatInteractor {

    override suspend fun setInputTextSearchView(text: String) = try {
        gateway.loadFromInternet(GetChooseCatRequest(text).createRequest()).filter {
            it.catName.startsWith(text, true)
        }
    } catch (exp: Exception) {
        exp.printStackTrace()
        gateway.loadFromDatabase(text)
    }
}