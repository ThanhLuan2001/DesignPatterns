package com.example.designpattern.CreationalPatterns._4_builder

import com.example.designpattern.CreationalPatterns._4_builder._interface.Builder
import com.example.designpattern.CreationalPatterns._4_builder.model.House


class HouseBuilder : Builder {
    private var walls: Int = 0
    private var doors: Int = 0
    private var hasPool: Boolean = false
    private var hasRoof: Boolean = false
    private var color: String = ""

    override fun buildRoof(hasRoof: Boolean): Builder {
        this.hasRoof = hasRoof
        return this
    }

    override fun buildWalls(walls: Int): Builder {
        this.walls = walls
        return this
    }

    override fun buildPool(hasPool: Boolean): Builder {
        this.hasPool = hasPool
        return this
    }

    override fun buildDoors(doors: Int): Builder {
        this.doors = doors
        return this
    }

    override fun withColor(color: String): Builder {
        this.color = color
        return this
    }


    override fun build(): House {
        return House(walls, doors, hasPool, hasRoof, color)
    }
}