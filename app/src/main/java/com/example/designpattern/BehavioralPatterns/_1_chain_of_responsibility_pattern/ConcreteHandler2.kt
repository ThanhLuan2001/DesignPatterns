package com.example.designpattern.BehavioralPatterns._1_chain_of_responsibility_pattern

// Các đối tượng xử lý cụ thể
class ConcreteHandler2 : Handler {
    var nextHandler: Handler? = null

    override fun handleRequest(request: Int) {
        if (request in 11..20) {
            println("ConcreteHandler2 handles the request: $request")
        } else {
            nextHandler?.handleRequest(request)
        }
    }
}