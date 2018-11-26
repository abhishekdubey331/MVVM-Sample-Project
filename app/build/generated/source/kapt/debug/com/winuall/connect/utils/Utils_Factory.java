package com.winuall.connect.utils;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Utils_Factory implements Factory<Utils> {
  private final Provider<Context> contextProvider;

  public Utils_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Utils get() {
    return new Utils(contextProvider.get());
  }

  public static Utils_Factory create(Provider<Context> contextProvider) {
    return new Utils_Factory(contextProvider);
  }
}
