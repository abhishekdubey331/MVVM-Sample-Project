package com.winuall.connect.di.module;

import android.app.Activity;
import com.winuall.connect.ui.login.LoginActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = BuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.class)
public abstract class BuildersModule_ContributeLoginActivity {
  private BuildersModule_ContributeLoginActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(LoginActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      LoginActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginActivity> {}
  }
}
