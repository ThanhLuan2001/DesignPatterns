package com.example.designpattern.CreationalPatterns._1_singleton

// cách 1
class EagerInitialization private constructor() {
    companion object {

        private val instance = EagerInitialization()

        @JvmStatic
        fun getInstance(): EagerInitialization {
            return instance
        }
    }
    var name1 : String = ""
}

//cách 2
//object EagerInitialization {
//    val instance: EagerInitialization = EagerInitialization
//    var name: String = ""
//}