package com.example.designpattern.StructuralPatterns._1_adapter_pattern

class BusinessAnalyst(private val developer: Developer) : Customer {


    override fun sendRequest(request: String) {
        println("Reading request....")
        println(request)
        val info : String = this.translate(request)
        println("Sending info....")
        developer.receive(info)
    }

    private fun translate(request: String) : String{
        return "Tạo việc remote"
    }
}