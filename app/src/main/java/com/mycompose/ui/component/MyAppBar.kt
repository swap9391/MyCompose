package com.mycompose.ui.component

import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.mycompose.R

class MyAppBar {
    companion object {

        @Composable
        fun AppBar(title: String) {
            TopAppBar(
                title = {
                    MyComposeText.TextMedium(textValue = title)

                },
                /*navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu Btn")
                    }
                },*/
                backgroundColor = colorResource(R.color.colorPrimary),
                contentColor = colorResource(R.color.colorText),
                elevation = 2.dp
            )

        }
    }
}