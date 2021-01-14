package com.evgeny.goncharov.coreapi.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Обобщённая фабрика для создания вью моделей
 * Используется внутри [ViewModelProvider] ([ViewModelProviders] устаревший класс, начианя с версии 2.2.0)
 *
 * @param creator лямбда для создания экземпляра вью модели
 * @param hook хук для выполения действий после создания экземпляра вью модели, например загрузки элементов
 */
class ViewModelProviderFactory<VM : ViewModel>(
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