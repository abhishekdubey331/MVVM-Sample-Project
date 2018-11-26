package com.winuall.connect.di.module;

import android.app.Activity;
import com.winuall.connect.ui.quizzes.QuizActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = BuildersModule_ContributeQuizActivity.QuizActivitySubcomponent.class)
public abstract class BuildersModule_ContributeQuizActivity {
  private BuildersModule_ContributeQuizActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(QuizActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      QuizActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface QuizActivitySubcomponent extends AndroidInjector<QuizActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<QuizActivity> {}
  }
}
