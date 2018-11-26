package com.winuall.connect.di.module;

import android.app.Application;
import com.winuall.connect.persistance.local.Database;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCryptocurrenciesDatabaseFactory implements Factory<Database> {
  private final AppModule module;

  private final Provider<Application> appProvider;

  public AppModule_ProvideCryptocurrenciesDatabaseFactory(
      AppModule module, Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public Database get() {
    return Preconditions.checkNotNull(
        module.provideCryptocurrenciesDatabase(appProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideCryptocurrenciesDatabaseFactory create(
      AppModule module, Provider<Application> appProvider) {
    return new AppModule_ProvideCryptocurrenciesDatabaseFactory(module, appProvider);
  }

  public static Database proxyProvideCryptocurrenciesDatabase(AppModule instance, Application app) {
    return Preconditions.checkNotNull(
        instance.provideCryptocurrenciesDatabase(app),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
