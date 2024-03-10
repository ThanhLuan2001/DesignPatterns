package com.example.designpattern.BehavioralPatterns._2_command_pattern

import java.util.Stack


class Document {
    private val lines = Stack<String>()

    fun write(line: String) {
        lines.push(line)
    }

    fun read() {
        for (line in lines) {
            println(line)
        }
    }

    fun eraseLast() {
        if (!lines.isEmpty()) {
            lines.pop()
        }
    }
}