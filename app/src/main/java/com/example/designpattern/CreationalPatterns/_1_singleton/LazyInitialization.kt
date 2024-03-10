package com.example.designpattern.CreationalPatterns._1_singleton

class LazyInitialization private constructor() {

    companion object {
        private var instance: LazyInitialization? = null

        @JvmStatic
        fun getInstance(): LazyInitialization {
            if (instance == null) {
                instance = LazyInitialization()
            }
            return instance!!
        }
    }
    var name2 : String = ""

}


