package com.evgeny.goncharov.coreapi.utils

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor

/**
 * Экзекбютер для выполнения тасок в мейн потоке
 */
class MainThreadExecutor : Executor {

    private val handler = Handler(Looper.getMainLooper())

    override fun execute(task: Runnable) {
        handler.post(task)
    }
}