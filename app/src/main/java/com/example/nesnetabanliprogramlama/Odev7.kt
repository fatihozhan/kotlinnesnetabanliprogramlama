package com.example.nesnetabanliprogramlama

class Odev7 {

    fun internetUcretHesapla(GB: Int): Int {
        var ucret = 0

        if (GB > 50) {
            val kotaFazlasi = GB - 50
            ucret = 100 + kotaFazlasi * 4
        } else {
            ucret = 100
        }
        return ucret
    }
}