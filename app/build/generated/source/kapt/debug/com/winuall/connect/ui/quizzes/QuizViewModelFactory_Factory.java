package com.winuall.connect.ui.quizzes;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuizViewModelFactory_Factory implements Factory<QuizViewModelFactory> {
  private final Provider<QuizViewModel> quizViewModelProvider;

  public QuizViewModelFactory_Factory(Provider<QuizViewModel> quizViewModelProvider) {
    this.quizViewModelProvider = quizViewModelProvider;
  }

  @Override
  public QuizViewModelFactory get() {
    return new QuizViewModelFactory(quizViewModelProvider.get());
  }

  public static QuizViewModelFactory_Factory create(Provider<QuizViewModel> quizViewModelProvider) {
    return new QuizViewModelFactory_Factory(quizViewModelProvider);
  }
}
