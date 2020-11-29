package com.evgeny.goncharov.main

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.activity.contracts.WithProviders
import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.MainRouter
import com.evgeny.goncharov.coreapi.managers.NotificationAppManager
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreapi.mediators.SplashScreenMediator
import com.evgeny.goncharov.coreapi.providers.AndroidComponentsProvider
import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.main.di.MainActivityComponent
import java.util.Locale

/**
 * Архитектура построена на single activity, единственная активити в проекте
 */
class MainActivity : AppCompatActivity(), WithFacade, WithProviders {

    /** Для установки светлой или темной темы */
    private lateinit var themeManager: ThemeManager

    /** Для установки языка в приложении */
    private lateinit var languageManager: LanguageManager

    /** Для запусука сплен скрина */
    private lateinit var splashScreenMediator: SplashScreenMediator

    /** Менеджео отвечающий за нотификацию в проекте, для сохранения имени класса MainActivity */
    private lateinit var notificationManager: NotificationAppManager

    /** Логика нажатия на бекпрессед */
    private lateinit var routerManager: MainRouter

    init {
        initDaggerGraph()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        notificationManager.setClassMainActivityToSharedPref(this::class.java)
        setTheme(themeManager.getThemeNow())
        setContentView(R.layout.activity_main)
        savedInstanceState?.run {
            routerManager.splashScreenIsInit(false)
        } ?: splashScreenMediator.showSplashScreen(supportFragmentManager)
    }

    /**
     * Иницилизация зависимостей
     */
    private fun initDaggerGraph() {
        MainActivityComponent.init(this, ProviderFacade.component).apply {
            themeManager = provideThemeManager()
            languageManager = provideLanguageManager()
            splashScreenMediator = provideSplashScreenMediator()
            notificationManager = provideNotificationManager()
            routerManager = provideMainRouter()
        }
    }

    /**
     * Для передачи основного фасада всех компонентов
     */
    override fun getFacade(): ProviderFacade {
        return MainActivityComponent.component!!
    }

    /**
     * Иницилизация локала
     */
    private fun applySelectedAppLanguage(context: Context): Context {
        val locale = languageManager.getUserSelectedLanguageBlocking()
        val config = Configuration(context.resources.configuration)
        Locale.setDefault(locale)
        config.setLocale(locale)
        return context.createConfigurationContext(config)
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(applySelectedAppLanguage(base))
    }

    override fun onBackPressed() {
        routerManager.onBackPressed()
    }

    override fun getProviderAndroidComponent(): AndroidComponentsProvider {
        return MainActivityComponent.component!!
    }

    override fun onDestroy() {
        super.onDestroy()
        MainActivityComponent.component = null
    }
}