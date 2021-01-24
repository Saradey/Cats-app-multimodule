package com.evgeny.goncharov.searchcats.repository

import com.evgeny.goncharov.coreapi.dto.request.GetChooseCatRequest
import com.evgeny.goncharov.searchcats.model.CatCatchEntity

/**
 * Контракт, источника данных искомых котов
 */
interface SearchCatRepository {

    /**
     * Загрузка искомых котов через интернет
     * @param request параметры запроса
     * @see GetChooseCatRequest модель запроса
     */
    suspend fun loadFromInternet(request: Map<String, String>): List<CatCatchEntity>

    /**
     * Загрузка искомых котов через базу данных
     * @param text имя искомого кота
     */
    suspend fun loadFromDatabase(text: String): List<CatCatchEntity>
}