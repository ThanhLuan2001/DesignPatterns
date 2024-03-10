package com.example.designpattern.StructuralPatterns._3_composite_pattern

class Developer(age : Int, name : String, salary : Double) : Employee(age, name, salary){

    override fun add(employee: Employee) {

    }

    override fun remove(employee: Employee) {

    }

    override fun print() {
        System.out.println("==================");
        System.out.println("Name : $name");
        System.out.println("Age: $age");
        System.out.println("Salary: $salary");
        System.out.println("==================");
    }
}