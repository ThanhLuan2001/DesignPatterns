package com.example.designpattern.BehavioralPatterns._9_strategy_pattern

class ThueA : Thue {
    override fun tinhThue(thuNhap: Int): Double {
        return thuNhap * 0.1
    }
}