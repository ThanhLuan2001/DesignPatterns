package com.example.designpattern.BehavioralPatterns._9_strategy_pattern

class ThueC : Thue {
    override fun tinhThue(thuNhap: Int): Double {
        return thuNhap * 0.2
    }
}