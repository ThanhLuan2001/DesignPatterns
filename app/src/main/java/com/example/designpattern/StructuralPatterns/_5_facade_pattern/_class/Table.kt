package com.example.designpattern.StructuralPatterns._5_facade_pattern._class

import com.example.designpattern.StructuralPatterns._5_facade_pattern._interface.Furniture

class Table : Furniture {
    override fun make() {
        println("Make a table")
    }
}