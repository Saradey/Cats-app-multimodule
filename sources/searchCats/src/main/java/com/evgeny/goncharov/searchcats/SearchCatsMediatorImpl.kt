package com.evgeny.goncharov.searchcats

import androidx.fragment.app.FragmentManager
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator
import com.evgeny.goncharov.searchcats.ui.SearchCatFragment
import javax.inject.Inject

/**
 * Реализация логики перехода на экран поиска котов
 */
class SearchCatsMediatorImpl @Inject constructor() : SearchCatsMediator {

    override fun goToTheSearchScreen(supportFragmentManager: FragmentManager) {
        val fragment = SearchCatFragment.getInstance()
        supportFragmentManager.beginTransaction()
            .hide(
                supportFragmentManager.fragments.find {
                    it is BaseFragment
                }!!
            )
            .add(R.id.frmRootField, fragment, SearchCatFragment::class.java.name)
            .addToBackStack(SearchCatFragment::class.java.name)
            .commit()
    }
}