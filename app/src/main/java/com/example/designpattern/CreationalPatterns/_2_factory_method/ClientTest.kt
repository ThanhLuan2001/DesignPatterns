package com.example.designpattern.CreationalPatterns._2_factory_method

import com.example.designpattern.CreationalPatterns._2_factory_method._class.HardCandy
import com.example.designpattern.CreationalPatterns._2_factory_method._class.MintyCandy
import com.example.designpattern.CreationalPatterns._2_factory_method._enum.CandyType
import com.example.designpattern.CreationalPatterns._2_factory_method._interface.Candy
import com.example.designpattern.CreationalPatterns._2_factory_method.factory.CandyFactory

fun main(){
    val candyHard : Candy = CandyFactory.getCandy(CandyType.HARD_CANDY)
    println(candyHard.getCandyName())
    println("===================================")

    val candyMinty : Candy = CandyFactory.getCandy(CandyType.MINTY_CANDY)
    println(candyMinty.getCandyName())
    println("===================================")

    val candyHard2 : HardCandy = CandyFactory.getCandy(CandyType.HARD_CANDY) as HardCandy
    println(candyHard2.getCandyName())
    println("===================================")

    val candyMinty2 : MintyCandy = CandyFactory.getCandy(CandyType.MINTY_CANDY) as MintyCandy
    println(candyMinty2.getCandyName())
    println("===================================")

}