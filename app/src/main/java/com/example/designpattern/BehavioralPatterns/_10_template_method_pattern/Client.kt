package com.example.designpattern.BehavioralPatterns._10_template_method_pattern

fun main(){

    val caPheNgon = CaPheNgon()
    println("Pha cà phê ngon --->")
    caPheNgon.phaCaPhe()

    println("------------------------")

    val caPheDonGian = CaPheDonGian()
    println("Pha cà phê đơn giản --->")
    caPheDonGian.phaCaPhe()
}