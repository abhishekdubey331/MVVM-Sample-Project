package com.winuall.connect.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetModule module;

  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  public NetModule_ProvidesOkHttpClientFactory(
      NetModule module, Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    this.module = module;
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.providesOkHttpClient(httpLoggingInterceptorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetModule_ProvidesOkHttpClientFactory create(
      NetModule module, Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    return new NetModule_ProvidesOkHttpClientFactory(module, httpLoggingInterceptorProvider);
  }

  public static OkHttpClient proxyProvidesOkHttpClient(
      NetModule instance, HttpLoggingInterceptor httpLoggingInterceptor) {
    return Preconditions.checkNotNull(
        instance.providesOkHttpClient(httpLoggingInterceptor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
