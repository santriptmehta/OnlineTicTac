// Generated by Dagger (https://dagger.dev).
package com.blankspace.onlinetictactoe.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.ktor.client.HttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideHttpClientFactory implements Factory<HttpClient> {
  @Override
  public HttpClient get() {
    return provideHttpClient();
  }

  public static AppModule_ProvideHttpClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpClient provideHttpClient() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideHttpClient());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideHttpClientFactory INSTANCE = new AppModule_ProvideHttpClientFactory();
  }
}
