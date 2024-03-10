package com.example.designpattern.BehavioralPatterns._11_visitor_pattern

// Định nghĩa interface cho Visitor
interface ShapeVisitor {
    fun visit(circle: Circle)
    fun visit(square: Square)
}

// Định nghĩa interface cho các đối tượng có thể được thăm
interface Shape {
    fun accept(visitor: ShapeVisitor)
}

// Cài đặt các lớp hình tròn và hình vuông
class Circle : Shape {
    override fun accept(visitor: ShapeVisitor) {
        visitor.visit(this)
    }
}

class Square : Shape {
    override fun accept(visitor: ShapeVisitor) {
        visitor.visit(this)
    }
}

// Cài đặt Visitor để thực hiện các chức năng cụ thể
class AreaCalculator : ShapeVisitor {
    var totalArea: Double = 0.0

    override fun visit(circle: Circle) {
        // Tính diện tích hình tròn và cập nhật totalArea
        totalArea += 3.14 *  Math.pow(2.0, 2.0)
    }

    override fun visit(square: Square) {
        // Tính diện tích hình vuông và cập nhật totalArea
        totalArea += Math.pow(2.0, 2.0)
    }
}

fun main() {
    val listShape: List<Shape> = listOf(Circle(), Square())
    val areaCalculator = AreaCalculator()

    // Thăm từng hình và tính tổng diện tích
    listShape.forEach {
        it.accept(areaCalculator)
    }
    //output sẽ hiển thị 16.560000000000002 bởi vì kết quả lần đầu tính hình tròn(Circle()) sẽ được 12.56
    //và cộng kết quả đó vào biến tên là totalArea, lần thứ 2 tính hình vuông (Square()) sẽ được 4.0 sẽ cộng tiếp
    //kết quả vào biến totalArea sẽ được giá trị 12.56 + 4.0 = 16.560000000000002
    println("Total area: ${areaCalculator.totalArea}")

}