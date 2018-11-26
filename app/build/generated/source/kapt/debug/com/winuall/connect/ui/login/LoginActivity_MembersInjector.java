package com.winuall.connect.ui.login;

import com.winuall.connect.utils.Utils;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<LoginViewModelFactory> loginViewModelFactoryProvider;

  private final Provider<Utils> utilsProvider;

  public LoginActivity_MembersInjector(
      Provider<LoginViewModelFactory> loginViewModelFactoryProvider,
      Provider<Utils> utilsProvider) {
    this.loginViewModelFactoryProvider = loginViewModelFactoryProvider;
    this.utilsProvider = utilsProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<LoginViewModelFactory> loginViewModelFactoryProvider,
      Provider<Utils> utilsProvider) {
    return new LoginActivity_MembersInjector(loginViewModelFactoryProvider, utilsProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectLoginViewModelFactory(instance, loginViewModelFactoryProvider.get());
    injectUtils(instance, utilsProvider.get());
  }

  public static void injectLoginViewModelFactory(
      LoginActivity instance, LoginViewModelFactory loginViewModelFactory) {
    instance.loginViewModelFactory = loginViewModelFactory;
  }

  public static void injectUtils(LoginActivity instance, Utils utils) {
    instance.utils = utils;
  }
}
