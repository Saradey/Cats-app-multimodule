package com.evgeny.goncharov.coreimpl.mangers

import android.content.Context
import com.evgeny.goncharov.coreapi.managers.SortCatsManager
import com.evgeny.goncharov.coreapi.utils.SortType
import javax.inject.Inject

/**
 * Реализация менеджера предоставляющего тип сортировки
 * @property appContext контект для получения шарады
 */
class SortCatsTypeManagerImpl @Inject constructor(
    private val appContext: Context
) : SortCatsManager {

    companion object {

        /** Имя шарады */
        private const val SHARED_SORT = "SHARED_SORTED"

        /** Имя значения в шараде */
        private const val SHARED_KEY_SORT = "SHARED_KEY_SORTED"

        /** Сортировка по алфовиту */
        private const val SORT_NAME = "SORTED_NAME"

        /** Сортировка по жизненному циклу */
        private const val SORT_LIFESPAN = "SORTED_LIFESPAN"

        /** Сортировка по весу */
        private const val SORT_WIGHT = "SORTED_WIGHT"
    }

    override fun getSortedType(): SortType {
        val shared = appContext.getSharedPreferences(SHARED_SORT, Context.MODE_PRIVATE)
        return when (shared.getString(SHARED_KEY_SORT, SORT_NAME)) {
            SORT_NAME -> SortType.SortName
            SORT_LIFESPAN -> SortType.SortLifeSpan
            else -> SortType.SortWeight
        }
    }

    override fun setSortedType(type: SortType) {
        val shared = appContext.getSharedPreferences(SHARED_SORT, Context.MODE_PRIVATE)
        val edit = shared.edit()
        when (type) {
            SortType.SortName -> edit.putString(SHARED_KEY_SORT, SORT_NAME)
            SortType.SortLifeSpan -> edit.putString(SHARED_KEY_SORT, SORT_LIFESPAN)
            SortType.SortWeight -> edit.putString(SHARED_KEY_SORT, SORT_WIGHT)
        }
        edit.apply()
    }
}