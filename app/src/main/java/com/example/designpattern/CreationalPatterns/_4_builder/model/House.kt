package com.example.designpattern.CreationalPatterns._4_builder.model

class House(
    var walls : Int,
    var doors : Int,
    var hasPool : Boolean,
    var hasRoof : Boolean,
    var color : String
){

    override fun toString(): String {
        return "House{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", hasPool=" + hasPool +
                ", hasRoof=" + hasRoof +
                ", color='" + color + '\'' +
                '}'
    }


}

