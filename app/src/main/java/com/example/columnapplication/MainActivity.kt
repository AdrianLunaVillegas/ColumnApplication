package com.example.columnapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            app()
        }
    }
}

@Preview
@Composable
fun app() {

    var counter by rememberSaveable { mutableStateOf( 0 ) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
            .padding(16.dp)
    ) {
        item {

            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                painter = painterResource(id = R.drawable.spalsh2),
                contentDescription = "logo de prueba"
            )
            Row(modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_favorite_24),
                    contentDescription = "Like",
                    modifier = Modifier.clickable { counter++ }
                )

                Text(text = counter.toString(), color = Color.White, modifier = Modifier.padding(start = 4.dp))
            }

            Text(
                text = "AdrianDevs",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Adrian Dev",
                color = Color.White,
                modifier = Modifier
                    .padding(top = 15.dp)
            )
            Text(
                text = "1 año exp.",
                color = Color.White,
                modifier = Modifier
                    .padding(top = 5.dp)
            )
            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp)
            ) {
                item {
                    Text(
                        text = "Stack:",
                        modifier = Modifier.padding(horizontal = 5.dp),
                        color = Color.White
                    )
                    Text(text = "Java", color = Color.White)
                    Text(text = "KOTLIN", color = Color.White)
                }
            }
        }
    }
}