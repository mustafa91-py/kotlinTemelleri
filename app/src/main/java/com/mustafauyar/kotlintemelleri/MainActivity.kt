package com.mustafauyar.kotlintemelleri

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mustafauyar.kotlintemelleri.ui.theme.KotlinTemelleriTheme
import java.math.BigInteger

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
    myOutPut()
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
fun ders3_8(){
//    stringler python dakine benzer yapılar var
    val myString = "hello world"
    println(myString)
    println(myString.length)//pythondaki properties lar gibi kullılarak uzunluk verir
    println(myString.hashCode())//string sınıfının metodu ile hash kodunu gösterir
    val myString2:String
    myString2 = "bye bye world"
    println(myString+" "+myString2)//stringlerde toplama işlemi birleştirir

}
fun ders3_9(){
    //boolean
    val x = true
    val y = false
    val z = true
    println(x==y==z)
    println(x==z)
    println(x!=y)

}
fun ders3_10(){
    //veri tipleri
    //pythona benzer dönüşümler var
    val x = "50"
    val y = x.toInt() //integer a sınıfın metodu ilee dönüştürüldü
    println(y/y)
}
fun ders3_11(){
    //diziler yani sayılabilenler attributes
    val my_array = arrayOf("mustafa","uyar","28")
//    println(my_array[-1])// negatif değerler alamadı pythonda alıyor du !!
    println(my_array[2])
    println( my_array.lastIndex)//en son kaçıncı indexi var veriyor
    //pythondaki listeler gibi
    val my_array2 = arrayOf("mustafa",25,true)
    println(my_array2)//pythonda farklı liste gibi davranmıyor farklı bir sınıfa çeviriyor farklı type ler olunca
    println(my_array2[1])
    println(my_array2[my_array2.lastIndex]) // en son index dekini çağırdı -1 gibi pythonda

}
fun ders3_12(){
    // dizilerde ki farklı veriler
    val myList = arrayOf(1,2,3,4,5,6,7,8,9,0)
    println(myList)
    println(myList.sum())
    myList.set(0,9)
//    println(myList[0])
    println(myList.sum())
}
fun ders3_13(){
    //arraylist
    val mixList = arrayListOf<Any>()
    mixList.add("mustafa")
    mixList.add("uyar")
    mixList.add(28)
    println(mixList.get(mixList.lastIndex)) // son index dekini aldık
    println(mixList[0])
    println("listedeki 2. element = ${mixList[1]}")//f stringlere benzer kullanım ama farklı tarz
}
fun ders3_14(){
    // set matematikte ki kümeler
    val x = setOf<Int>(1,2,2,3,4,4,4)
    println("boyut = ${x.size}")
    x.forEach {
        println("elementler = ${it}")
    }
    val y = HashSet<String>()
    y.add("mustafa");y.add("uyar");y.add("uyar");y.add("uyar");y.add("28")
    y.forEach {
        println("hashset elementler = ${it}")
    }
    // setler pytho mantığına benzer ama sanki rastgele vermiyor gibi pythonda her çalıştığında farklı sıra ile geliyordu

}
fun ders3_15(){
    val title:String = "map key-value pairing"
    println(title.uppercase())
    val x = HashMap<String,Int>()
    x.put("elma",100)
    x.put("et",300)
    x.put("tavuk",200)
    x.forEach {
        println(it)
    }
    val y = hashMapOf<String,String>()
    y.put("ördek","sarı")
    y.put("ördek","yeşil")// aynı keyden 2 tane olmauyor
    y.forEach {
        println(it)
    }
    val z = hashMapOf<Any,Any>("mustafa" to 28,"uyar" to 27)//sözlükler : bu yerine to kullanılıyor
    println(z.get("mustafa"))
    println(z.get("uyar"))
}
fun ders3_16(){
    val title = "matematiksel opertörler".uppercase()
    println(title)
    var x = 10
    x += 1 // ilk kullanım
    println(x)
    x++ // ikinci kullanım
    println(x)
    x = x+1// üçüncü kullanım
    println(x)
    var y = 10
    y += 5
    println("x = ${x},y = ${y} için :")
    println("x < y : ${x<y}")
    println("x > y : ${x>y}")
    println(x<y && 2<-1*1)// ve  and
    println(x<y || 2<-1*1)// veya or
    println("11 i 3 bölersen kalan : ${11%3} \nkalanı bulmak % işareti kullan")
}
fun ders3_17(){
    val title = "eğer şart kontrolleri".uppercase()
    println(title)
    var x = 10
    x -=5
    if (x < 10){
        println("skor 10 dan küçük")
    } else if (x>=10 && x<=20){
        println("skor 10 ve 20 arasında bir sayı")
    } else {
        println("skor 20 den büyük sayı")
    }
}
fun myOutPut(){
    ders3_5()
    ders3_6()
    ders3_7()
    ders3_8()
    ders3_9()
    ders3_10()
    ders3_11()
    ders3_12()
    ders3_13()
    ders3_14()
    ders3_15()
    ders3_16()
    ders3_17()
}