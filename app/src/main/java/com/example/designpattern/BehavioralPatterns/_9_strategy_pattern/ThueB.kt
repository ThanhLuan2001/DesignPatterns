package com.example.designpattern.BehavioralPatterns._9_strategy_pattern

class ThueB : Thue {
    override fun tinhThue(thuNhap: Int): Double {
        return thuNhap * 0.15
    }
}