// Generated by Dagger (https://dagger.dev).
package com.evgeny.goncharov.wallcats.di.components;

import com.evgeny.goncharov.coreapi.providers.ProviderFacade;
import com.evgeny.goncharov.wallcats.di.modules.CatDescriptionProvidesModule_ProvideCatDescriptionViewModelFactory;
import com.evgeny.goncharov.wallcats.gateways.CatDescriptionGatewayImpl;
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractorImpl;
import com.evgeny.goncharov.wallcats.ui.CatDescriptionFragment;
import com.evgeny.goncharov.wallcats.ui.CatDescriptionFragment_MembersInjector;
import com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel;
import com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel_MembersInjector;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCatDescriptionComponent implements CatDescriptionComponent {
  private final CatDescriptionFragment fragment;

  private final ProviderFacade providerFacade;

  private DaggerCatDescriptionComponent(ProviderFacade providerFacadeParam,
      CatDescriptionFragment fragmentParam) {
    this.fragment = fragmentParam;
    this.providerFacade = providerFacadeParam;
  }

  public static CatDescriptionComponent.Factory factory() {
    return new Factory();
  }

  private CatDescriptionViewModel getCatDescriptionViewModel() {
    return CatDescriptionProvidesModule_ProvideCatDescriptionViewModelFactory.provideCatDescriptionViewModel(fragment);}

  private CatDescriptionGatewayImpl getCatDescriptionGatewayImpl() {
    return new CatDescriptionGatewayImpl(Preconditions.checkNotNull(providerFacade.provideApiCatSearch(), "Cannot return null from a non-@Nullable component method"), Preconditions.checkNotNull(providerFacade.provideCatDescriptionDAO(), "Cannot return null from a non-@Nullable component method"), Preconditions.checkNotNull(providerFacade.provideCatsWallDao(), "Cannot return null from a non-@Nullable component method"));}

  private CatDescriptionInteractorImpl getCatDescriptionInteractorImpl() {
    return new CatDescriptionInteractorImpl(getCatDescriptionGatewayImpl());}

  @Override
  public void inject(CatDescriptionFragment fragment) {
    injectCatDescriptionFragment(fragment);}

  @Override
  public void inject(CatDescriptionViewModel viewModel) {
    injectCatDescriptionViewModel(viewModel);}

  private CatDescriptionFragment injectCatDescriptionFragment(CatDescriptionFragment instance) {
    CatDescriptionFragment_MembersInjector.injectViewModel(instance, getCatDescriptionViewModel());
    return instance;
  }

  private CatDescriptionViewModel injectCatDescriptionViewModel(CatDescriptionViewModel instance) {
    CatDescriptionViewModel_MembersInjector.injectInteractor(instance, getCatDescriptionInteractorImpl());
    return instance;
  }

  private static final class Factory implements CatDescriptionComponent.Factory {
    @Override
    public CatDescriptionComponent plus(CatDescriptionFragment fragment, ProviderFacade provide) {
      Preconditions.checkNotNull(fragment);
      Preconditions.checkNotNull(provide);
      return new DaggerCatDescriptionComponent(provide, fragment);
    }
  }
}