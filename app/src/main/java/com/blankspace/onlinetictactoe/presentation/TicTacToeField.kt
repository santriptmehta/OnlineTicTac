package com.blankspace.onlinetictactoe.presentation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import models.GameState

@Composable
fun TicTacToeField(
    state: GameState,
    modifier: Modifier = Modifier,
    playerXcolor: androidx.compose.ui.graphics.Color = Color.Green,
    playerYcolor: Color = Color.Red,
    onTapInField: (x : Int, y : Int) -> Unit
){
    Canvas(
        modifier = modifier
        ){
        drawField()
    }
}
private fun DrawScope.drawField(){
    // 1st vertical
    drawLine(
        color = Color.Black,
        start = Offset(
            x = size.width * (1/3f),
            y = 0f
        ),
        end = Offset(
            x = size.width*(1/3f),
            y = size.height
        ),
        strokeWidth = 3.dp.toPx(),
        cap = StrokeCap.Round
    )
// 2nd line
    drawLine(
        color = Color.Black,
        start = Offset(
            x = size.width * (2/3f),
            y = 0f
        ),
        end = Offset(
            x = size.width*(2/3f),
            y = size.height
        ),
        strokeWidth = 3.dp.toPx(),
        cap = StrokeCap.Round
    )
    // 1st horizontal
    drawLine(
        color = Color.Black,
        start = Offset(
            x = 0f,
            y = size.width * (1/3f)
        ),
        end = Offset(
            x = size.height,
            y = size.width*(1/3f)
        ),
        strokeWidth = 3.dp.toPx(),
        cap = StrokeCap.Round
    )
    //2nd hori line
    drawLine(
        color = Color.Black,
        start = Offset(
            x = 0f,
            y = size.width * (2/3f)
        ),
        end = Offset(
            x = size.height,
            y = size.width*(2/3f)
        ),
        strokeWidth = 3.dp.toPx(),
        cap = StrokeCap.Round
    )
}

@Preview(showBackground = true)
@Composable
fun TicTacToeFieldPreview(){
    TicTacToeField(
        state = GameState(
            field = arrayOf(
                arrayOf('X', null, null),
                arrayOf(null, 'O', 'O'),
                arrayOf(null, null, null),
                arrayOf(null, null, null),
            ),

    ), onTapInField = {_,_->},
        modifier = Modifier.size(300.dp)
    )
}