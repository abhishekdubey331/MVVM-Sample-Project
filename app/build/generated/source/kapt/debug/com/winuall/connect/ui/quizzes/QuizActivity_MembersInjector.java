package com.winuall.connect.ui.quizzes;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuizActivity_MembersInjector implements MembersInjector<QuizActivity> {
  private final Provider<QuizViewModelFactory> quizViewModelFactoryProvider;

  public QuizActivity_MembersInjector(Provider<QuizViewModelFactory> quizViewModelFactoryProvider) {
    this.quizViewModelFactoryProvider = quizViewModelFactoryProvider;
  }

  public static MembersInjector<QuizActivity> create(
      Provider<QuizViewModelFactory> quizViewModelFactoryProvider) {
    return new QuizActivity_MembersInjector(quizViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(QuizActivity instance) {
    injectQuizViewModelFactory(instance, quizViewModelFactoryProvider.get());
  }

  public static void injectQuizViewModelFactory(
      QuizActivity instance, QuizViewModelFactory quizViewModelFactory) {
    instance.quizViewModelFactory = quizViewModelFactory;
  }
}
