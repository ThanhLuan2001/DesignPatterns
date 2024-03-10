package com.example.designpattern.StructuralPatterns._2_bridge_pattern

import com.example.designpattern.StructuralPatterns._2_bridge_pattern.type_pizza.ChickenPizza
import com.example.designpattern.StructuralPatterns._2_bridge_pattern.type_pizza.PepperoniPizza
import com.example.designpattern.StructuralPatterns._2_bridge_pattern.type_restaurant.ThaiLanRestaurant
import com.example.designpattern.StructuralPatterns._2_bridge_pattern.type_restaurant.VietNamRestaurant

fun main(){
    val vietNamRestaurant = VietNamRestaurant(PepperoniPizza())
    vietNamRestaurant.deliver()
    val thaiLanRestaurant = ThaiLanRestaurant(ChickenPizza())
    thaiLanRestaurant.deliver()
}