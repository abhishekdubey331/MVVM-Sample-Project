package com.winuall.connect.data.repository;

import com.winuall.connect.data.remote.ApiInterface;
import com.winuall.connect.utils.Utils;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<Utils> utilsProvider;

  public UserRepository_Factory(
      Provider<ApiInterface> apiInterfaceProvider, Provider<Utils> utilsProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.utilsProvider = utilsProvider;
  }

  @Override
  public UserRepository get() {
    return new UserRepository(apiInterfaceProvider.get(), utilsProvider.get());
  }

  public static UserRepository_Factory create(
      Provider<ApiInterface> apiInterfaceProvider, Provider<Utils> utilsProvider) {
    return new UserRepository_Factory(apiInterfaceProvider, utilsProvider);
  }
}
