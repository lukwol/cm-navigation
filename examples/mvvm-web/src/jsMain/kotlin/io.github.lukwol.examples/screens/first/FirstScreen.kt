package io.github.lukwol.examples.screens.first

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import io.github.lukwol.examples.AppRoutes
import io.github.lukwol.screens.navigation.LocalScreensController
import org.jetbrains.compose.web.attributes.placeholder
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.TextInput

@Composable
fun FirstScreen(viewModel: FirstScreenViewModel) {
    val screensController = LocalScreensController.current

    Div(
        attrs = {
            style {
                padding(20.px)
            }
        }
    ) {
        TextInput(value = viewModel.text) {
            placeholder("Type something...")
            onInput {
                viewModel.text = it.value
            }
        }
    }

    Div(
        attrs = {
            style {
                paddingLeft(20.px)
                paddingRight(20.px)
                paddingBottom(20.px)
            }
        }
    ) {
        Button(
            attrs = {
                onClick {
                    screensController.push(AppRoutes.SecondScreenRoute, viewModel.text)
                }
            }
        ) {
            Text("Go to second screen")
        }
    }
}
