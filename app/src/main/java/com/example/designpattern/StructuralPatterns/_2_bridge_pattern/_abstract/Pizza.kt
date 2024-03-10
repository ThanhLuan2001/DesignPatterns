package com.example.designpattern.StructuralPatterns._2_bridge_pattern._abstract

abstract class Pizza {
    var sauce : String? = null
    var toppings: String? = null
    var crust : String? = null

    abstract fun assemble()
    abstract fun qualityCheck()
}