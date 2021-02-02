package com.evgeny.goncharov.coreimpl.mangers

import android.annotation.SuppressLint
import android.content.Context
import com.evgeny.goncharov.coreapi.consts.BaseAnalyticsEvent
import com.evgeny.goncharov.coreapi.managers.AnalyticsManager
import com.evgeny.goncharov.coreapi.qualifier.AppContext
import com.google.firebase.analytics.FirebaseAnalytics
import javax.inject.Inject

/**
 * Реализация контракта менеджера событий
 * @param context аппликейшен для иницилизации:
 * @see FirebaseAnalytics Непосредственно аналитика в которую мы пушим собатия
 */
class AnalyticsManagerImpl @Inject constructor(
    @AppContext private val context: Context
) : AnalyticsManager {

    /**
     * Пермишены прописаны в app манифест
     * непосредственно аналитика в которую мы пушим собатия
     */
    @SuppressLint("MissingPermission")
    private val firebaseAnalytics: FirebaseAnalytics = FirebaseAnalytics.getInstance(context)

    override fun toEvent(event: BaseAnalyticsEvent) {
        firebaseAnalytics.logEvent(event.event, event.bundle)
    }
}