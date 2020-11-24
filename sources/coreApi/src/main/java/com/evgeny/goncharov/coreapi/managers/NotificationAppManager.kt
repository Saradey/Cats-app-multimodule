package com.evgeny.goncharov.coreapi.managers

/**
 * Менеджер отвечающий за создания нотификаций в приложении
 */
interface NotificationAppManager {

    /**
     * Показать нотификацию о то что пользователь долго не заходил
     */
    fun startNotificationUserLastSeenDaysAgo()

    /**
     * Сохраняем тип класса MainActivity для PendingIntent
     * @param clazz тип MainActivity
     */
    fun setClassMainActivityToSharedPref(clazz: Class<*>)

    /**
     * Проверка включены нотификации в приложении или нет
     */
    fun onOrOffNotification(): Boolean

    /**
     * Обновили значение нотификации включили/выключили
     */
    fun setOnOrOfNotification(isOn: Boolean)
}