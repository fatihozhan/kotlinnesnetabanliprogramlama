package com.example.nesnetabanliprogramlama

fun main() {
    fun selamla() {
        val sonuc = "Merhaba Fatih"
        println(sonuc)
    }
    selamla()

    fun selamla1(): String {
        val sonuc = "Merhaba Mehmet"
        return sonuc
    }

    val gelenSonuc = selamla1()
    println(gelenSonuc)

    fun selamla2(isim:String) {
        val sonuc= "Merhaba $isim";
        println(sonuc)
    }

    selamla2("Fatih")

    fun toplama(){
        val toplam = 40 +30
        println("Toplama : $toplam")
    }
    toplama()

    fun toplama1():Int{
        val toplam = 40+ 19
        return toplam
    }
    val t1 = toplama1()
    println(t1)
}