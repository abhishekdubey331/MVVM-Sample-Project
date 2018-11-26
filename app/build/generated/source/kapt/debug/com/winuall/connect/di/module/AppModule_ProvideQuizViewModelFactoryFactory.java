package com.winuall.connect.di.module;

import android.arch.lifecycle.ViewModelProvider;
import com.winuall.connect.ui.quizzes.QuizViewModelFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideQuizViewModelFactoryFactory
    implements Factory<ViewModelProvider.Factory> {
  private final AppModule module;

  private final Provider<QuizViewModelFactory> factoryProvider;

  public AppModule_ProvideQuizViewModelFactoryFactory(
      AppModule module, Provider<QuizViewModelFactory> factoryProvider) {
    this.module = module;
    this.factoryProvider = factoryProvider;
  }

  @Override
  public ViewModelProvider.Factory get() {
    return Preconditions.checkNotNull(
        module.provideQuizViewModelFactory(factoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideQuizViewModelFactoryFactory create(
      AppModule module, Provider<QuizViewModelFactory> factoryProvider) {
    return new AppModule_ProvideQuizViewModelFactoryFactory(module, factoryProvider);
  }

  public static ViewModelProvider.Factory proxyProvideQuizViewModelFactory(
      AppModule instance, QuizViewModelFactory factory) {
    return Preconditions.checkNotNull(
        instance.provideQuizViewModelFactory(factory),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
