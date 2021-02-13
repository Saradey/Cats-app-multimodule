package com.evgeny.goncharov.coreapi.utils

import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.evgeny.goncharov.coreapi.R
import com.evgeny.goncharov.coreapi.managers.ThemeManager

/**
 * Обобщённая фабрика для создания вью моделей
 * Используется внутри [ViewModelProvider] ([ViewModelProviders] устаревший класс, начианя с версии 2.2.0)
 *
 * @property creator лямбда для создания экземпляра вью модели
 */
class ViewModelProviderFactory<VM : ViewModel>(
    private val creator: () -> VM
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>) = (creator.invoke() as T)
}

/**
 * Обобщённая фабрика для создания вью моделей
 * Используется внутри [ViewModelProvider] ([ViewModelProviders] устаревший класс, начианя с версии 2.2.0)
 *
 * @property creator лямбда для создания экземпляра вью модели
 * @property hook хук для выполения действий после создания экземпляра вью модели, например загрузки элементов
 */
class ViewModelProviderFactoryHook<VM : ViewModel>(
    private val creator: () -> VM,
    private val hook: ((VM) -> Unit)? = null
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return (creator.invoke() as T).apply {
            hook?.invoke(this as VM)
        }
    }
}

/**
 * Метод иницилизации фрагмента с передачей в него параметров через бандел
 * @param argsInitializer лямбда, инициализирующая параметры фрагмента
 */
fun <T : Fragment> T.withArgs(argsInitializer: Bundle.() -> Unit): T {
    val args = arguments ?: Bundle()
    argsInitializer(args)
    arguments = args
    return this
}

/**
 * Получить Drawable ресурс в зависимости от включенной темы в приложении
 * @param resLight дровебел для светлой темы
 * @param resNight дровебел для темной темы
 * @param themeManager менеджер темы
 * @param resource для ResourcesCompat
 */
fun getDrawableTheme(
    @DrawableRes resLight: Int,
    @DrawableRes resNight: Int,
    themeManager: ThemeManager,
    resource: Resources
): Drawable? = when (themeManager.getThemeNow()) {
    R.style.AppThemeDay -> ResourcesCompat.getDrawable(
        resource,
        resLight,
        null
    )
    else -> ResourcesCompat.getDrawable(
        resource,
        resNight,
        null
    )
}