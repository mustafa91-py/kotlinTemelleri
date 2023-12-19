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
fun main() {
    myOutPut(name = "world")
}

fun ders3_5(){
    // integer tam sayılar
    //initializing,initializing
    val myInteger:Int // burda sabit belirtmeden boş bir sabit oluşturduk
    //sabitler değişmezdi ama burda sabit olmadığı için bir defaya mahsus deeğer verebiliriz
    myInteger = 5//sabiti verdim bir daha değer veremem vermek için var olması gerek
    println(myInteger)

}
fun ders3_6(){
//    long 64 bit

    var x:Long = 500
    println(x)
    x = 3000000000
    println(x)
}
fun ders3_7(){
//    ondalıklı sayılar
    val x:Double = 3.14//double sınıfının bir değeri
    println(x)
    val y:Float = 3.14f//float sınıfının bir değeri
    println(y)
//    ikisi arasında ki fark verinin tipi ve boyutu yani bit i

}
fun myOutPut(name: String){
    ders3_5()
    ders3_6()
}