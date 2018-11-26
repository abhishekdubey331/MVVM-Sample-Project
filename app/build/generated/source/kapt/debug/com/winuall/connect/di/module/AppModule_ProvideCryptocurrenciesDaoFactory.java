package com.winuall.connect.di.module;

import com.winuall.connect.persistance.dao.CryptoCurrencyDao;
import com.winuall.connect.persistance.local.Database;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCryptocurrenciesDaoFactory
    implements Factory<CryptoCurrencyDao> {
  private final AppModule module;

  private final Provider<Database> databaseProvider;

  public AppModule_ProvideCryptocurrenciesDaoFactory(
      AppModule module, Provider<Database> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public CryptoCurrencyDao get() {
    return Preconditions.checkNotNull(
        module.provideCryptocurrenciesDao(databaseProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideCryptocurrenciesDaoFactory create(
      AppModule module, Provider<Database> databaseProvider) {
    return new AppModule_ProvideCryptocurrenciesDaoFactory(module, databaseProvider);
  }

  public static CryptoCurrencyDao proxyProvideCryptocurrenciesDao(
      AppModule instance, Database database) {
    return Preconditions.checkNotNull(
        instance.provideCryptocurrenciesDao(database),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
