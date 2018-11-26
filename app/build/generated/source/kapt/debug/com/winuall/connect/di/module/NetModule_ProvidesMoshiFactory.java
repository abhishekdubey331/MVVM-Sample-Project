package com.winuall.connect.di.module;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvidesMoshiFactory implements Factory<Moshi> {
  private final NetModule module;

  public NetModule_ProvidesMoshiFactory(NetModule module) {
    this.module = module;
  }

  @Override
  public Moshi get() {
    return Preconditions.checkNotNull(
        module.providesMoshi(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetModule_ProvidesMoshiFactory create(NetModule module) {
    return new NetModule_ProvidesMoshiFactory(module);
  }

  public static Moshi proxyProvidesMoshi(NetModule instance) {
    return Preconditions.checkNotNull(
        instance.providesMoshi(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
