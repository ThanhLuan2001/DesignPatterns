package com.example.designpattern.BehavioralPatterns._10_template_method_pattern

class CaPheNgon : Caphe() {
    override fun dunNuocSoi() {
     println("Đun nước sôi")
    }

    override fun doCaPhe() {
     println("Đổ cà phê vào cốc")
    }

    override fun doNuocVao() {
        println("Đổ nước vào cốc")
    }

    override fun themGiaVi() {
        println("Thêm gia vị")
    }
}