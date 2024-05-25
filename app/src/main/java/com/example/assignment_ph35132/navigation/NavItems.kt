package com.example.assignment_ph35132.navigation

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems(
    val lable: String,
    val icon: ImageVector,
    val route: String
)

val listOfNavItems : List<NavItems> = listOf(
    NavItems(
            lable = "",
            icon = Icons.Default.Home,
            route = Screens.HomeActivity.name
    ),

    NavItems(
        lable = "",
        icon = Icons.Default.Favorite,
        route = Screens.Favourite.name
    ),

    NavItems(
        lable = "",
        icon = Icons.Default.Notifications,
        route = Screens.Notification.name
    ),

    NavItems(
        lable = "",
        icon = Icons.Default.Person,
        route = Screens.Profile.name
    ),


)