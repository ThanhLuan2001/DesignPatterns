package com.example.designpattern.BehavioralPatterns._9_strategy_pattern

fun main(){
    val thueA = ThueA()
    val tinhThueA = MayTinhThue(thueA)
    val tienThueA = tinhThueA.tienThue(10000)
    println("Tiền thuế A là : $tienThueA")
    println("=====================================")

    val thueB = ThueB()
    val tinhThueB = MayTinhThue(thueB).tienThue(10000)
    println("Tiền thuế B là : $tinhThueB")
    println("=====================================")

    val tienThueC = MayTinhThue(ThueC()).tienThue(20000)
    println("Tiền thuế C là : $tienThueC")

}