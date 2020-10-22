package com.evgeny.goncharov.coreapi.extension

import android.widget.EditText
import androidx.annotation.ColorRes
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat

/**
 * у SearchView нет дефолтного метода для покраски hint текста
 * @param color каким цветом окрасить текст
 */
fun SearchView.setHintTextColor(@ColorRes color: Int) {
    val editText = findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
    editText.setHintTextColor(
        ContextCompat.getColor(
            context,
            color
        )
    )
}

/**
 * у SearchView нет дефолтного метода для покраски search текста
 * @param color каким цветом окрасить текст
 */
fun SearchView.setTextColor(@ColorRes color: Int) {
    val editText = findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
    editText.setTextColor(
        ContextCompat.getColor(
            context,
            color
        )
    )
}