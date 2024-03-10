package com.example.designpattern.BehavioralPatterns._8_state_pattern


class ConcreteStateB : State{
    override fun handle(context : Context) {
        println("Đang ở trạng thái B -> chuyển sang trạng thái A")
        context.state = ConcreteStateA()
    }
}