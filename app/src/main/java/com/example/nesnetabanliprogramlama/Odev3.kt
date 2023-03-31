package com.example.nesnetabanliprogramlama

class Odev3 {

    fun faktoriyel(sayi: Int): Int {
        var sonuc = 1

        for (i in 1..sayi) {
            sonuc = sonuc * i
        }
        return sonuc
    }
}