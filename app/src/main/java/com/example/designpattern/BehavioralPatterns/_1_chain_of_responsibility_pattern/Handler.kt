package com.example.designpattern.BehavioralPatterns._1_chain_of_responsibility_pattern

// Interface đại diện cho mỗi xử lý yêu cầu
interface Handler {

    fun handleRequest(request: Int)
}