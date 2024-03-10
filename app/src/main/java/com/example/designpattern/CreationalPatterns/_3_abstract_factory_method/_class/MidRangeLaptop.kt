package com.example.designpattern.CreationalPatterns._3_abstract_factory_method._class

import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._interface.Laptop

class MidRangeLaptop : Laptop {
    override fun getSegment(): String {
        return "Mid range laptop"
    }
}