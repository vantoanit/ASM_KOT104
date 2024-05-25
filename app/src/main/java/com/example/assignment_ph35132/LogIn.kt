package com.example.assignment_ph35132

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment_ph35132.ui.theme.Assignment_PH35132Theme


class LogIn : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment_PH35132Theme {
                // Set up the UI content for the LogIn activity
                LogInScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LogInScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.mipmap.logo),
                contentDescription = "",
                modifier = Modifier
                    .size(63.dp)
                    .padding(top = 20.dp)
            )
        }

        Text(
            text = "Hello !",
            fontSize = 30.sp,
            color = Color(0xFF606060),
            modifier = Modifier.padding(top = 20.dp, start = 20.dp)
        )

        Text(
            text = "WELCOME BACK",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp, start = 16.dp, end = 16.dp),
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .height(60.dp),
                    placeholder = { Text(text = "Email") },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color.Gray,
                    ),
//                    leadingIcon = {
//                        Icon(
//                            imageVector = Icons.Outlined.Email,
//                            contentDescription = ""
//                        )
//                    }
                )

                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .height(60.dp),
                    placeholder = { Text(text = "Password") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color.Gray,
                    ),
//                    leadingIcon = {
//                        Icon(
//                            imageVector = Icons.Outlined.Lock,
//                            contentDescription = ""
//                        )
//                    }
                )

                Text(
                    text = "Forgot Password",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 16.dp, bottom = 20.dp)
                )

                Button(
                    onClick = { /*TODO*/
                        val intent = Intent(context, HomeActivity::class.java)
                       context.startActivity(intent)

                              },
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    shape = RoundedCornerShape(size = 4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp)
                ) {
                    Text(text = "Log In", color = Color.White)
                }

                Text(
                    text = "SIGN UP",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 35.dp, bottom = 15.dp)
                        .clickable {
                            val intent = Intent(context, SignUpActivity::class.java)
                            context.startActivity(intent)
                        }

                )
            }
        }
    }
}
