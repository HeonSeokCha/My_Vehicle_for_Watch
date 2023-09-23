package com.chs.myvehicleforwatch.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import com.chs.myvehicleforwatch.presentation.favorite.FavoriteScreen
import com.chs.myvehicleforwatch.presentation.search.SearchScreen

@Composable
fun MainNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    SwipeDismissableNavHost(
        navController = navController,
        modifier = modifier,
        startDestination = Screens.FavoriteScreen.route
    ) {
        composable(Screens.FavoriteScreen.route) {
            FavoriteScreen(navController)
        }
        composable(Screens.SearchScreen.route) {
            SearchScreen()
        }
        composable(Screens.ArrivalInfoScreen.route) {
        }
    }
}