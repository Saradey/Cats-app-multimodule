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
}