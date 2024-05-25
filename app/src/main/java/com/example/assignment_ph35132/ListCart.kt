package com.example.assignment_ph35132

data class ListCart(
    var title: String,
    var price:Float,
    var image: Int
)

fun getListCart() : List<ListCart>{
    return listOf<ListCart>(
        ListCart("Coffee Table",50f,R.mipmap.cart1),
        ListCart("Coffee Chair",20f,R.mipmap.cart2),
        ListCart("Minimal Stand",250f,R.mipmap.cart3),
        ListCart("Minimal Desk",250f,R.mipmap.cart4),
        ListCart("Minimal Lamp",120f,R.mipmap.cart5)

    )
}
