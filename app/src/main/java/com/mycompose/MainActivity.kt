package com.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mycompose.ui.theme.MyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    MessageCard(Message("Swapnil","JetPackCompose"))
                }
            }
        }
    }
}

data class Message(val title:String,val body:String)

@Composable
fun MessageCard(message: Message) {
    Row(modifier = Modifier.padding(20.dp)) {
       Image(painter = painterResource(
           id = R.drawable.img_profile),
           contentDescription = "Profile Pic",
           modifier = Modifier
               .size(80.dp)
               .clip(CircleShape)
               .border(1.5.dp, MaterialTheme.colors.primary, CircleShape)  )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = message.title)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = message.body)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeTheme {
        MessageCard(Message("Swapnil","JetPack Compose"))
    }
}