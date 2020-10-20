package com.evgeny.goncharov.coreapi.dto.converters

import androidx.room.TypeConverter
import com.evgeny.goncharov.coreapi.dto.database.Weight

/**
 * Конвертер для модели Weight
 */
class WeightTypeConverter {

    /**
     * Кодируем в строку
     * @param model модель
     */
    @TypeConverter
    fun fromWeight(model: Weight): String {
        return "${model.imperial};${model.metric}"
    }

    /**
     * Докодируем в модель
     * @param model значение из базы данных
     */
    @TypeConverter
    fun toWeight(model: String): Weight {
        val models = model.split(";")
        return Weight(
            imperial = models[0],
            metric = models[1]
        )
    }
}