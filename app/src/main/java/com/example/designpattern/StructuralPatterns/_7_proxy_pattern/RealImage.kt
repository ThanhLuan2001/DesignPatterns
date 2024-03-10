package com.example.designpattern.StructuralPatterns._7_proxy_pattern

class RealImage(var url : String) : Image{
    override fun load() {
        println("load from : $url")
    }
}