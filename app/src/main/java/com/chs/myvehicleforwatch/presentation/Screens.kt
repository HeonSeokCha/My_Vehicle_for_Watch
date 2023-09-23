package com.chs.myvehicleforwatch.presentation

sealed class Screens(
    val route: String
) {
    data object FavoriteScreen : Screens("favoriteScreen")
    data object SearchScreen : Screens("searchScreen")
    data object ArrivalInfoScreen : Screens("arrivalInfoScreen")
}
