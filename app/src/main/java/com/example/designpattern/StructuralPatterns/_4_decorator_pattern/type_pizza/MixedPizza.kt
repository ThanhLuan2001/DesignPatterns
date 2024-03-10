package com.example.designpattern.StructuralPatterns._4_decorator_pattern.type_pizza

import com.example.designpattern.StructuralPatterns._4_decorator_pattern._abstract.IPizza


class MixedPizza : IPizza {
    override fun doPizza(): String {
        return "I am a Mixed Pizza";
    }
}