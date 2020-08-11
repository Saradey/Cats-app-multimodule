package com.evgeny.goncharov.coreapi.providers

import com.evgeny.goncharov.coreapi.rest.ApiCatSearch
import retrofit2.Retrofit

interface NetworkProvider {

    fun provideRetrofit(): Retrofit

    fun provideApiCatSearch(): ApiCatSearch
}