package com.blankspace.onlinetictactoe.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/blankspace/onlinetictactoe/presentation/TicTacToeViewModel;", "Landroidx/lifecycle/ViewModel;", "client", "Lcom/blankspace/onlinetictactoe/data/RealtimeMessagingClient;", "(Lcom/blankspace/onlinetictactoe/data/RealtimeMessagingClient;)V", "_isConnecting", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_showConnectionError", "isConnecting", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "showConnectionError", "getShowConnectionError", "state", "Lmodels/GameState;", "getState", "finishTurn", "", "x", "", "y", "onCleared", "app_debug"})
public final class TicTacToeViewModel extends androidx.lifecycle.ViewModel {
    private final com.blankspace.onlinetictactoe.data.RealtimeMessagingClient client = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<models.GameState> state = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isConnecting = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isConnecting = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _showConnectionError = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showConnectionError = null;
    
    @javax.inject.Inject()
    public TicTacToeViewModel(@org.jetbrains.annotations.NotNull()
    com.blankspace.onlinetictactoe.data.RealtimeMessagingClient client) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<models.GameState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isConnecting() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowConnectionError() {
        return null;
    }
    
    public final void finishTurn(int x, int y) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}