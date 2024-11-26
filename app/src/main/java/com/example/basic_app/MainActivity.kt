package com.example.basic_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.R
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basic_app.ui.theme.BasicAppTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .size(400.dp)
            .background(Color.LightGray)
    ){
        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .background(Color.DarkGray)
        ){
            Text(
                text = "Hello $name!",
                modifier = modifier
                    .background(Color.Black)
                    .padding(16.dp),
                color = Color.Blue,
                fontSize = 30.sp
            )
        }

        Text(
            text = "Something Else",
            color = Color.Green,
            modifier = modifier
                .background(Color.Black)
                .padding(16.dp)

        )
    }
    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxWidth()
    ){
        Text(
            text = "Something Else 2",
            color = Color.Black,
            modifier = modifier
                .background(Color.Magenta)
                .padding(16.dp)

        )
        Text(
            text = "Something Else 3",
            color = Color.Black,
            modifier = modifier
                .background(Color.Yellow)
                .padding(16.dp)

        )
    }
    Row (
        modifier = Modifier
            .background(Color.Black)
    ){
        Icon(imageVector = Icons.Default.Add,
            contentDescription = null
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicAppTheme {
        Greeting("Rae")
    }
}