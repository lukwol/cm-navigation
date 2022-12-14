package io.github.lukwol.examples

import androidx.compose.runtime.Composable
import io.github.lukwol.examples.screens.FirstScreen
import io.github.lukwol.examples.screens.SecondScreen
import io.github.lukwol.screens.navigation.ScreensNavigation

@Composable
fun AppNavigation() {
    ScreensNavigation(
        startRoute = AppRoutes.FirstScreenRoute
    ) {
        screen(AppRoutes.FirstScreenRoute) {
            FirstScreen()
        }
        screen(AppRoutes.SecondScreenRoute) { args ->
            SecondScreen(args as String)
        }
    }
}
