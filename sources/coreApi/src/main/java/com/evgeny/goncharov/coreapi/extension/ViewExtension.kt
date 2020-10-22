package com.evgeny.goncharov.coreapi.extension

import android.view.View

/**
 * Упрощения метода
 * @see View.setVisibility
 * @param visible true показываем, false прячим
 */
fun View.setVisibilityBool(visible: Boolean) {
    visibility = if (visible) {
        View.VISIBLE
    } else {
        View.GONE
    }
}