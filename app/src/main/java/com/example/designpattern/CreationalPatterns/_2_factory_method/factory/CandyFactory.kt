package com.example.designpattern.CreationalPatterns._2_factory_method.factory

import com.example.designpattern.CreationalPatterns._2_factory_method._class.HardCandy
import com.example.designpattern.CreationalPatterns._2_factory_method._class.MintyCandy
import com.example.designpattern.CreationalPatterns._2_factory_method._enum.CandyType
import com.example.designpattern.CreationalPatterns._2_factory_method._interface.Candy


class CandyFactory private constructor(){

    companion object{
        fun getCandy(candyType: CandyType) : Candy {
            when(candyType){
                CandyType.MINTY_CANDY -> return MintyCandy()
                CandyType.HARD_CANDY -> return HardCandy()
                else -> throw IllegalArgumentException("This candy type is unsupported")

            }
        }
    }
}