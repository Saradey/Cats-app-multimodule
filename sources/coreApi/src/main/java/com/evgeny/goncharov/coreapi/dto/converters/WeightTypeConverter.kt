package com.evgeny.goncharov.coreapi.dto.converters

import androidx.room.TypeConverter
import com.evgeny.goncharov.coreapi.dto.database.WeightDto

/**
 * Конвертер для модели Weight
 */
class WeightTypeConverter {

    /**
     * Кодируем в строку
     * @param model модель
     */
    @TypeConverter
    fun fromWeight(model: WeightDto): String {
        return "${model.imperial};${model.metric}"
    }

    /**
     * Докодируем в модель
     * @param model значение из базы данных
     */
    @TypeConverter
    fun toWeight(model: String): WeightDto {
        val models = model.split(";")
        return WeightDto(
            imperial = models[0],
            metric = models[1]
        )
    }
}