package com.evgeny.goncharov.coreapi.extension

import android.view.View

fun View.setVisibilityBool(vis: Boolean) {
    visibility = if (vis) {
        View.VISIBLE
    } else {
        View.GONE
    }
}