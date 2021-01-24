package com.evgeny.goncharov.wallcats.ui.adapters

import androidx.paging.PageKeyedDataSource
import com.evgeny.goncharov.wallcats.model.view.CatBreedEntity
import com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

/**
 * Для пангинации списка стены котов
 * @property viewModel вьюмодель экрана стена котов
 */
class PageKeyedDataSourceCatBreeds(
    private val viewModel: WallCatsViewModel
) : PageKeyedDataSource<Int, CatBreedEntity>() {

    /** Скоуп для запуска корутины которые делают запрос в сеть */
    private var mainScope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    /** Пангинируем страницы */
    private var page = 0

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, CatBreedEntity>
    ) {
        mainScope.launch {
            val result = viewModel.initWallCat()
            page++
            callback.onResult(result, 0, page)
        }
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, CatBreedEntity>) {
        mainScope.launch(CoroutineExceptionHandler { _, throwable ->
            throwable.printStackTrace()
        }) {
            val result = viewModel.loadNextCats(params.key)
            page++
            callback.onResult(result, page)
        }
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, CatBreedEntity>) {}
}