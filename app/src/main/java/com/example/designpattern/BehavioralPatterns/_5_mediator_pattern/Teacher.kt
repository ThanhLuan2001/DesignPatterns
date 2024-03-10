package com.example.designpattern.BehavioralPatterns._5_mediator_pattern

class Teacher(val name : String, val chatMediator: ChatMediator) {

    fun sendMessage(message : String){
        println("$name gửi tin nhắn : $message")
        chatMediator.sendMessage(message,this)
    }


    fun receiveMessages(message: String){
        println("$name nhận được tin nhắn : $message")
    }
}