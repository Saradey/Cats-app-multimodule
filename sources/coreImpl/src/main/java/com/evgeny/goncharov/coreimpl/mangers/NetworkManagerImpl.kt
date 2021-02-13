package com.evgeny.goncharov.coreimpl.mangers

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import com.evgeny.goncharov.coreapi.managers.NetworkManager
import com.evgeny.goncharov.coreapi.qualifier.AppContext
import javax.inject.Inject

/**
 * Реализация контракта менеджера предоставляющего информацию о сети
 * @property context это application
 */
class NetworkManagerImpl @Inject constructor(
    @AppContext private val context: Context
) : NetworkManager {

    //перишены указаны в app модуле
    @SuppressLint("MissingPermission")
    override fun isConnect(): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        connectivityManager ?: return false
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val networkCapabilities =
                connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
            networkCapabilities ?: return false
            networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ||
                    networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)
        } else {
            connectivityManager.allNetworks.any { network ->
                val networkInfo = connectivityManager.getNetworkInfo(network)
                (networkInfo?.type == ConnectivityManager.TYPE_WIFI ||
                        networkInfo?.type == ConnectivityManager.TYPE_MOBILE) && networkInfo.isConnected
            }
        }
    }
}