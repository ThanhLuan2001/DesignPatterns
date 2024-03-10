package com.example.designpattern.BehavioralPatterns._8_state_pattern

fun main(){
    val context = Context()
    context.request() //output : đang ở A chuyển sang B
    context.request() //output : đang ở B chuyển sang A
}