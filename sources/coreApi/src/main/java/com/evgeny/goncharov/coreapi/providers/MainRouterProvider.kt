package com.evgeny.goncharov.coreapi.providers

import com.evgeny.goncharov.coreapi.managers.MainRouter

/**
 * Контракт провайдер роутера отвечающего за логику onBackPressed
 */
interface MainRouterProvider {

    /**
     * Провайдит менеджер отвечающий за нажатие onBackPressed
     */
    fun provideMainRouter(): MainRouter
}