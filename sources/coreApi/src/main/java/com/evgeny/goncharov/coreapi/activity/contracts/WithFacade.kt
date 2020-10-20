package com.evgeny.goncharov.coreapi.activity.contracts

import com.evgeny.goncharov.coreapi.providers.ProviderFacade

/**
 * Контракт Активити получить компонент фасад
 */
interface WithFacade {

    /**
     * Получить фасад всех провайдеров
     */
    fun getFacade(): ProviderFacade
}