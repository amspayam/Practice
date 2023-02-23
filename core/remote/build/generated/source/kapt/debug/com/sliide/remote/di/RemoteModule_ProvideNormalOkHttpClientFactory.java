// Generated by Dagger (https://dagger.dev).
package com.sliide.remote.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteModule_ProvideNormalOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<Interceptor> loggerInterceptorProvider;

  public RemoteModule_ProvideNormalOkHttpClientFactory(
      Provider<Interceptor> loggerInterceptorProvider) {
    this.loggerInterceptorProvider = loggerInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideNormalOkHttpClient(loggerInterceptorProvider.get());
  }

  public static RemoteModule_ProvideNormalOkHttpClientFactory create(
      Provider<Interceptor> loggerInterceptorProvider) {
    return new RemoteModule_ProvideNormalOkHttpClientFactory(loggerInterceptorProvider);
  }

  public static OkHttpClient provideNormalOkHttpClient(Interceptor loggerInterceptor) {
    return Preconditions.checkNotNullFromProvides(RemoteModule.INSTANCE.provideNormalOkHttpClient(loggerInterceptor));
  }
}