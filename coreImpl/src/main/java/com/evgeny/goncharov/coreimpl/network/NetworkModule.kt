package com.evgeny.goncharov.coreimpl.network

import android.content.Context
import com.evgeny.goncharov.coreapi.rest.ApiCatSearch
import com.evgeny.goncharov.coreapi.BASE_URL
import com.evgeny.goncharov.coreapi.CONNECTION_TIMEOUT
import com.evgeny.goncharov.coreapi.READ_TIMEOUT
import com.evgeny.goncharov.coreapi.WRITE_TIMEOUT
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.readystatesoftware.chuck.ChuckInterceptor
import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
object NetworkModule {

    @Provides
    @Singleton
    @JvmStatic
    fun provideLoggingInterceptor(buildVariants: Boolean): HttpLoggingInterceptor = HttpLoggingInterceptor().setLevel(
        if (buildVariants) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
    )

    @Provides
    @Singleton
    @JvmStatic
    fun provideHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        context: Context,
        buildVariants: Boolean
    ): OkHttpClient = OkHttpClient.Builder()
        .apply {
            if (buildVariants) addInterceptor(ChuckInterceptor(context))
        }
        .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
        .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
        .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
        .addInterceptor(loggingInterceptor)
        .build()

    @Provides
    @Singleton
    @JvmStatic
    fun provideRetrofit(client: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    @Provides
    @JvmStatic
    @Reusable
    fun provideApiSearchCatFromName(retrofit: Retrofit):
            ApiCatSearch = retrofit.create(ApiCatSearch::class.java)
}