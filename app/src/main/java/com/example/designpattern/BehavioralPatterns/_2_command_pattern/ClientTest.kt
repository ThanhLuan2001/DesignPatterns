package com.example.designpattern.BehavioralPatterns._2_command_pattern


fun main() {
    val invoker = DocumentInvoker()

    invoker.write("Hello")
    invoker.write("World")
    invoker.undo()
    invoker.read()
    invoker.redo()
    invoker.read()

    invoker.undo()
    invoker.undo()
    invoker.undo()
    invoker.undo()
}