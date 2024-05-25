package com.example.assignment_ph35132.navigation

import android.app.Notification
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.assignment_ph35132.GetLayoutHome
import com.example.assignment_ph35132.HomeActivity
import com.example.assignment_ph35132.favvouriteScreen


@Composable
fun AppNavigaton(){

    val navController: NavHostController = rememberNavController()

    Scaffold(
        modifier = Modifier.background(Color.White),
        bottomBar = {
            NavigationBar(

            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentNavDestination = navBackStackEntry?.destination

                listOfNavItems.forEach { navItems ->
                    NavigationBarItem(
                        selected = currentNavDestination?.hierarchy?.any { it.route == navItems.route } == true,
                        onClick = {
                                  navController.navigate(navItems.route){
                                      popUpTo(navController.graph.findStartDestination().id){
                                          saveState = true
                                      }
                                      launchSingleTop = true
                                      restoreState = true
                                  }
                        },
                        icon = {
                               Icon(
                                   imageVector =navItems.icon ,
                                   contentDescription = null)
                        },
                        label = {
                            Text(text = navItems.lable)
                        }
                        )
                }
            }
        }
    ) {paddingValues ->
        NavHost(navController = navController ,
            startDestination =Screens.HomeActivity.name,
            modifier = Modifier.padding(paddingValues)
        ){
            composable(route = Screens.HomeActivity.name){
                   GetLayoutHome()
            }

            composable(route = Screens.Favourite.name){
                  favvouriteScreen()
            }


            composable(route = Screens.Notification.name){
                Notification()
            }

            composable(route = Screens.Profile.name){
                Screens.Profile
            }

        }


    }
}