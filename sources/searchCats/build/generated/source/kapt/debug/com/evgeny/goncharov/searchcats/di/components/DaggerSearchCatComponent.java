// Generated by Dagger (https://dagger.dev).
package com.evgeny.goncharov.searchcats.di.components;

import com.evgeny.goncharov.coreapi.providers.ProviderFacade;
import com.evgeny.goncharov.searchcats.di.modules.SearchCatProvidesModule_ProvideSearchCatViewModelFactory;
import com.evgeny.goncharov.searchcats.gateway.SearchCatGatewayImpl;
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractorImpl;
import com.evgeny.goncharov.searchcats.ui.SearchCatFragment;
import com.evgeny.goncharov.searchcats.ui.SearchCatFragment_MembersInjector;
import com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel;
import com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel_MembersInjector;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerSearchCatComponent implements SearchCatComponent {
  private final SearchCatFragment fragment;

  private final ProviderFacade providerFacade;

  private DaggerSearchCatComponent(ProviderFacade providerFacadeParam,
      SearchCatFragment fragmentParam) {
    this.fragment = fragmentParam;
    this.providerFacade = providerFacadeParam;
  }

  public static SearchCatComponent.Factory factory() {
    return new Factory();
  }

  private SearchCatViewModel getSearchCatViewModel() {
    return SearchCatProvidesModule_ProvideSearchCatViewModelFactory.provideSearchCatViewModel(fragment);}

  private SearchCatGatewayImpl getSearchCatGatewayImpl() {
    return new SearchCatGatewayImpl(Preconditions.checkNotNull(providerFacade.provideApiCatSearch(), "Cannot return null from a non-@Nullable component method"), Preconditions.checkNotNull(providerFacade.provideCatsWallDao(), "Cannot return null from a non-@Nullable component method"));}

  private SearchCatInteractorImpl getSearchCatInteractorImpl() {
    return new SearchCatInteractorImpl(getSearchCatGatewayImpl());}

  @Override
  public void inject(SearchCatFragment fragment) {
    injectSearchCatFragment(fragment);}

  @Override
  public void inject(SearchCatViewModel viewModel) {
    injectSearchCatViewModel(viewModel);}

  private SearchCatFragment injectSearchCatFragment(SearchCatFragment instance) {
    SearchCatFragment_MembersInjector.injectViewModel(instance, getSearchCatViewModel());
    SearchCatFragment_MembersInjector.injectWallCatsMediator(instance, Preconditions.checkNotNull(providerFacade.provideWallCatsMediator(), "Cannot return null from a non-@Nullable component method"));
    return instance;
  }

  private SearchCatViewModel injectSearchCatViewModel(SearchCatViewModel instance) {
    SearchCatViewModel_MembersInjector.injectInteractor(instance, getSearchCatInteractorImpl());
    return instance;
  }

  private static final class Factory implements SearchCatComponent.Factory {
    @Override
    public SearchCatComponent plus(SearchCatFragment fragment, ProviderFacade provide) {
      Preconditions.checkNotNull(fragment);
      Preconditions.checkNotNull(provide);
      return new DaggerSearchCatComponent(provide, fragment);
    }
  }
}