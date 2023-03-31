package com.example.nesnetabanliprogramlama

fun main(){
    val hesapla = Hesaplayici()

    hesapla.topla(20, 40)
    hesapla.topla(20.4, 40)
    hesapla.topla(20, 40.3)
    hesapla.topla(20, 40, "Fatih")
}