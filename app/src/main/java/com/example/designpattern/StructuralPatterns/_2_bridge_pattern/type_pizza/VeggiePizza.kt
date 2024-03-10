package com.example.designpattern.StructuralPatterns._2_bridge_pattern.type_pizza

import com.example.designpattern.StructuralPatterns._2_bridge_pattern._abstract.Pizza

class VeggiePizza : Pizza() {

    override fun assemble() {
        println("Thêm nước sốt : $sauce")
        println("Them toppings : $toppings")
        println("Thêm rau củ")
    }

    override fun qualityCheck() {
        println("Lớp vỏ là : $crust")
    }
}