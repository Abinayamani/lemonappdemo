package com.example.lemonappdemo


import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.lemonappdemo.ui.theme.LemonappdemoTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonappdemoTheme {
                var currentStep by remember { mutableStateOf(1) }

                var squeezeCount by remember { mutableStateOf(0) }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {

                    when (currentStep) {
                        1 -> {
                            // Display lemon tree image and ask user to pick a lemon from the tree
                            LemonappandImage(
                                message = "Tap the lemon tree to select the lemon",
                                context = this@MainActivity
                            )
                        }
                        2 -> {
                            // Display lemon image and ask user to squeeze the lemon
                            LemonappandImage(message = "Text", context = this@MainActivity)
                        }
                        3 -> {
                            // Display glass of lemonade image and ask user to drink the lemonade
                            LemonappandImage(message = "Text", context = this@MainActivity)
                        }
                        4 -> {
                            // Display empty glass image and ask user to start again
                            LemonappandImage(message = "Text", context = this@MainActivity)
                        }
                    }


                }
            }
        }


    }


    @Preview(showBackground = true)
    @Composable
    fun Lemonapp() {
        LemonappdemoTheme {

            LemonappandImage(LocalContext.current, "Tap the lemon tree to select the lemon")

        }


    }
}

@Composable
fun LemonappandImage(context: Context, message: String) {
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = message,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,

            )
        Spacer(modifier = Modifier.height(16.dp))



        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier) {

            Card(
                border = BorderStroke(1.dp, Color.Blue),
                backgroundColor = Color.Yellow

            )
            {
                Image(
                    painter = painterResource(id = R.drawable.plant),
                    contentDescription = toString()


                )


            }


        }
        Button(onClick = {

            val intent = Intent(context, MainActivity2::class.java)
            startActivity(context, intent, null);
        }) {
            Text(
                text = "Button",
                fontSize = 30.sp
            )
        }

    }
}
