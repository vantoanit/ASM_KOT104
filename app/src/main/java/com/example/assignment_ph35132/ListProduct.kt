package com.example.assignment_ph35132

data class ListProduct(
    var titleProduct: String,
    var priceProduct:Float,
    var imageProduct: Int
)

fun getListProduct() : List<ListProduct>{
    return listOf<ListProduct>(
        ListProduct("Coffee Table",50f,R.mipmap.cart1),
        ListProduct("Coffee Chair",20f,R.mipmap.cart2),
        ListProduct("Minimal Stand",250f,R.mipmap.cart3),
        ListProduct("Minimal Desk",250f,R.mipmap.cart4),
        ListProduct("Minimal Lamp",120f,R.mipmap.cart5)

    )
}
