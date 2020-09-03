package com.evgeny.goncharov.main

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.evgeny.goncharov.coreapi.WithFacade
import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreapi.mediators.SplashScreenMediator
import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.main.di.MainComponent
import com.evgeny.goncharov.main.managers.MainRouter
import java.util.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), WithFacade {

    @Inject
    lateinit var themeManager: ThemeManager

    @Inject
    lateinit var languageManager: LanguageManager

    @Inject
    lateinit var splashScreenMediator: SplashScreenMediator

    private val routerManager = MainRouter(this)

    init {
        initDaggerGraph()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        savedInstanceState ?: splashScreenMediator.showSplashScreen(supportFragmentManager)
    }

    private fun initDaggerGraph() {
        MainComponent.init().inject(this)
    }

    override fun getFacade(): ProviderFacade {
        return MainComponent.component!!
    }

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