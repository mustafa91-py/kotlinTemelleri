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
    var x = 5
    var y = 100
    var z = 2
    println(x*z/y)// soldan sağa sıra ile hesaplamalar yapılıyor
    println((x)*(y/z))// yuvarlama yı tahminimce otomatik yapıyor dikkat
    //val yani value ile var yani variable farklı işlevlerde kullanılır
    //val sabit değerler için var ise değişkenler için kullanılır
    val pi= 3.14
    val myValue = 49
    println(myValue)
    println(pi)
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    KotlinTemelleriTheme {
        Greeting("world".uppercase())
    }
}