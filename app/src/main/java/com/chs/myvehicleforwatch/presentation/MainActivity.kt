package com.chs.myvehicleforwatch.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TimeText
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.chs.myvehicleforwatch.R
import com.chs.myvehicleforwatch.presentation.search.SearchScreen
import com.chs.myvehicleforwatch.presentation.theme.MyVehicleForWatchTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberSwipeDismissableNavController()
            MyVehicleForWatchTheme {
                Scaffold(
                    timeText = { TimeText() }
                ) {
                    SwipeDismissableNavHost(
                        navController = navController,
                        startDestination = Screens.SearchScreen.route
                    ) {
                        composable(Screens.SearchScreen.route) {
                            SearchScreen()
                        }

                        composable(Screens.ArrivalInfoScreen.route) {
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun WearApp(
    greetingName: String,
    viewModel: MainViewModel = hiltViewModel()
) {
    var testText: String by remember { mutableStateOf("") }
    LaunchedEffect(Unit) {
        launch {
        }
    }
    MyVehicleForWatchTheme {
        Scaffold(
            timeText = {
                TimeText()
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .selectableGroup(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = testText,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
fun Greeting(greetingName: String) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        color = MaterialTheme.colors.primary,
        text = stringResource(R.string.hello_world, greetingName)
    )
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    WearApp("Preview Android")
}