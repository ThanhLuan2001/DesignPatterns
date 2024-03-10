package com.example.designpattern.StructuralPatterns._4_decorator_pattern

import com.example.designpattern.StructuralPatterns._4_decorator_pattern.decorator.CheeseDecorator
import com.example.designpattern.StructuralPatterns._4_decorator_pattern.type_pizza.ChickenPizza
import com.example.designpattern.StructuralPatterns._4_decorator_pattern.decorator.PepperDecorator
import com.example.designpattern.StructuralPatterns._4_decorator_pattern.decorator.PepsiDecorator
import com.example.designpattern.StructuralPatterns._4_decorator_pattern.type_pizza.MixedPizza
import com.example.designpattern.StructuralPatterns._4_decorator_pattern.type_pizza.TomatoPizza


fun main(){ //Kế thừa từ một đối tượng và mở rộng chức năng của nó mà không làm thay đổi cấu trúc.
    val tomatoPizza = TomatoPizza()
    val chickenPizza = ChickenPizza()
    val mixedPizza = MixedPizza()

    println(tomatoPizza.doPizza())
    println(chickenPizza.doPizza())
    println(mixedPizza.doPizza())

    println("------------------------------------")

    // Use Decorator pattern to extend existing pizza dynamically

    // Add pepper to tomato-pizza, chicken - pizza, mixedPizza
    println(PepperDecorator(tomatoPizza).doPizza())
    println(PepperDecorator(chickenPizza).doPizza())
    println(PepperDecorator(mixedPizza).doPizza())

    println("------------------------------------")

    // Add cheese to tomato-pizza, chicken - pizza, mixedPizza
    val cheeseDecoratorTomato = CheeseDecorator(tomatoPizza)
    println(cheeseDecoratorTomato.doPizza())
    val cheeseDecoratorChicken = CheeseDecorator(tomatoPizza)
    println(cheeseDecoratorChicken.doPizza())
    val cheeseDecoratorMixed = CheeseDecorator(tomatoPizza)
    println(cheeseDecoratorMixed.doPizza())

    println("------------------------------------")

    // Add pepsi to tomato-pizza, chicken - pizza, mixedPizza
    val pepsiDecoratorTomato = PepsiDecorator(tomatoPizza)
    println(pepsiDecoratorTomato.doPizza())
    val pepsiDecoratorChicken = PepsiDecorator(tomatoPizza)
    println(pepsiDecoratorChicken.doPizza())
    val pepsiDecoratorMixed = PepsiDecorator(tomatoPizza)
    println(pepsiDecoratorMixed.doPizza())

    println("------------------------------------")

    // Add cheese and pepper to tomato-pizza

    val cheese_peppe_Decorator = CheeseDecorator(PepperDecorator(tomatoPizza))
    println(cheese_peppe_Decorator.doPizza())

    println("------------------------------------")

    // Add cheese and pepper and pepsi to tomato-pizza

    val pepsi_cheese_peppe_Decorator = PepsiDecorator(CheeseDecorator(PepperDecorator(tomatoPizza)))
    println(pepsi_cheese_peppe_Decorator.doPizza())

}