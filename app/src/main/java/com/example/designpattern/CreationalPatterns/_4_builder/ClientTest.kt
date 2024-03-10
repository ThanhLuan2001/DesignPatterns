package com.example.designpattern.CreationalPatterns._4_builder

import com.example.designpattern.CreationalPatterns._4_builder.model.House

fun main(){
    val house1 : House = HouseBuilder()
        .buildWalls(4)
        .buildDoors(2)
        .withColor("Yellow")
        .buildRoof(true)
        .build()

    println(house1)
}