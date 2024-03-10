package com.example.designpattern.BehavioralPatterns._8_state_pattern


class ConcreteStateA : State{
    override fun handle(context: Context) {
        println("Đang ở trạng thái A -> chuyển sang trạng thái B")
        context.state = ConcreteStateB()
    }
}