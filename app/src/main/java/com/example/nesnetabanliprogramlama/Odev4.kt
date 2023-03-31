package com.example.nesnetabanliprogramlama

class Odev4 {

    fun kelimeAdeti(kelime: String, harf: Char) {
        var sonuc = 0
        for (k in kelime) {
            if (k == harf) {
                sonuc = sonuc + 1
            }
        }
        println("Harf adeti : $sonuc")
    }
}