package com.example.designpattern.StructuralPatterns._5_facade_pattern.singleton

import com.example.designpattern.StructuralPatterns._5_facade_pattern._class.Chair
import com.example.designpattern.StructuralPatterns._5_facade_pattern._class.Table
import com.example.designpattern.StructuralPatterns._5_facade_pattern._class.Television
import com.example.designpattern.StructuralPatterns._5_facade_pattern._interface.Furniture

class FurnitureFacade private constructor(){

    companion object{
        private var instance : FurnitureFacade? = null
        lateinit var table: Furniture
        lateinit var chair: Furniture
        lateinit var television: Furniture

        fun getInstance() : FurnitureFacade{
            if (instance==null){
                instance = FurnitureFacade()
            }
            return instance!!
        }

    }

    init {
        table = Table()
        chair = Chair()
        television = Television()
    }

    fun makeTableAndChair(){
        table.make()
        chair.make()
    }

    fun makeTVAndChair(){
        television.make()
        chair.make()
    }
}