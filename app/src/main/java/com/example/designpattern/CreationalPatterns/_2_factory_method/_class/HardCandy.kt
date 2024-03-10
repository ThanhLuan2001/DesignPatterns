package com.example.designpattern.CreationalPatterns._2_factory_method._class

import com.example.designpattern.CreationalPatterns._2_factory_method._interface.Candy

class HardCandy : Candy {
    override fun getCandyName(): String {
        return "Hard Candy"
    }
}