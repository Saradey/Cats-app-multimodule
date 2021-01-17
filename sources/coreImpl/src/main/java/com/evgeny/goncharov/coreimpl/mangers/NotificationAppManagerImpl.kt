package com.evgeny.goncharov.coreimpl.mangers

import android.app.NotificationChannel
import android.app.NotificationManager.IMPORTANCE_DEFAULT
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.evgeny.goncharov.coreapi.managers.NotificationAppManager
import com.evgeny.goncharov.coreapi.qualifier.AppContext
import com.evgeny.goncharov.coreimpl.R
import javax.inject.Inject

/**
 * Реализация менеджера отвечающего за создание уведомлений в приложении
 * @param appContext контекст Application
 */
class NotificationAppManagerImpl @Inject constructor(
    @AppContext private val appContext: Context
) : NotificationAppManager {

    override fun startNotificationUserLastSeenDaysAgo() {
        val clazz = getClassMainActivityFromSharedPref()
        val intent = Intent(appContext, clazz)
        val pendingIntent =
            PendingIntent.getActivity(appContext, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val chanelName = appContext.getString(R.string.notification_chanel_name)
            val chanel = NotificationChannel(CHANEL_ID_SER_LAST_SEEN, chanelName, IMPORTANCE_DEFAULT).apply {
                description = appContext.getString(R.string.notification_chanel_title)
            }
            NotificationManagerCompat.from(appContext).createNotificationChannel(chanel)
        }
        val builderNotification = NotificationCompat.Builder(appContext, USER_LAST_SEEN_CHANEL_ID)
            .setSmallIcon(R.drawable.ic_shorthair_cat)
            .setContentTitle(appContext.getString(R.string.notification_title_user_last_seen))
            .setContentText(appContext.getString(R.string.notification_content_user_last_seen))
            .setContentIntent(pendingIntent)
            .setChannelId(CHANEL_ID_SER_LAST_SEEN)
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
        val notifiManager = NotificationManagerCompat.from(appContext)
        notifiManager.notify(NOTIFY_ID_SER_LAST_SEEN, builderNotification.build())
    }

    private fun getClassMainActivityFromSharedPref(): Class<*> {
        val shared = appContext.getSharedPreferences(PENDING_INTENT_MAIN_ACTIVITY_SHARED_NAME, Context.MODE_PRIVATE)
        return Class.forName(shared.getString(PENDING_INTENT_MAIN_ACTIVITY_VALUE_NAME, "").orEmpty())
    }

    override fun setClassMainActivityToSharedPref(clazz: Class<*>) {
        val shared = appContext.getSharedPreferences(PENDING_INTENT_MAIN_ACTIVITY_SHARED_NAME, Context.MODE_PRIVATE)
        val edit = shared.edit()
        edit.putString(PENDING_INTENT_MAIN_ACTIVITY_VALUE_NAME, clazz.name)
        edit.apply()
    }

    override fun onOrOffNotification(): Boolean {
        val shared = appContext.getSharedPreferences(NOTIFICATION_IS_ON_SHARED_NAME, Context.MODE_PRIVATE)
        return shared.getBoolean(NOTIFICATION_IS_ON_VALUE_NAME, true)
    }

    override fun setOnOrOfNotification(isOn: Boolean) {
        val shared = appContext.getSharedPreferences(NOTIFICATION_IS_ON_SHARED_NAME, Context.MODE_PRIVATE)
        val edit = shared.edit()
        edit.putBoolean(NOTIFICATION_IS_ON_VALUE_NAME, isOn)
        edit.apply()
    }

    companion object {

        /** Id для channel если пользователь долго не заходил*/
        private const val USER_LAST_SEEN_CHANEL_ID = "USER_LAST_SEEN_CHANEL_ID"

        /** Id нотификации если пользователь долго не заходил */
        private const val NOTIFY_ID_SER_LAST_SEEN = 21332

        /** Id канала сли пользователь долго не заходил */
        private const val CHANEL_ID_SER_LAST_SEEN = "2341"

        /** Имя шарады из которой мы загружаем имя класса MainActivity */
        private const val PENDING_INTENT_MAIN_ACTIVITY_SHARED_NAME = "PENDING_INTENT_MAIN_ACTIVITY_SHARED_NAME"

        /** Имя параметра в шараде имени класса MainActivity */
        private const val PENDING_INTENT_MAIN_ACTIVITY_VALUE_NAME = "PENDING_INTENT_MAIN_ACTIVITY_VALUE_NAME"

        /** Имя шарады нотификации */
        private const val NOTIFICATION_IS_ON_SHARED_NAME = "NOTIFICATION_IS_ON_SHARED_NAME"

        /** Имя значение нотификации включено/выключено */
        private const val NOTIFICATION_IS_ON_VALUE_NAME = "NOTIFICATION_IS_ON_VALUE_NAME"
    }
}