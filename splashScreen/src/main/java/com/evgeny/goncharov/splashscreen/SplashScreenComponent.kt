package com.evgeny.goncharov.splashscreen

import com.evgeny.goncharov.coreapi.providers.MediatorsProvider
import dagger.Component

@Component(
    dependencies = [MediatorsProvider::class]
)
interface SplashScreenComponent {

    fun inject(fragment: SplashScreenFragment)
}