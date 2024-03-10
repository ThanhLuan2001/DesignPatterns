package com.example.designpattern.CreationalPatterns._2_factory_method._class

import com.example.designpattern.CreationalPatterns._2_factory_method._interface.Candy

class MintyCandy : Candy {
    override fun getCandyName(): String {
        return "Minty Candy"
    }
}