// Generated by Dagger (https://dagger.dev).
package com.evgeny.goncharov.searchcats.ui;

import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator;
import com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchCatFragment_MembersInjector implements MembersInjector<SearchCatFragment> {
  private final Provider<SearchCatViewModel> viewModelProvider;

  private final Provider<WallCatsMediator> wallCatsMediatorProvider;

  public SearchCatFragment_MembersInjector(Provider<SearchCatViewModel> viewModelProvider,
      Provider<WallCatsMediator> wallCatsMediatorProvider) {
    this.viewModelProvider = viewModelProvider;
    this.wallCatsMediatorProvider = wallCatsMediatorProvider;
  }

  public static MembersInjector<SearchCatFragment> create(
      Provider<SearchCatViewModel> viewModelProvider,
      Provider<WallCatsMediator> wallCatsMediatorProvider) {
    return new SearchCatFragment_MembersInjector(viewModelProvider, wallCatsMediatorProvider);}

  @Override
  public void injectMembers(SearchCatFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
    injectWallCatsMediator(instance, wallCatsMediatorProvider.get());
  }

  @InjectedFieldSignature("com.evgeny.goncharov.searchcats.ui.SearchCatFragment.viewModel")
  public static void injectViewModel(SearchCatFragment instance, SearchCatViewModel viewModel) {
    instance.viewModel = viewModel;
  }

  @InjectedFieldSignature("com.evgeny.goncharov.searchcats.ui.SearchCatFragment.wallCatsMediator")
  public static void injectWallCatsMediator(SearchCatFragment instance,
      WallCatsMediator wallCatsMediator) {
    instance.wallCatsMediator = wallCatsMediator;
  }
}