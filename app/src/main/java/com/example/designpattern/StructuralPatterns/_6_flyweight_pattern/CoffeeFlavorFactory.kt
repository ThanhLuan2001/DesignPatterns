package com.example.designpattern.StructuralPatterns._6_flyweight_pattern

// Factory để quản lý và cung cấp các đối tượng chia sẻ
class CoffeeFlavorFactory {
    private val flavors: MutableMap<String, CoffeeFlavor> = mutableMapOf()

    fun getCoffeeFlavor(flavor: String): CoffeeFlavor {
        return flavors.getOrPut(flavor) { CoffeeFlavor(flavor) }
    }
}