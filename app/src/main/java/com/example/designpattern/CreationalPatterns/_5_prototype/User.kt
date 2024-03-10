package com.example.designpattern.CreationalPatterns._5_prototype


class User(var userName: String, var email: String, var age: Int) : Cloneable {

    override public fun clone(): User {
        try {
            return super.clone() as User
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }
        return User("","",0)
    }

    override fun toString(): String {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}'
    }
}