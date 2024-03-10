package com.example.designpattern.CreationalPatterns._1_singleton

class ThreadSafe private constructor() {

    companion object {
        @Volatile
        private var instance: ThreadSafe? = null

        @Synchronized
        fun getInstance(): ThreadSafe {
            if (instance == null) {
                instance = ThreadSafe()
            }
            return instance!!
        }
    }
    var name3 : String = ""

}