package com.example.designpattern.BehavioralPatterns._5_mediator_pattern

fun main() {
    val mediator = ChatMediator()

    val teacher1 = Teacher("Teacher 1", mediator)
    val teacher2 = Teacher("Teacher 2", mediator)
    val teacher3 = Teacher("Teacher 3", mediator)
    val teacher4 = Teacher("Teacher 4", mediator)
    val teacher5 = Teacher("Teacher 5", mediator)

    mediator.apply {
        addTeacher(teacher1)
        addTeacher(teacher2)
        addTeacher(teacher3)
        addTeacher(teacher4)
        addTeacher(teacher5)
    }

    teacher1.sendMessage("Xin chào")

}
