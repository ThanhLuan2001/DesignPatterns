package com.example.designpattern.StructuralPatterns._2_bridge_pattern.type_restaurant

import com.example.designpattern.StructuralPatterns._2_bridge_pattern._abstract.Pizza
import com.example.designpattern.StructuralPatterns._2_bridge_pattern._abstract.Restaurant

class ThaiLanRestaurant(pizza: Pizza) : Restaurant(pizza) {

    override fun addSauce() {
        pizza.sauce = "Xoài"
    }

    override fun addToppings() {
        pizza.toppings = "Trân Trâu trắng"
    }

    override fun makeCrust() {
        pizza.crust = "Nhỏ"
    }
}