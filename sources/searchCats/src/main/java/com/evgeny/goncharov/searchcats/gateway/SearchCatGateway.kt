package com.evgeny.goncharov.searchcats.gateway

import com.evgeny.goncharov.searchcats.model.CatCatch

/**
 * Контракт, источника данных искомых котов
 */
interface SearchCatGateway {

    /**
     * Загрузка искомых котов через интернет
     * @param request параметры запроса
     */
    suspend fun loadFromInternet(request: Map<String, String>): List<CatCatch>

    /**
     * Загрузка искомых котов через базу данных
     * @param text имя искомого кота
     */
    suspend fun loadFromDatabase(text: String): List<CatCatch>
}