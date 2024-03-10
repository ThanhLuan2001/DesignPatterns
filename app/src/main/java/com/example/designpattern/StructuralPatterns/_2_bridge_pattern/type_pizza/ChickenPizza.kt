package com.example.designpattern.StructuralPatterns._2_bridge_pattern.type_pizza

import com.example.designpattern.StructuralPatterns._2_bridge_pattern._abstract.Pizza

class ChickenPizza : Pizza() {

    override fun assemble() {
        println("Thêm nước sốt : $sauce")
        println("Them toppings : $toppings")
        println("Thêm thịt gà")
    }

    override fun qualityCheck() {
        println("Lớp vỏ là : $crust")
    }
}