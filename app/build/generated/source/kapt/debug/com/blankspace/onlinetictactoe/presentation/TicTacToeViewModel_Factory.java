// Generated by Dagger (https://dagger.dev).
package com.blankspace.onlinetictactoe.presentation;

import com.blankspace.onlinetictactoe.data.RealtimeMessagingClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TicTacToeViewModel_Factory implements Factory<TicTacToeViewModel> {
  private final Provider<RealtimeMessagingClient> clientProvider;

  public TicTacToeViewModel_Factory(Provider<RealtimeMessagingClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public TicTacToeViewModel get() {
    return newInstance(clientProvider.get());
  }

  public static TicTacToeViewModel_Factory create(
      Provider<RealtimeMessagingClient> clientProvider) {
    return new TicTacToeViewModel_Factory(clientProvider);
  }

  public static TicTacToeViewModel newInstance(RealtimeMessagingClient client) {
    return new TicTacToeViewModel(client);
  }
}
