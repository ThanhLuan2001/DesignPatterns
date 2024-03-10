package com.example.designpattern.BehavioralPatterns._1_chain_of_responsibility_pattern

// Các đối tượng xử lý cụ thể
class ConcreteHandler1 : Handler {
    var nextHandler: Handler? = null

    override fun handleRequest(request: Int) {
        if (request <= 10) {
            println("ConcreteHandler1 handles the request: $request")
        } else {
            nextHandler?.handleRequest(request)
        }
    }
}
