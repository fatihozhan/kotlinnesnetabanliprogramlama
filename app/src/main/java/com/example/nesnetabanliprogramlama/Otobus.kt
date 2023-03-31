package com.example.nesnetabanliprogramlama

class Otobus(var kapasite: Int, var nereden: String, var nereye: String, var mevcutYolcu: Int) {
    fun bilgiAl() {
        println("Kapaise : $kapasite")
        println("Nereden : $nereden")
        println("Nereye : $nereye")
        println("Mevcut Yolcu : $mevcutYolcu")
    }

    fun yolcuAl(yolcu: Int) {
        mevcutYolcu = +yolcu
    }

    fun yolcuIndir(yolcu: Int) {
        mevcutYolcu -= yolcu
    }
}