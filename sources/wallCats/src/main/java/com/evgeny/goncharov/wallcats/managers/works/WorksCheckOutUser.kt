package com.evgeny.goncharov.wallcats.managers.works

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.managers.NotificationAppManager

/**
 * Воркер выплолняющий запуск нотификации о том что пользователь долго не заходил
 */
class WorksCheckOutUser(
    context: Context,
    workerParameters: WorkerParameters,
) : Worker(context, workerParameters) {

    /** Менеджер отвечающий за нотификации в проекте */
    private var notiManager: NotificationAppManager

    init {
        val facade = applicationContext as WithFacade
        notiManager = facade.getFacade().provideNotificationManager()
    }

    override fun doWork(): Result {
        notiManager.startNotificationUserLastSeenDaysAgo()
        return Result.success()
    }
}