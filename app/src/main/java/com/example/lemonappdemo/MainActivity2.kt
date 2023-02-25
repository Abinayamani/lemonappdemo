package com.example.lemonappdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonappdemo.ui.theme.LemonappdemoTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonappdemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Lemonapp2() {
    LemonappdemoTheme {

        LemonappandImage2("Lemon tree")

    }


}

@Composable
fun LemonappandImage2(message: String) {
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = message,
            fontSize = 10.sp,
            fontStyle = FontStyle.Italic,

            )
        Spacer(modifier = Modifier.height(16.dp))

        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier) {
            Image(
                painter = painterResource(id = R.drawable.apple),
                contentDescription = toString()
            )
            Card(
                border = BorderStroke(1.dp, Color.Blue),
                backgroundColor = Color.Yellow

            )
            {
                Image(
                    painter = painterResource(id = R.drawable.apple),
                    contentDescription = toString()

                )


            }

        }


    }
}