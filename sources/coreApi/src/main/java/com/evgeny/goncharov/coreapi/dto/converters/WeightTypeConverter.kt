package com.evgeny.goncharov.coreapi.dto.converters

import androidx.room.TypeConverter
import com.evgeny.goncharov.coreapi.dto.database.Weight

class WeightTypeConverter {


    @TypeConverter
    fun fromWeight(model: Weight): String {
        return "${model.imperial};${model.metric}"
    }

    @TypeConverter
    fun toWeight(model: String): Weight {
        val models = model.split(";")
        return Weight(
            imperial = models[0],
            metric = models[1]
        )
    }
}