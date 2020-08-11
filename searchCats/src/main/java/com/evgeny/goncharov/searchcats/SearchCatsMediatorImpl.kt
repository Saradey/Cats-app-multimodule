package com.evgeny.goncharov.searchcats

import androidx.fragment.app.FragmentManager
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator
import com.evgeny.goncharov.searchcats.ui.SearchCatFragment
import javax.inject.Inject

class SearchCatsMediatorImpl @Inject constructor() : SearchCatsMediator {

    override fun goToTheSearchScreen(manager: FragmentManager) {
        val fragment = SearchCatFragment.getInstance()
        manager.beginTransaction()
            .hide(
                manager.fragments.find {
                    it is BaseFragment
                }!!
            )
            .add(R.id.frmRootField, fragment, SearchCatFragment::class.java.name)
            .addToBackStack(SearchCatFragment::class.java.name)
            .commit()
    }
}