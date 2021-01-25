package com.evgeny.goncharov.wallcats.model.view

/**
 * Описание кота
 * @property name имя кота
 * @property urlImage урл кота для Glide
 * @property origin место происхождение кота
 * @property lifeSpan сколько живет кот
 * @property weight вес кота в кг
 * @property temperament характер кота
 * @property description описание кота
 * @property urlWiki урла на википедию
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