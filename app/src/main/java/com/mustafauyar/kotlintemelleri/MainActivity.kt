package com.mustafauyar.kotlintemelleri

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mustafauyar.kotlintemelleri.ui.theme.KotlinTemelleriTheme

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    println("lokman")
    println(5*8)
    var x = 10
    var y = 20
    var z = 30
    println("$x  y ise $y")
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    KotlinTemelleriTheme {
        Greeting("world".uppercase())
    }
}