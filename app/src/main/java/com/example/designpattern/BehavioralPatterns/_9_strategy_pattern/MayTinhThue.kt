package com.example.designpattern.BehavioralPatterns._9_strategy_pattern

class MayTinhThue(var thue: Thue) {

    fun tienThue(thuNhap : Int) : Double{
        return thue.tinhThue(thuNhap)
    }
}