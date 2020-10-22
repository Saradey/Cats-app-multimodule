package com.evgeny.goncharov.coreapi.providers

import com.evgeny.goncharov.coreapi.rest.ApiCatSearch
import retrofit2.Retrofit

/**
 * Контракт провайдер для сетевого слоя
 */
interface NetworkProvider {

    /**
     * Провайдит ретрофит
     */
    fun provideRetrofit(): Retrofit

    /**
     * Провайдит api для поиска кота по имени или id
     */
    fun provideApiCatSearch(): ApiCatSearch
}