package com.example.designpattern.StructuralPatterns._5_facade_pattern

import com.example.designpattern.StructuralPatterns._5_facade_pattern.singleton.FurnitureFacade

fun main(){
    val facade : FurnitureFacade = FurnitureFacade.getInstance()
    facade.makeTableAndChair()
    println("======================")
    facade.makeTVAndChair()


}