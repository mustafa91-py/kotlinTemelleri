package com.mustafauyar.kotlintemelleri

import java.util.HashMap

fun main(){
    attributes()
    sozlukler()
}
fun attributes(){
    val seri = arrayOf<String>("mustafa","uyar")//arrayOf boş olamaz
    seri.set(1,"mustafa")//set ile dğiştirilir sadece
    seri.set(0,"uyar")
    seri.forEach {
        println("${seri::class.simpleName}  = $it")
    }
    val liste = arrayListOf<Any>()//arraylistof pythonda ki listelere benzer bu makul gibi
    liste.add("elma")
    liste.add("armut")
    liste.add("kiraz")
    liste.add(true)
    liste.forEach {
        println("${liste::class.simpleName} : ${it::class.simpleName} = $it")
    }
    val kumesHayvanlari = setOf<String>("tavuk","ördek","köpek","köpek")
    println("kümesde ki hayvanlar = $kumesHayvanlari")
    val favColor = setOf<String>("mavi","kırmızı","sarı","turuncu")
    println(favColor)
    val mutableFavColor = mutableSetOf<String>("mavi","kırmızı","sarı","turuncu")
    mutableFavColor.add("çingene pembesi")
    println(mutableFavColor)//kümeye eleman ekledik
    val myHashSet = hashSetOf<String>("mavi","kırmızı","sarı","turuncu")
    myHashSet.add("kavuniçi")
    println("${myHashSet::class.simpleName} : $myHashSet")
    /*
    sonuç olarak değişmeyen bir küme oluşturmak için setOf
    ekelenebilecek bir küme için mutableSetOf veya hashSet kullanılabilir
     */
}
fun sozlukler(){
    val trToEng = hashMapOf<String,String>()
    trToEng.put("güneş","sun")
    trToEng.put("yavaş","slow")
    val mathExp = HashMap<String,Double>()
    mathExp["pi"] = 3.14
    mathExp["e"] = 2.71
    println(trToEng)
    println(mathExp)
}