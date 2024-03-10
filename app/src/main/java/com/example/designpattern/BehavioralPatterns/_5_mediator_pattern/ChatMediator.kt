package com.example.designpattern.BehavioralPatterns._5_mediator_pattern

class ChatMediator {
    var listTeacher = ArrayList<Teacher>()

    fun addTeacher(teacher: Teacher){
        listTeacher.add(teacher)
    }


    fun sendMessage(message : String,teacher: Teacher){
        for (item in listTeacher){
            if (item!=teacher){
                item.receiveMessages(message)
            }
        }
    }
}