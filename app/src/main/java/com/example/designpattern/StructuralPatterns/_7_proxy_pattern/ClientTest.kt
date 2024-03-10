package com.example.designpattern.StructuralPatterns._7_proxy_pattern

fun main(){
    val proxyImage = ProxyImage("https://abcd.com/dev.png")
    println("first load")
    proxyImage.load()
    println("second load")
    proxyImage.load()

}