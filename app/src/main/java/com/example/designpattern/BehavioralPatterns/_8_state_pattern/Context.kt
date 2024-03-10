package com.example.designpattern.BehavioralPatterns._8_state_pattern

class Context {
    var state : State = ConcreteStateA()

    fun request(){
        state.handle(this)
    }
}