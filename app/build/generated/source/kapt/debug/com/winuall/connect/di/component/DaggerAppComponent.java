package com.winuall.connect.di.component;

import android.app.Activity;
import com.squareup.moshi.Moshi;
import com.winuall.connect.App;
import com.winuall.connect.App_MembersInjector;
import com.winuall.connect.data.remote.ApiInterface;
import com.winuall.connect.data.repository.QuizRepository;
import com.winuall.connect.data.repository.UserRepository;
import com.winuall.connect.di.module.AppModule;
import com.winuall.connect.di.module.AppModule_ProvideUtilsFactory;
import com.winuall.connect.di.module.BuildersModule_ContributeLoginActivity;
import com.winuall.connect.di.module.BuildersModule_ContributeQuizActivity;
import com.winuall.connect.di.module.NetModule;
import com.winuall.connect.di.module.NetModule_ProvideLoggingInterceptorFactory;
import com.winuall.connect.di.module.NetModule_ProvidesApiInterfaceFactory;
import com.winuall.connect.di.module.NetModule_ProvidesMoshiFactory;
import com.winuall.connect.di.module.NetModule_ProvidesOkHttpClientFactory;
import com.winuall.connect.di.module.NetModule_ProvidesRetrofitFactory;
import com.winuall.connect.ui.login.LoginActivity;
import com.winuall.connect.ui.login.LoginActivity_MembersInjector;
import com.winuall.connect.ui.login.LoginViewModel;
import com.winuall.connect.ui.login.LoginViewModelFactory;
import com.winuall.connect.ui.quizzes.QuizActivity;
import com.winuall.connect.ui.quizzes.QuizActivity_MembersInjector;
import com.winuall.connect.ui.quizzes.QuizViewModel;
import com.winuall.connect.ui.quizzes.QuizViewModelFactory;
import com.winuall.connect.utils.Utils;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<BuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder>
      loginActivitySubcomponentBuilderProvider;

  private Provider<BuildersModule_ContributeQuizActivity.QuizActivitySubcomponent.Builder>
      quizActivitySubcomponentBuilderProvider;

  private Provider<HttpLoggingInterceptor> provideLoggingInterceptorProvider;

  private Provider<OkHttpClient> providesOkHttpClientProvider;

  private Provider<Moshi> providesMoshiProvider;

  private Provider<Retrofit> providesRetrofitProvider;

  private Provider<ApiInterface> providesApiInterfaceProvider;

  private Provider<Utils> provideUtilsProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            newMapBuilder(2)
        .put(LoginActivity.class, (Provider) loginActivitySubcomponentBuilderProvider)
        .put(QuizActivity.class, (Provider) quizActivitySubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.loginActivitySubcomponentBuilderProvider =
        new Provider<BuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder>() {
          @Override
          public BuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder get() {
            return new LoginActivitySubcomponentBuilder();
          }
        };
    this.quizActivitySubcomponentBuilderProvider =
        new Provider<BuildersModule_ContributeQuizActivity.QuizActivitySubcomponent.Builder>() {
          @Override
          public BuildersModule_ContributeQuizActivity.QuizActivitySubcomponent.Builder get() {
            return new QuizActivitySubcomponentBuilder();
          }
        };
    this.provideLoggingInterceptorProvider =
        DoubleCheck.provider(NetModule_ProvideLoggingInterceptorFactory.create(builder.netModule));
    this.providesOkHttpClientProvider =
        DoubleCheck.provider(
            NetModule_ProvidesOkHttpClientFactory.create(
                builder.netModule, provideLoggingInterceptorProvider));
    this.providesMoshiProvider =
        DoubleCheck.provider(NetModule_ProvidesMoshiFactory.create(builder.netModule));
    this.providesRetrofitProvider =
        DoubleCheck.provider(
            NetModule_ProvidesRetrofitFactory.create(
                builder.netModule, providesOkHttpClientProvider, providesMoshiProvider));
    this.providesApiInterfaceProvider =
        DoubleCheck.provider(
            NetModule_ProvidesApiInterfaceFactory.create(
                builder.netModule, providesRetrofitProvider));
    this.provideUtilsProvider =
        DoubleCheck.provider(AppModule_ProvideUtilsFactory.create(builder.appModule));
  }

  @Override
  public void inject(App app) {
    injectApp(app);
  }

  private App injectApp(App instance) {
    App_MembersInjector.injectActivityInjector(instance, getDispatchingAndroidInjectorOfActivity());
    return instance;
  }

  public static final class Builder {
    private NetModule netModule;

    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (netModule == null) {
        throw new IllegalStateException(NetModule.class.getCanonicalName() + " must be set");
      }
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder netModule(NetModule netModule) {
      this.netModule = Preconditions.checkNotNull(netModule);
      return this;
    }
  }

  private final class LoginActivitySubcomponentBuilder
      extends BuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder {
    private LoginActivity seedInstance;

    @Override
    public BuildersModule_ContributeLoginActivity.LoginActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(LoginActivity.class.getCanonicalName() + " must be set");
      }
      return new LoginActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LoginActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LoginActivitySubcomponentImpl
      implements BuildersModule_ContributeLoginActivity.LoginActivitySubcomponent {
    private LoginActivitySubcomponentImpl(LoginActivitySubcomponentBuilder builder) {}

    private UserRepository getUserRepository() {
      return new UserRepository(
          DaggerAppComponent.this.providesApiInterfaceProvider.get(),
          DaggerAppComponent.this.provideUtilsProvider.get());
    }

    private LoginViewModel getLoginViewModel() {
      return new LoginViewModel(getUserRepository());
    }

    private LoginViewModelFactory getLoginViewModelFactory() {
      return new LoginViewModelFactory(getLoginViewModel());
    }

    @Override
    public void inject(LoginActivity arg0) {
      injectLoginActivity(arg0);
    }

    private LoginActivity injectLoginActivity(LoginActivity instance) {
      LoginActivity_MembersInjector.injectLoginViewModelFactory(
          instance, getLoginViewModelFactory());
      LoginActivity_MembersInjector.injectUtils(
          instance, DaggerAppComponent.this.provideUtilsProvider.get());
      return instance;
    }
  }

  private final class QuizActivitySubcomponentBuilder
      extends BuildersModule_ContributeQuizActivity.QuizActivitySubcomponent.Builder {
    private QuizActivity seedInstance;

    @Override
    public BuildersModule_ContributeQuizActivity.QuizActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(QuizActivity.class.getCanonicalName() + " must be set");
      }
      return new QuizActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(QuizActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class QuizActivitySubcomponentImpl
      implements BuildersModule_ContributeQuizActivity.QuizActivitySubcomponent {
    private QuizActivitySubcomponentImpl(QuizActivitySubcomponentBuilder builder) {}

    private QuizRepository getQuizRepository() {
      return new QuizRepository(
          DaggerAppComponent.this.providesApiInterfaceProvider.get(),
          DaggerAppComponent.this.provideUtilsProvider.get());
    }

    private QuizViewModel getQuizViewModel() {
      return new QuizViewModel(getQuizRepository());
    }

    private QuizViewModelFactory getQuizViewModelFactory() {
      return new QuizViewModelFactory(getQuizViewModel());
    }

    @Override
    public void inject(QuizActivity arg0) {
      injectQuizActivity(arg0);
    }

    private QuizActivity injectQuizActivity(QuizActivity instance) {
      QuizActivity_MembersInjector.injectQuizViewModelFactory(instance, getQuizViewModelFactory());
      return instance;
    }
  }
}
