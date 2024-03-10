package com.example.designpattern.StructuralPatterns._2_bridge_pattern.type_restaurant

import com.example.designpattern.StructuralPatterns._2_bridge_pattern._abstract.Pizza
import com.example.designpattern.StructuralPatterns._2_bridge_pattern._abstract.Restaurant

class VietNamRestaurant(pizza: Pizza) : Restaurant(pizza) {

    override fun addSauce() {
        pizza.sauce = "Cà chua"
    }

    override fun addToppings() {
        pizza.toppings = "Trân Trâu đen"
    }

    override fun makeCrust() {
        pizza.crust = "To"
    }
}