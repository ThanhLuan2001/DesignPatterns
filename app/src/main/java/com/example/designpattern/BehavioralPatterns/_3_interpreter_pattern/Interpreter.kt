package com.example.designpattern.BehavioralPatterns._3_interpreter_pattern

// AbstractExpression :  Định nghĩa một interface cho việc đánh giá một biểu thức.
interface Expression {
    fun interpret(context: Map<String, Int>): Int
}

// TerminalExpression : Triển khai AbstractExpression và định nghĩa một biểu thức cơ bản.
class VariableExpression(private val variable: String) : Expression {
    override fun interpret(context: Map<String, Int>): Int {
        return context[variable] ?: 0
    }
}

// NonterminalExpression : Triển khai AbstractExpression và định nghĩa một biểu thức phức tạp, thường gồm nhiều các biểu thức khác.
class AdditionExpression(private val left: Expression, private val right: Expression) : Expression {
    override fun interpret(context: Map<String, Int>): Int {
        return left.interpret(context) + right.interpret(context)
    }
}

class SubtractionExpression(private val left: Expression, private val right: Expression) : Expression {
    override fun interpret(context: Map<String, Int>): Int {
        return left.interpret(context) - right.interpret(context)
    }
}

// Context :Chứa thông tin cần thiết để thực hiện việc diễn dịch.
val context = mapOf("a" to 5, "b" to 3, "c" to 2)

fun main() {
    // Client code
    val expression = SubtractionExpression(AdditionExpression(VariableExpression("a"), VariableExpression("b")), VariableExpression("c"))
    val result = expression.interpret(context)

    println("Result: $result") // Output: Result: 6
}