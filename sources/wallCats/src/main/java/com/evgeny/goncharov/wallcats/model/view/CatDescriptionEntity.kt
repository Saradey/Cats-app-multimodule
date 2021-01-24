package com.evgeny.goncharov.wallcats.model.view

/**
 * Описание кота
 * @param name имя кота
 * @param urlImage урл кота для Glide
 * @param origin место происхождение кота
 * @param lifeSpan сколько живет кот
 * @param weight вес кота в кг
 * @param temperament характер кота
 * @param description описание кота
 * @param urlWiki урла на википедию
 */
data class CatDescriptionEntity(
    val name: String,
    val urlImage: String,
    val origin: String,
    val lifeSpan: String,
    val weight: String,
    val temperament: String,
    val description: String,
    val urlWiki: String
)