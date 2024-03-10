package com.example.designpattern.StructuralPatterns._1_adapter_pattern

fun main(){
    val customer : Customer = BusinessAnalyst(Developer())
    customer.sendRequest("Tôi muốn làm việc tại nhà")
}