package com.evgeny.goncharov.splashscreen

import com.evgeny.goncharov.coreapi.providers.MediatorsProvider
import dagger.Component

/**
 * Компонент для экрана сплеш скрина
 */
@Component(dependencies = [MediatorsProvider::class])
interface SplashScreenComponent : MediatorsProvider