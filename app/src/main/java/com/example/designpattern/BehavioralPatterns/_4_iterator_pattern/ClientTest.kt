package com.example.designpattern.BehavioralPatterns._4_iterator_pattern

fun main(){
    val menu = Menu()
    menu.add(Item("Title 1", "/struc"))
    menu.add(Item("Title 2", "/create"))
    menu.add(Item("Title 3", "/behavior"))

    val iterator = menu.iterator()

    while (iterator.hasNext()) {
        val item = iterator.next()
        println(item.title)
    }
}