package com.blankspace.onlinetictactoe.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/blankspace/onlinetictactoe/data/RealtimeMessagingClient;", "", "close", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGameStateStream", "Lkotlinx/coroutines/flow/Flow;", "Lcom/blankspace/onlinetictactoe/data/GameState;", "sendAction", "action", "Lcom/blankspace/onlinetictactoe/data/MakeTurn;", "(Lcom/blankspace/onlinetictactoe/data/MakeTurn;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RealtimeMessagingClient {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.blankspace.onlinetictactoe.data.GameState> getGameStateStream();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sendAction(@org.jetbrains.annotations.NotNull()
    com.blankspace.onlinetictactoe.data.MakeTurn action, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object close(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}