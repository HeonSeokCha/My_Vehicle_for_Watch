package com.chs.myvehicleforwatch.presentation

sealed class Screens(
    val route: String
) {
    object FavoriteScreen : Screens("favoriteScreen")
    object SearchScreen : Screens("searchScreen")
    object ArrivalInfoScreen : Screens("arrivalInfoScreen")
}
