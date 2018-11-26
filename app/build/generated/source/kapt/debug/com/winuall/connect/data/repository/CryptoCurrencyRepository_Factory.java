package com.winuall.connect.data.repository;

import com.winuall.connect.data.remote.ApiInterface;
import com.winuall.connect.persistance.dao.CryptoCurrencyDao;
import com.winuall.connect.utils.Utils;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CryptoCurrencyRepository_Factory implements Factory<CryptoCurrencyRepository> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<CryptoCurrencyDao> cryptoCurrencyDaoProvider;

  private final Provider<Utils> utilsProvider;

  public CryptoCurrencyRepository_Factory(
      Provider<ApiInterface> apiInterfaceProvider,
      Provider<CryptoCurrencyDao> cryptoCurrencyDaoProvider,
      Provider<Utils> utilsProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.cryptoCurrencyDaoProvider = cryptoCurrencyDaoProvider;
    this.utilsProvider = utilsProvider;
  }

  @Override
  public CryptoCurrencyRepository get() {
    return new CryptoCurrencyRepository(
        apiInterfaceProvider.get(), cryptoCurrencyDaoProvider.get(), utilsProvider.get());
  }

  public static CryptoCurrencyRepository_Factory create(
      Provider<ApiInterface> apiInterfaceProvider,
      Provider<CryptoCurrencyDao> cryptoCurrencyDaoProvider,
      Provider<Utils> utilsProvider) {
    return new CryptoCurrencyRepository_Factory(
        apiInterfaceProvider, cryptoCurrencyDaoProvider, utilsProvider);
  }
}
