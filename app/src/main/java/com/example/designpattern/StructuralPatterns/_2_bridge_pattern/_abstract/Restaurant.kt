package com.example.designpattern.StructuralPatterns._2_bridge_pattern._abstract

abstract class Restaurant(val pizza: Pizza) {

    abstract fun addSauce()
    abstract fun addToppings()
    abstract fun makeCrust()

    fun deliver(){
        addSauce()
        addToppings()
        makeCrust()
        pizza.assemble()
        pizza.qualityCheck()
        println("Đơn hàng đang được thực hiện!!")
    }
}