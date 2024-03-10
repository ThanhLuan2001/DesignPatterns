package com.example.designpattern.StructuralPatterns._4_decorator_pattern.decorator

import com.example.designpattern.StructuralPatterns._4_decorator_pattern._abstract.IPizza
import com.example.designpattern.StructuralPatterns._4_decorator_pattern._abstract.PizzaDecorator

class CheeseDecorator(val pizza : IPizza) : PizzaDecorator(pizza) {

    override fun doPizza(): String {
        return "${pizza.doPizza()} + Cheese"
    }

}