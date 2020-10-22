package com.evgeny.goncharov.coreapi.providers

import com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator
import com.evgeny.goncharov.coreapi.mediators.SettingsMediator
import com.evgeny.goncharov.coreapi.mediators.SplashScreenMediator
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator

/**
 * Контракт который провайдит медиаторы
 */
interface MediatorsProvider {

    /**
     * Провайдит медиатор для экрана поиска котов
     */
    fun provideSearchCatsMediator(): SearchCatsMediator

    /**
     * Провайдит медиатор для экрана сплеш скрина
     */
    fun provideSplashScreenMediator(): SplashScreenMediator

    /**
     * Провайдит медиатор для экрана стены котов
     */
    fun provideWallCatsMediator(): WallCatsMediator

    /**
     * Провайдит медиатор для экрана настроек
     */
    fun provideSettingMediator(): SettingsMediator
}