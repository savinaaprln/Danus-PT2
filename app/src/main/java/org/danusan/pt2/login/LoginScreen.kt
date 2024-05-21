package org.danusan.pt2.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.danusan.pt2.R

val warnaPutih = Color(0xFFFFFFFF)
val warnaHitam = Color(0xFF000000)
//val warnaMerah = Color(0xFFEF5157)
//val warnaBiru = Color(0xFF0B8ABD)


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    var phonenumber by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
        )

        // Content Title
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(2.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
        ) {
            Text(
                text = "Login dulu, yuk" ,
                fontSize = 26.sp,
                fontWeight = FontWeight(500),
                color = Color.White
            )
            Spacer(modifier = Modifier.padding(top = 16.dp))
            OutlinedTextField(
                value = phonenumber,
                onValueChange = { phonenumber = it },
                label = { Text(text = stringResource(id = R.string.nohp_label)) },
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.baseline_phone_24),
                        contentDescription = null
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                ),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = warnaPutih,
                    unfocusedContainerColor = warnaPutih,
                    focusedIndicatorColor = warnaPutih,
                    unfocusedIndicatorColor = warnaPutih,
                    focusedTextColor = warnaHitam,
                    unfocusedTextColor = warnaHitam
                ),
                modifier = Modifier
                    .fillMaxWidth(0.9f)
            )
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = stringResource(id = R.string.pass_label)) },
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.baseline_lock_24),
                        contentDescription = null
                    )
                },
                trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_visibility_24),
                        contentDescription = null
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
                ),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = warnaPutih,
                    unfocusedContainerColor = warnaPutih,
                    focusedIndicatorColor = warnaPutih,
                    unfocusedIndicatorColor = warnaPutih,
                    focusedTextColor = warnaHitam,
                    unfocusedTextColor = warnaHitam
                ),
                modifier = Modifier
                    .fillMaxWidth(0.9f)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            // Next Button
            Button(
                onClick = {  },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFEF5157)
                ),
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(52.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.confirmButton),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                        color = Color.White
                    )
                )
            }
            Spacer(modifier = Modifier.padding(top = 15.dp))
            // Other join
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ){
                Text(
                    text = "Atau login pakai",
                    style = TextStyle(
                        color = Color.White,
                    )
                )
                Button(
                    onClick = {  },
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                    ),
                    border = BorderStroke(1.dp, Color.White),
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_google_logo),
                        contentDescription = "Google Button",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(width = 30.dp, height = 30.dp)
                    )
                    Text(
                        text = " Google",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight(700)
                        )
                    )
                }
            }
            Row (
                modifier = Modifier.padding(top = 12.dp)
            ){
                Text(
                    text = "Belum punya akun? ",
                    fontSize = 15.sp,
                    color = Color.White
                )
                Text(
                    text = "Daftar",
                    fontSize = 15.sp,
                    fontWeight = FontWeight(400),
                    style = TextStyle(
                        color = Color.Blue
                    )
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}