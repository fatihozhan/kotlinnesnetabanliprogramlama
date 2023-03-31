package com.example.nesnetabanliprogramlama

fun main(){
    //Sadece classlarda kullanılır.
    lateinit var otobus:Otobus


    val kamilKoc = Otobus(50, "Burasadan", "Ankara", 10)
    println(kamilKoc.kapasite)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcutYolcu)

    kamilKoc.bilgiAl()

    kamilKoc.yolcuAl(20)
    kamilKoc.bilgiAl()
    kamilKoc.yolcuIndir (10)
    kamilKoc.bilgiAl()
}
