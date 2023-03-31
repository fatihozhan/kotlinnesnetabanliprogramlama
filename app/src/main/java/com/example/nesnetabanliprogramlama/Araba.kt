package com.example.nesnetabanliprogramlama

class Araba(var renk: String, var hiz: Int, var calisiyorMu: Boolean) {
    fun calistir(){
        calisiyorMu = true
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }
    fun hizlan(kacKm:Int){
        hiz += kacKm
    }
    fun yavasla(kacKm:Int){
        hiz -= kacKm
    }
    fun bilgAl(){
        println("Renk : $renk")
        println("Hız : $hiz")
        println("Çalışır Mı : $calisiyorMu")
    }
}