package com.example.designpattern.StructuralPatterns._6_flyweight_pattern

// Client sử dụng đối tượng chia sẻ
fun main() {
    val coffeeFactory = CoffeeFlavorFactory()

    val order1 = coffeeFactory.getCoffeeFlavor("Cappuccino")
    order1.serveCoffee(1)

    val order2 = coffeeFactory.getCoffeeFlavor("Espresso")
    order2.serveCoffee(2)

    val order3 = coffeeFactory.getCoffeeFlavor("Cappuccino")
    order3.serveCoffee(3)
}