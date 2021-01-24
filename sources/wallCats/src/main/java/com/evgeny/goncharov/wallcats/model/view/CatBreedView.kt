package com.evgeny.goncharov.wallcats.model.view

/**
 * Дата класс для отображения списка стены котов
 * @param name имя кота
 * @param description описание кота
 * @param id айдишник кота
 * @param urlImage урл картинки кота
 * @param wikipediaUrl ссылка на википедию подробного описания кота
 * @param lifeSpan сколько живет кот
 * @param weightKg вес в кг кота
 * @param isAnimated флаг для воспроизведения анимации холдера
 */
data class CatBreedView(
    val name: String? = null,
    val description: String? = null,
    val id: String? = null,
    var urlImage: String? = null,
    val wikipediaUrl: String? = null,
    val lifeSpan: Int? = null,
    val weightKg: Int? = null,
    var isAnimated: Boolean = false
)