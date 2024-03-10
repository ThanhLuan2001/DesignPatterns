package com.example.designpattern.BehavioralPatterns._6_memento_pattern


class Originator(var state : String) {

    //tạo trạng thái để lưu trữ, sau này có thể khôi phục
    fun createState() : String{
        return state
    }

    //thay đổi trạng thái
    fun replaceState(newState: String){
        state = newState
    }

    //Khôi phục trạng thái
    fun restoreState(restoreState: String){
        state = restoreState
    }


}