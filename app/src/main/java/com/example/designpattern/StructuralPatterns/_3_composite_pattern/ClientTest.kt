package com.example.designpattern.StructuralPatterns._3_composite_pattern

fun main(){
    val boss = Boss(60,"Tom",8000.0)
    val marketing = Marketing(25,"Mie",2500.0)

    val leader = Leader(35,"Peter",5000.0)
    val developer1 = Developer(28,"Dev1",3000.0)
    val developer2 = Developer(26,"Dev2",2500.0)
    val developer3 = Developer(25,"Dev3",2000.0)

    with(leader){
        add(developer1)
        add(developer2)
        add(developer3)
    }

    with(boss){
        add(marketing)
        add(leader)
        print()
    }

}