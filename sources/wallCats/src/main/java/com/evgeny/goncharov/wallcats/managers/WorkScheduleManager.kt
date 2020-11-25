package com.evgeny.goncharov.wallcats.managers

/**
 * Менеджер отвечающий за запуск воркменеджеров в проекте
 */
interface WorkScheduleManager {

    /** Отменить воркменеджер если пользователь долго не заходил */
    fun cancelWorksCheckOutUser()

    /** Стартовать воркменеджер если пользователь долго не заходил */
    fun startWorksCheckOutUser()
}