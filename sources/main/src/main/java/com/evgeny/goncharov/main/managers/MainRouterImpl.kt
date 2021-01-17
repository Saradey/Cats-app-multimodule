package com.evgeny.goncharov.main.managers

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.evgeny.goncharov.coreapi.managers.MainRouter
import com.evgeny.goncharov.main.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainRouterImpl @Inject constructor(
    private val activity: AppCompatActivity
) : MainRouter {

    /** Количество нажатых бекпрессед */
    private var counterBackPressed = 0

    /** Флаг который определяет, сейчас у нас сплеш скрин открыт или нет */
    private var slashScreenIsInit = true

    /** Для запуска задержки */
    private var mainScope = CoroutineScope(Dispatchers.Main)

    override fun onBackPressed() {
        when {
            slashScreenIsInit -> activity.finish()
            activity.supportFragmentManager.popBackStackImmediate().not() -> checkoutPressedCounter()
        }
    }

    private fun checkoutPressedCounter() {
        mainScope.launch {
            if (counterBackPressed == FIRST_FRAGMENT_TO_SHOW) {
                activity.finish()
            } else {
                showToastWarningExit()
                counterBackPressed++
                delay(DELAYED_TO_RESET_COUNTER)
                counterBackPressed = 0
            }
        }
    }

    private fun showToastWarningExit() {
        Toast.makeText(
            activity,
            R.string.back_pressed_common,
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun splashScreenIsInit(isInit: Boolean) {
        slashScreenIsInit = isInit
    }

    companion object {

        /** Константа обозначающая что в стеке остался один фрагмент */
        private const val FIRST_FRAGMENT_TO_SHOW = 1

        /** Задержка между нажатиями на онбекпрессед */
        private const val DELAYED_TO_RESET_COUNTER = 2000L
    }
}