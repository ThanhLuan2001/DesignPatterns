package com.example.designpattern.StructuralPatterns._7_proxy_pattern

class ProxyImage(var url : String) : Image{

    var realImage: RealImage? = null

    override fun load() {
        if (realImage==null){
            realImage = RealImage(url)
        }else{
            println("Image already existed!")
        }
        realImage!!.load()
    }
}