// Generated by Dagger (https://dagger.dev).
package com.evgeny.goncharov.coreimpl.network;

import android.content.Context;
import com.evgeny.goncharov.coreapi.providers.ContextProvider;
import com.evgeny.goncharov.coreapi.rest.ApiCatSearch;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.SingleCheck;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerNetworkComponent implements NetworkComponent {
  private Provider<Boolean> provideBuildVariantsProvider;

  private Provider<HttpLoggingInterceptor> provideLoggingInterceptorProvider;

  private Provider<Context> provideContextProvider;

  private Provider<OkHttpClient> provideHttpClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<ApiCatSearch> provideApiSearchCatFromNameProvider;

  private DaggerNetworkComponent(ContextProvider contextProviderParam) {

    initialize(contextProviderParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ContextProvider contextProviderParam) {
    this.provideBuildVariantsProvider = new com_evgeny_goncharov_coreapi_providers_ContextProvider_provideBuildVariants(contextProviderParam);
    this.provideLoggingInterceptorProvider = DoubleCheck.provider(NetworkModule_ProvideLoggingInterceptorFactory.create(provideBuildVariantsProvider));
    this.provideContextProvider = new com_evgeny_goncharov_coreapi_providers_ContextProvider_provideContext(contextProviderParam);
    this.provideHttpClientProvider = DoubleCheck.provider(NetworkModule_ProvideHttpClientFactory.create(provideLoggingInterceptorProvider, provideContextProvider, provideBuildVariantsProvider));
    this.provideRetrofitProvider = DoubleCheck.provider(NetworkModule_ProvideRetrofitFactory.create(provideHttpClientProvider));
    this.provideApiSearchCatFromNameProvider = SingleCheck.provider(NetworkModule_ProvideApiSearchCatFromNameFactory.create(provideRetrofitProvider));
  }

  @Override
  public Retrofit provideRetrofit() {
    return provideRetrofitProvider.get();}

  @Override
  public ApiCatSearch provideApiCatSearch() {
    return provideApiSearchCatFromNameProvider.get();}

  public static final class Builder {
    private ContextProvider contextProvider;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder contextProvider(ContextProvider contextProvider) {
      this.contextProvider = Preconditions.checkNotNull(contextProvider);
      return this;
    }

    public NetworkComponent build() {
      Preconditions.checkBuilderRequirement(contextProvider, ContextProvider.class);
      return new DaggerNetworkComponent(contextProvider);
    }
  }

  private static class com_evgeny_goncharov_coreapi_providers_ContextProvider_provideBuildVariants implements Provider<Boolean> {
    private final ContextProvider contextProvider;

    com_evgeny_goncharov_coreapi_providers_ContextProvider_provideBuildVariants(
        ContextProvider contextProvider) {
      this.contextProvider = contextProvider;
    }

    @Override
    public Boolean get() {
      return contextProvider.provideBuildVariants();
    }
  }

  private static class com_evgeny_goncharov_coreapi_providers_ContextProvider_provideContext implements Provider<Context> {
    private final ContextProvider contextProvider;

    com_evgeny_goncharov_coreapi_providers_ContextProvider_provideContext(
        ContextProvider contextProvider) {
      this.contextProvider = contextProvider;
    }

    @Override
    public Context get() {
      return Preconditions.checkNotNull(contextProvider.provideContext(), "Cannot return null from a non-@Nullable component method");
    }
  }
}