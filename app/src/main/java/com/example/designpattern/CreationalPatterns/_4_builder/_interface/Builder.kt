package com.example.designpattern.CreationalPatterns._4_builder._interface
import com.example.designpattern.CreationalPatterns._4_builder.model.House

interface Builder {

    fun buildRoof(hasRoof : Boolean) : Builder
    fun buildPool(hasPool : Boolean) : Builder
    fun buildWalls(walls: Int) : Builder
    fun buildDoors(doors: Int) : Builder
    fun withColor(color: String) : Builder
    fun build(): House
}