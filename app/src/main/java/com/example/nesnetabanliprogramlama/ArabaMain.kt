package com.example.nesnetabanliprogramlama

fun main(){
    val bmw = Araba("Kırmızı", 10, false)
    println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)

    bmw.bilgAl()
    bmw.calistir()
    bmw.durdur()

    bmw.hizlan(100)
    bmw.yavasla(40)
    bmw.bilgAl()

    val sahin = Araba("Sarı", 40, false)
    sahin.bilgAl()

}