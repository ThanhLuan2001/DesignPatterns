package com.example.designpattern.BehavioralPatterns._10_template_method_pattern

abstract class Caphe {

    fun phaCaPhe(){
        dunNuocSoi()
        doCaPhe()
        doNuocVao()
        themGiaVi()
    }

    abstract fun dunNuocSoi()

    abstract fun doCaPhe()

    abstract fun doNuocVao()

    abstract fun themGiaVi()
}