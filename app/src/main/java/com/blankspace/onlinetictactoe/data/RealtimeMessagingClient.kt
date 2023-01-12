package com.blankspace.onlinetictactoe.data

import kotlinx.coroutines.flow.Flow
import models.GameState
import models.MakeTurn

interface RealtimeMessagingClient {
    fun getGameStateStream(): Flow<GameState>
    suspend fun sendAction(action: MakeTurn)
    suspend fun close()
}