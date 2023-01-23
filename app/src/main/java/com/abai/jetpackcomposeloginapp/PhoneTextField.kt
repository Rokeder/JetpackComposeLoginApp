package com.abai.jetpackcomposeloginapp

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import com.abai.jetpackcomposeloginapp.NumberDefaults.INPUT_LENGTH
import com.abai.jetpackcomposeloginapp.NumberDefaults.MASK

/**
 * Created by rayrustemov on 22.01.2023.
 */

@Composable
fun PhoneTextField(modifier: Modifier, value: String, onValueChanged: (text: String) -> Unit) {
    var text by remember { mutableStateOf(value) }
    OutlinedTextField(
        value = text,
        onValueChange = { it ->
            if (it.length <= INPUT_LENGTH) {
                text = it.filter { it.isDigit() }
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        visualTransformation = MaskVisualTransformation(MASK),
        modifier = modifier,
        label = {
            Text(text = stringResource(id = R.string.phone_number))
        }
    )
}

object NumberDefaults {
    const val MASK = "+7 (###) ###-##-##"
    const val INPUT_LENGTH = 10 // Equals to "#####-###".count { it == '#' }
}