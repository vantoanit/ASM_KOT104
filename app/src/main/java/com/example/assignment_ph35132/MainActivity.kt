package com.example.assignment_ph35132

import android.content.Intent
import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment_ph35132.ui.theme.Assignment_PH35132Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment_PH35132Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Wellcome()
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Wellcome(){
    val context = LocalContext.current
    val customFont = FontFamily(Font(R.font.gelasio_variablefont_wght))
    Box(modifier = Modifier.fillMaxSize())
    {
        Image(painterResource(id = R.mipmap.wellcom) ,
            contentDescription ="",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column (modifier = Modifier.padding(start = 20.dp, top = 180.dp))
        {
            Text(
                text = "MAKE YOUR",
                fontFamily = customFont,
                fontSize = 24.sp,
                color = Color(0xFF606060),


            )
            Text(
                text = "HOME BEAUTIFUL",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = customFont,
                modifier = Modifier.padding(start = 5.dp)
            )
            Text(text = "The best simple place where you\n" +
                    " discover most wonderful furnitures\n" +
                    " and make your home beautiful",
                fontSize = 20.sp,
                color = Color(0xFF808080),
                modifier = Modifier
                    .padding(top = 20.dp, start = 10.dp)
                    .align(Alignment.CenterHorizontally)

            )

            Button(
                onClick = {
                    val intent = Intent(context, LogIn::class.java)
                    context.startActivity(intent)
                },
                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier.padding(top = 170.dp).align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(size = 4.dp)

            )

            {
                Text(text = "Get Started")

            }

        }

    }







}



