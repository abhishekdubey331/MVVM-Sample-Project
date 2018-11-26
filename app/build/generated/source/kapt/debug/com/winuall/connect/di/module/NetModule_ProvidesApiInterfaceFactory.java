package com.winuall.connect.di.module;

import com.winuall.connect.data.remote.ApiInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvidesApiInterfaceFactory implements Factory<ApiInterface> {
  private final NetModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetModule_ProvidesApiInterfaceFactory(
      NetModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiInterface get() {
    return Preconditions.checkNotNull(
        module.providesApiInterface(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetModule_ProvidesApiInterfaceFactory create(
      NetModule module, Provider<Retrofit> retrofitProvider) {
    return new NetModule_ProvidesApiInterfaceFactory(module, retrofitProvider);
  }

  public static ApiInterface proxyProvidesApiInterface(NetModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.providesApiInterface(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
