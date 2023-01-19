package com.mycompose.ui.component

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.mycompose.R

class MyComposeText {
    companion object {
        @Composable
        fun TextSmall(textValue: String) {
            Text(
                text = textValue,
                fontFamily = FontFamily.SansSerif,
                color = colorResource(R.color.colorText),
                fontSize = 13.sp,
                modifier = Modifier
                    .wrapContentSize()
            )
        }

        @Composable
        fun TextMedium(textValue: String) {
            Text(
                text = textValue,
                fontFamily = FontFamily.SansSerif,
                color = colorResource(R.color.colorText),
                fontSize = 16.sp,
                modifier = Modifier
                    .wrapContentSize()
            )
        }


        @Composable
        fun TextBig(textValue: String) {
            Text(
                text = textValue,
                fontFamily = FontFamily.SansSerif,
                color = colorResource(R.color.colorText),
                fontSize = 18.sp,
                modifier = Modifier
                    .wrapContentSize()
            )
        }
    }

}
