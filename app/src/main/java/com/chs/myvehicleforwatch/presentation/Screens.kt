package com.chs.myvehicleforwatch.presentation

sealed class Screens(
    val route: String
) {
    object SearchScreen : Screens("searchScreen")
    object ArrivalInfoScreen : Screens("arrivalInfoScreen")
}
