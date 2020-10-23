package com.evgeny.goncharov.main

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreapi.mediators.SplashScreenMediator
import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.main.di.MainActivityComponent
import com.evgeny.goncharov.main.managers.MainRouter
import java.util.Locale

/**
 * Архитектура построена на single activity, единственная активити в проекте
 */
class MainActivity : AppCompatActivity(), WithFacade {

    /** Для установки светлой или темной темы */
    private lateinit var themeManager: ThemeManager

    /** Для установки языка в приложении */
    private lateinit var languageManager: LanguageManager

    /** Для запусука сплен скрина */
    private lateinit var splashScreenMediator: SplashScreenMediator

    /** Логика нажатия на бекпрессед */
    private val routerManager = MainRouter(this)

    init {
        initDaggerGraph()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(themeManager.getThemeNow())
        setContentView(R.layout.activity_main)
        savedInstanceState ?: splashScreenMediator.showSplashScreen(supportFragmentManager)
    }

    /**
     * Иницилизация зависимостей
     */
    private fun initDaggerGraph() {
        MainActivityComponent.init().apply {
            themeManager = provideThemeManager()
            languageManager = provideLanguageManager()
            splashScreenMediator = provideSplashScreenMediator()
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
}