package com.mycompose.ui.main

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.mycompose.R
import com.mycompose.ui.abstract.AbstractActivity
import com.mycompose.ui.component.MyAppBar
import com.mycompose.ui.component.MyComposeText
import com.mycompose.ui.theme.MyComposeTheme

class MainActivity : AbstractActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
                    MessageCard(Message("Swapnil","JetPackCompose"))
                }
            }
        }
    }
}

data class Message(val title:String,val body:String)

@Composable
fun MessageCard(message: Message) {

    Scaffold(
        topBar = {
            MyAppBar.AppBar(title = "My Compose")
        }
    ) {

        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)

        ) {

            val (card) = createRefs()

            Card(
                shape = RoundedCornerShape(10.dp),
                backgroundColor = colorResource(R.color.colorPrimaryLight),
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .constrainAs(card){
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }

            ) {
                Row(modifier = Modifier.padding(20.dp)) {
                    Image(
                        painter = painterResource(
                            id = R.drawable.img_profile
                        ),
                        contentDescription = "Profile Pic",
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .border(1.5.dp, colorResource(R.color.colorPrimaryDark), CircleShape)
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Column {
                        MyComposeText.TextBig(textValue = message.title)
                        Spacer(modifier = Modifier.height(4.dp))
                        MyComposeText.TextMedium(textValue = message.body)
                    }

                }
            }
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