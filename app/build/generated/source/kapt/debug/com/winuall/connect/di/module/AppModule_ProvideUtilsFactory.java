package com.winuall.connect.di.module;

import com.winuall.connect.utils.Utils;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideUtilsFactory implements Factory<Utils> {
  private final AppModule module;

  public AppModule_ProvideUtilsFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Utils get() {
    return Preconditions.checkNotNull(
        module.provideUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideUtilsFactory create(AppModule module) {
    return new AppModule_ProvideUtilsFactory(module);
  }

  public static Utils proxyProvideUtils(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
