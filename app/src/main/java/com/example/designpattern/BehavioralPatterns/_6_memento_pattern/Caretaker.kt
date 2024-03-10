package com.example.designpattern.BehavioralPatterns._6_memento_pattern

class Caretaker {

    val listState = ArrayList<String>()

    fun addState(state : String){
        listState.add(state)
    }

    fun getState(index : Int) : String{
        return listState[index]
    }
}