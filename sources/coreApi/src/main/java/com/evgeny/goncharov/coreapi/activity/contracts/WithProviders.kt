package com.evgeny.goncharov.coreapi.activity.contracts

import com.evgeny.goncharov.coreapi.providers.AndroidComponentsProvider

interface WithProviders {

    /**
     * Получить провайдер всех компонентов android
     */
    fun getProviderAndroidComponent(): AndroidComponentsProvider
}