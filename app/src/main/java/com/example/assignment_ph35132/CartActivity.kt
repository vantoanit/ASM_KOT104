package com.example.assignment_ph35132

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            getCartScreen()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun getCartScreen() {
    var myList = getListProduct()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    Icons.Default.KeyboardArrowLeft,
                    contentDescription = null,
                    modifier = Modifier.size(23.dp, 23.dp),
                    tint = Color(0xff000000)
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "My cart",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )
            }

            Text(
                text = "",
                modifier = Modifier.width(30.dp)
            )
        }

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(1.dp)
        ) {
            itemsIndexed(myList, itemContent = { index, item ->
                ListItem(item = item)
            })
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
             // Thay vì sử dụng Arrangement.SpaceBetween, sử dụng Alignment.Horizontal
            verticalArrangement = Arrangement.Center
        ) {
            Row {
                Text(
                    text = "Total:",
                    fontFamily = FontFamily.Serif,
                    color = Color(0xff808080),
                    fontSize = 18.sp,
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = "$95.000",
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 110.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                )
            }
        }

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = RoundedCornerShape(size = 4.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Text(text = "Check out", color = Color.White)
            }
        }


    }


//    LazyColumn(
//        modifier = Modifier
//            .weight(1f)
//            .padding(1.dp)
//    ) {
//        itemsIndexed(myList, itemContent = { index, item ->
//            ListItem(item = item)
//        })
//    }
//
//    Button(
//        onClick = { /*TODO*/ },
//        colors = ButtonDefaults.buttonColors(Color.Black),
//        shape = RoundedCornerShape(size = 4.dp),
//        modifier = Modifier
//            .align(Alignment.Center)
//            .fillMaxWidth()
//    ) {
//        Text(text = "Add all to my cart", color = Color.White)
//    }







@Composable
fun ListItem(item: ListProduct) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = item.imageProduct),  // Đổi `item.image` thành `item.images[0]`
            contentDescription = item.titleProduct,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )

        Column(
            modifier = Modifier
                .weight(1f)  // Thêm weight để Column chiếm không gian còn lại
                .padding(15.dp)
        ) {
            Text(
                text = item.titleProduct,
                fontFamily = FontFamily.Serif,
                fontSize = 14.sp
            )

            Text(
                text = "$" + item.priceProduct.toString(),
                fontWeight = FontWeight.Bold
            )

            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { /*TODO: Giảm số lượng*/ }) {
                    Icon(
                        painter = painterResource(id = R.mipmap.cong),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp, 20.dp),
                        tint = Color(0xff808080)
                    )
                }

                Text(
                    text = "1", // Số lượng sản phẩm (có thể thay đổi)
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )

                IconButton(onClick = { /*TODO: Tăng số lượng*/ }) {
                    Icon(
                        painter = painterResource(id = R.mipmap.tru),
                        contentDescription = "Increase",
                        modifier = Modifier.size(20.dp),
                        tint = Color.Gray
                    )
                }
            }
        }



        Column {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Icon(
                    painter = painterResource(id = R.mipmap.shape),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp, 20.dp),
                    tint = Color(0xff808080)
                )
            }

        }


    }
}