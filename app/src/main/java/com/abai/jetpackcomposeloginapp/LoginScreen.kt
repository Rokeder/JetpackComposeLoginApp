package com.abai.jetpackcomposeloginapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Created by rayrustemov on 16.01.2023.
 */

@Composable
fun LoginScreen(modifier: Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(32.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var textFieldState by remember {
            mutableStateOf("")
        }
        val painter = painterResource(R.drawable.logo)
        val description = "Hitter Application"

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier
                    .height(64.dp)
                    .width(64.dp),
                painter = painter,
                contentDescription = description)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            PhoneTextField(
                value = textFieldState,
                onValueChanged = {},
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.hitter_default_color)),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = stringResource(id = R.string.sign_in).uppercase(),
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Text(
                    text = stringResource(id = R.string.hitter_terms_1),
                    fontSize = 16.sp,
                    color = colorResource(
                        id = R.color.gray_text_color
                    )
                )
                Text(
                    text = stringResource(id = R.string.hitter_terms_2),
                    style = TextStyle(textDecoration = TextDecoration.Underline),
                    fontSize = 16.sp,
                    color = colorResource(
                        id = R.color.gray_text_color
                    )
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(
                    id = R.string.privacy_policy
                ),
                fontSize = 16.sp,
                color = colorResource(
                    id = R.color.gray_text_color
                ),
                style = TextStyle(textDecoration = TextDecoration.Underline)
            )
        }
    }
}