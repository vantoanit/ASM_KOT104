package com.example.assignment_ph35132

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun favvouriteScreen() {
    var myList = getListCart()
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
                painter = painterResource(id = R.drawable.search),
                contentDescription = null,
                modifier = Modifier.size(20.dp, 20.dp),
                tint = Color(0xff808080)
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Favorites",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.mipmap.card),
                contentDescription = null,
                modifier = Modifier.size(20.dp, 20.dp),
                tint = Color(0xff808080)

            )
        }
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

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(size = 4.dp),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
        ) {
            Text(text = "Add all to my cart", color = Color.White)
        }



    }

}

@Composable
fun ListItem(item: ListCart) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = item.image),  // Đổi `item.image` thành `item.images[0]`
            contentDescription = item.title,
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
                text = item.title,
                fontFamily = FontFamily.Serif,
                fontSize = 14.sp
            )

            Text(
                text = "$" + item.price.toString(),
                fontWeight = FontWeight.Bold
            )
        }

        Column {
            IconButton(
                onClick = { /*TODO*/ },
                modifier =  Modifier.align(Alignment.CenterHorizontally)
            ) {
                Icon(
                    painter = painterResource(id = R.mipmap.shape),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp, 20.dp),
                    tint = Color(0xff808080)
                )
            }

            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(8.dp)
                    .background(
                        Color(0x66606060),
                        shape = RoundedCornerShape(6.dp)
                    )
                    .size(30.dp, 30.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.mipmap.shopping),
                    contentDescription = null,
                    modifier = Modifier.size(15.dp, 15.dp),
                    tint = Color.White
                )
            }
        }


    }

}

@Composable
fun TextItem(text : String) {
    Text(
        text = text,
        modifier = Modifier.padding(16.dp)
    )

}


