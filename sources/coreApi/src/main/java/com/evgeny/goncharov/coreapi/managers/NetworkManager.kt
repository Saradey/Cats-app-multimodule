package com.evgeny.goncharov.coreapi.managers

/**
 * Контракт предоставляющий информацию о подключении к сети
 */
interface NetworkManager {

    /**
     * Возвращает true есть интернет
     * false нету интернета
     */
    fun isConnect() : Boolean

}