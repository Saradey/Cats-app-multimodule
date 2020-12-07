package com.evgeny.goncharov.coreapi.activity.contracts

import com.evgeny.goncharov.coreapi.providers.ActivityContextProvider

/**
 * Контракт передачи:
 * @see ActivityContextProvider
 */
interface WithProviders {

    /**
     * Получить провайдер всех компонентов android
     */
    fun getProviderAndroidComponent(): ActivityContextProvider
}