package com.immr.trainjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Column(
               modifier = Modifier.padding(10.dp)
           ) {
               Column(
                   modifier = Modifier
                       .border(width = 1.dp, color = Color.Blue)
                       .fillMaxWidth()
                       .height(height = 200.dp),
                   horizontalAlignment = Alignment.CenterHorizontally
               ) {
                   Text(text = "Hello Ismail")
                    for (i in 0..5){
                        Text(text = "Hello Ismail moch")
                    }
               }
               Spacer(modifier = Modifier.padding(16.dp))
               Row(
                   modifier = Modifier
                       .border(width = 1.dp, color = Color.Red)
                       .fillMaxWidth()
                       .height(height = 200.dp),
               ) {
                   Text(
                       text = "Hello Ridwan",
                       modifier = Modifier.align(Alignment.CenterVertically)
                   )
                   Text(text = "Hello Malik")
               }
           }
        }
    }
}
