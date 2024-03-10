package com.example.designpattern.CreationalPatterns._5_prototype

fun main(){
    //https://www.youtube.com/watch?v=79tEyAPDuPw&list=PLRoAKls-7kksSBqximU9CjBgCApQVDgmX&index=6
    val user1 = User("Nguyen","luan@gmal.com",22)
    println("User1 = $user1")
    val user2 = user1.clone()
    println("User2 = $user2")
    println("===========================")
    user1.age = 23
    println("User2 = $user2")
}