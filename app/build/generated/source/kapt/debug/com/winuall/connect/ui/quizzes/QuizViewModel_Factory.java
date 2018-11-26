package com.winuall.connect.ui.quizzes;

import com.winuall.connect.data.repository.QuizRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuizViewModel_Factory implements Factory<QuizViewModel> {
  private final Provider<QuizRepository> quizRepositoryProvider;

  public QuizViewModel_Factory(Provider<QuizRepository> quizRepositoryProvider) {
    this.quizRepositoryProvider = quizRepositoryProvider;
  }

  @Override
  public QuizViewModel get() {
    return new QuizViewModel(quizRepositoryProvider.get());
  }

  public static QuizViewModel_Factory create(Provider<QuizRepository> quizRepositoryProvider) {
    return new QuizViewModel_Factory(quizRepositoryProvider);
  }
}
