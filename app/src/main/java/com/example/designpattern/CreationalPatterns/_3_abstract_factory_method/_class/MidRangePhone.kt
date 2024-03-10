package com.example.designpattern.CreationalPatterns._3_abstract_factory_method._class

import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._interface.Phone

class MidRangePhone : Phone {
    override fun getSegment(): String {
        return "Mid range phone"
    }
}