package com.evgeny.goncharov.coreimpl.mangers

import android.content.Context
import com.evgeny.goncharov.coreapi.managers.SortCatsManager
import com.evgeny.goncharov.coreapi.utils.SortedType
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

    override fun getSortedType(): SortedType {
        val shared = appContext.getSharedPreferences(SHARED_SORT, Context.MODE_PRIVATE)
        return when (shared.getString(SHARED_KEY_SORT, SORT_NAME)) {
            SORT_NAME -> SortedType.SortedName
            SORT_LIFESPAN -> SortedType.SortedLifeSpan
            else -> SortedType.SortedWeight
        }
    }

    override fun setSortedType(type: SortedType) {
        val shared = appContext.getSharedPreferences(SHARED_SORT, Context.MODE_PRIVATE)
        val edit = shared.edit()
        when (type) {
            SortedType.SortedName -> edit.putString(SHARED_KEY_SORT, SORT_NAME)
            SortedType.SortedLifeSpan -> edit.putString(SHARED_KEY_SORT, SORT_LIFESPAN)
            SortedType.SortedWeight -> edit.putString(SHARED_KEY_SORT, SORT_WIGHT)
        }
        edit.apply()
    }
}