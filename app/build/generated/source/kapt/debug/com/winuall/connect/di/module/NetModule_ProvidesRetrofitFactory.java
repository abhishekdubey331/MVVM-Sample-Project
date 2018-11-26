package com.winuall.connect.di.module;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  private final NetModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<Moshi> moshiProvider;

  public NetModule_ProvidesRetrofitFactory(
      NetModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<Moshi> moshiProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.moshiProvider = moshiProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.providesRetrofit(okHttpClientProvider.get(), moshiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetModule_ProvidesRetrofitFactory create(
      NetModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<Moshi> moshiProvider) {
    return new NetModule_ProvidesRetrofitFactory(module, okHttpClientProvider, moshiProvider);
  }

  public static Retrofit proxyProvidesRetrofit(
      NetModule instance, OkHttpClient okHttpClient, Moshi moshi) {
    return Preconditions.checkNotNull(
        instance.providesRetrofit(okHttpClient, moshi),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
