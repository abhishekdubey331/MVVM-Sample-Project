package com.winuall.connect.di.module;

import android.arch.lifecycle.ViewModelProvider;
import com.winuall.connect.ui.login.LoginViewModelFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideLoginViewModelFactoryFactory
    implements Factory<ViewModelProvider.Factory> {
  private final AppModule module;

  private final Provider<LoginViewModelFactory> factoryProvider;

  public AppModule_ProvideLoginViewModelFactoryFactory(
      AppModule module, Provider<LoginViewModelFactory> factoryProvider) {
    this.module = module;
    this.factoryProvider = factoryProvider;
  }

  @Override
  public ViewModelProvider.Factory get() {
    return Preconditions.checkNotNull(
        module.provideLoginViewModelFactory(factoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideLoginViewModelFactoryFactory create(
      AppModule module, Provider<LoginViewModelFactory> factoryProvider) {
    return new AppModule_ProvideLoginViewModelFactoryFactory(module, factoryProvider);
  }

  public static ViewModelProvider.Factory proxyProvideLoginViewModelFactory(
      AppModule instance, LoginViewModelFactory factory) {
    return Preconditions.checkNotNull(
        instance.provideLoginViewModelFactory(factory),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
