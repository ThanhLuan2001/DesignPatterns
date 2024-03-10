package com.example.designpattern.CreationalPatterns._1_singleton

class DoubleCheckLocking private constructor(){

    companion object{
        @Volatile
        private var instance : DoubleCheckLocking? = null

         fun getInstance() : DoubleCheckLocking {
            if (instance ==null){

                    synchronized(DoubleCheckLocking::class.java){
                        if (instance ==null){
                            instance =
                                DoubleCheckLocking()
                        }
                }
            }
            return instance!!
        }
    }
    var name4 : String = ""

}