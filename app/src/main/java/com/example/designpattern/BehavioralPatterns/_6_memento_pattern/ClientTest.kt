package com.example.designpattern.BehavioralPatterns._6_memento_pattern

fun main(){

    //Tạo trạng thái
    var originator = Originator("Vui")

    //In ra trạng thái
    println("Trạng thái đầu tiên là ${originator.state}")

    //Tạo đối tượng lưu trữ trạng thái
    val caretaker = Caretaker()

    //Lưu trữ lại trạng thái hiện tại "Vui"
    caretaker.addState(originator.createState())

    //Thay đổi trạng thái thành buồn
    originator.replaceState("Buồn")

    //In ra trạng thái
    println("Trạng thái thay đổi là ${originator.state}")

    //Khôi phục lại trạng thái
    originator.restoreState(caretaker.getState(0))

    //In ra trạng thái
    println("Trạng thái sau khi khôi phục là ${originator.state}")

}