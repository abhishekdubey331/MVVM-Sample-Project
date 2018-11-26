package com.winuall.connect;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider;

  public App_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider) {
    this.activityInjectorProvider = activityInjectorProvider;
  }

  public static MembersInjector<App> create(
      Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider) {
    return new App_MembersInjector(activityInjectorProvider);
  }

  @Override
  public void injectMembers(App instance) {
    injectActivityInjector(instance, activityInjectorProvider.get());
  }

  public static void injectActivityInjector(
      App instance, DispatchingAndroidInjector<Activity> activityInjector) {
    instance.activityInjector = activityInjector;
  }
}
