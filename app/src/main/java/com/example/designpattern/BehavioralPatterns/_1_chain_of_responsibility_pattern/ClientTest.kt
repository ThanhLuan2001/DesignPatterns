package com.example.designpattern.BehavioralPatterns._1_chain_of_responsibility_pattern

fun main() {
    // Tạo các đối tượng xử lý
    val handler1 = ConcreteHandler1()
    val handler2 = ConcreteHandler2()

    // Thiết lập mối quan hệ chuỗi giữa các đối tượng xử lý
    handler1.nextHandler = handler2

    // Gửi yêu cầu và bắt đầu chuỗi xử lý
    handler1.handleRequest(5)
    handler1.handleRequest(15)
    handler1.handleRequest(25)
}