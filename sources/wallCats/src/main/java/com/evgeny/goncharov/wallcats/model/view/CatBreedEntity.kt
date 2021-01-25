package com.evgeny.goncharov.wallcats.model.view

/**
 * Дата класс для отображения списка стены котов
 * @property name имя кота
 * @property description описание кота
 * @property id айдишник кота
 * @property urlImage урл картинки кота
 * @property wikipediaUrl ссылка на википедию подробного описания кота
 * @property lifeSpan сколько живет кот
 * @property weightKg вес в кг кота
 * @property isAnimated флаг для воспроизведения анимации холдера
 */
data class CatBreedEntity(
    val name: String? = null,
    val description: String? = null,
    val id: String? = null,
    var urlImage: String? = null,
    val wikipediaUrl: String? = null,
    val lifeSpan: Int? = null,
    val weightKg: Int? = null,
    var isAnimated: Boolean = false
)