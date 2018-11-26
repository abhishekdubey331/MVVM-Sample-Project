package com.winuall.connect.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvideLoggingInterceptorFactory
    implements Factory<HttpLoggingInterceptor> {
  private final NetModule module;

  public NetModule_ProvideLoggingInterceptorFactory(NetModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return Preconditions.checkNotNull(
        module.provideLoggingInterceptor(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetModule_ProvideLoggingInterceptorFactory create(NetModule module) {
    return new NetModule_ProvideLoggingInterceptorFactory(module);
  }

  public static HttpLoggingInterceptor proxyProvideLoggingInterceptor(NetModule instance) {
    return Preconditions.checkNotNull(
        instance.provideLoggingInterceptor(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
