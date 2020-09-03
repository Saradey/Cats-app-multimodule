package com.evgeny.goncharov.main.managers

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.main.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainRouter(
    private val activity: AppCompatActivity
) {

    companion object {
        private const val FIRST_FRAGMENT_TO_SHOW = 1
        private const val EMPTY_FRAGMENT_STACK = 0
        private const val DELAYED_TO_RESET_COUNTER = 2000L
    }

    private var counterBackPressed = 0
    private var mainScope = CoroutineScope(Dispatchers.Main)

    fun onBackPressed() {
        val counter = activity.supportFragmentManager.fragments.count {
            it is BaseFragment
        }
        if (counter != EMPTY_FRAGMENT_STACK) {
            checkoutPressedCounter(counter)
            popBackStackIfNotEmpty(counter)
        } else {
            activity.finish()
        }
    }

    private fun popBackStackIfNotEmpty(counter: Int) {
        if (counter > FIRST_FRAGMENT_TO_SHOW) {
            activity.supportFragmentManager.popBackStack()
        }
    }

    private fun checkoutPressedCounter(counterFragment: Int) {
        mainScope.launch {
            if (counterBackPressed == FIRST_FRAGMENT_TO_SHOW && counterFragment == FIRST_FRAGMENT_TO_SHOW) {
                activity.finish()
            } else {
                if (counterFragment == FIRST_FRAGMENT_TO_SHOW) {
                    showToastWarningExit()
                    counterBackPressed++
                    delay(DELAYED_TO_RESET_COUNTER)
                    counterBackPressed = 0
                }
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
}