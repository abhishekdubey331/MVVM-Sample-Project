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
public final class QuizRepository_Factory implements Factory<QuizRepository> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<Utils> utilsProvider;

  public QuizRepository_Factory(
      Provider<ApiInterface> apiInterfaceProvider, Provider<Utils> utilsProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.utilsProvider = utilsProvider;
  }

  @Override
  public QuizRepository get() {
    return new QuizRepository(apiInterfaceProvider.get(), utilsProvider.get());
  }

  public static QuizRepository_Factory create(
      Provider<ApiInterface> apiInterfaceProvider, Provider<Utils> utilsProvider) {
    return new QuizRepository_Factory(apiInterfaceProvider, utilsProvider);
  }
}
