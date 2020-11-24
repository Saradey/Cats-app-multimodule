package com.evgeny.goncharov.wallcats.managers

import android.content.Context
import androidx.work.PeriodicWorkRequest
import androidx.work.WorkManager
import com.evgeny.goncharov.coreapi.qualifier.ActivityContext
import com.evgeny.goncharov.wallcats.managers.works.WorksCheckOutUser
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Реализация менеджера отвечающего за все воркменеджеры в проекте
 */
class WorkScheduleManagerImpl @Inject constructor(
    @ActivityContext private val activityContext: Context
) : WorkScheduleManager {

    companion object {

        /** Интервал с которой необходимо запускать ворк менеджер, в часах */
        private const val INTERVAL_WORK_WORKER_CHECK_OUT_USER = 15L
    }

    override fun cancelWorksCheckOutUser() {
        WorkManager.getInstance(activityContext).cancelAllWorkByTag(WorksCheckOutUser::class.java.name)
    }

    override fun startWorksCheckOutUser() {
        val workerRequest =
            PeriodicWorkRequest.Builder(
                WorksCheckOutUser::class.java,
                INTERVAL_WORK_WORKER_CHECK_OUT_USER,
                TimeUnit.MINUTES
            ).addTag(WorksCheckOutUser::class.java.name)
                .setInitialDelay(
                    INTERVAL_WORK_WORKER_CHECK_OUT_USER,
                    TimeUnit.MINUTES
                )
                .build()
        WorkManager.getInstance(activityContext)
            .enqueue(workerRequest)
    }
}