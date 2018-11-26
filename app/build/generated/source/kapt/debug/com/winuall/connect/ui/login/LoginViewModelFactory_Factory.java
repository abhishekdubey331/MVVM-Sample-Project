package com.winuall.connect.ui.login;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginViewModelFactory_Factory implements Factory<LoginViewModelFactory> {
  private final Provider<LoginViewModel> loginViewModelProvider;

  public LoginViewModelFactory_Factory(Provider<LoginViewModel> loginViewModelProvider) {
    this.loginViewModelProvider = loginViewModelProvider;
  }

  @Override
  public LoginViewModelFactory get() {
    return new LoginViewModelFactory(loginViewModelProvider.get());
  }

  public static LoginViewModelFactory_Factory create(
      Provider<LoginViewModel> loginViewModelProvider) {
    return new LoginViewModelFactory_Factory(loginViewModelProvider);
  }
}
