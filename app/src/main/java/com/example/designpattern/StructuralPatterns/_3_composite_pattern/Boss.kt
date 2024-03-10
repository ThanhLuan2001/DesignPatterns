package com.example.designpattern.StructuralPatterns._3_composite_pattern

class Boss(age : Int, name : String, salary : Double) : Employee(age, name, salary) {

    private val listEmployee : ArrayList<Employee> = ArrayList()

    override fun add(employee: Employee) {
        listEmployee.add(employee)
    }

    override fun remove(employee: Employee) {
        listEmployee.remove(employee)
    }

    override fun print() {
        println("-------------------------------")
        println("Name : $age")
        println("Age : $name")
        println("Salary : $salary")

        for (employee in listEmployee){
            employee.print()
        }
    }
}