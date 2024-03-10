package com.example.designpattern.StructuralPatterns._3_composite_pattern

abstract class Employee(
    var age : Int,
    var name : String,
    var salary : Double
){

    abstract fun add(employee: Employee)
    abstract fun remove(employee: Employee)
    abstract fun print()
}