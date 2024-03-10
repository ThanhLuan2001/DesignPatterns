package com.example.designpattern.StructuralPatterns._6_flyweight_pattern

// Implementación của đối tượng chia sẻ (ConcreteFlyweight)
class CoffeeFlavor(private val flavor: String) : Coffee {
    override fun serveCoffee(tableNumber: Int) {
        println("Serving coffee flavor '$flavor' to table $tableNumber")
    }
}