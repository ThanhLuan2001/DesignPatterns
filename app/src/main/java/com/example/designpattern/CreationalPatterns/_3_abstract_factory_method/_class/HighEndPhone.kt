package com.example.designpattern.CreationalPatterns._3_abstract_factory_method._class

import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._interface.Phone

class HighEndPhone : Phone {
    override fun getSegment(): String {
        return "High end phone"
    }
}