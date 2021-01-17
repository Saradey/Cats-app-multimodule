package com.evgeny.goncharov.coreapi.exception

/**
 * Выбрасывается если по какой то причине модель выбранного кота null
 */
class ChooseCateNullPointerException : Exception(ERROR_MESSAGE) {

    companion object {

        /** Сообщение ошибки */
        const val ERROR_MESSAGE = "Cat selected is bad selected"
    }
}