package com.example.designpattern.BehavioralPatterns._2_command_pattern

import java.util.Stack


class DocumentInvoker {
    private val undoCommands = Stack<Command>()
    private val redoCommands = Stack<Command>()
    private val document = Document()

    fun undo() {
        if (!undoCommands.isEmpty()) {
            val cmd = undoCommands.pop()
            cmd.undo()
            redoCommands.push(cmd)
        } else {
            println("Nothing to undo")
        }
    }

    fun redo() {
        if (!redoCommands.isEmpty()) {
            val cmd = redoCommands.pop()
            cmd.redo()
            undoCommands.push(cmd)
        } else {
            println("Nothing to redo")
        }
    }

    fun write(text: String?) {
        val cmd: Command = DocumentEditorCommand(document, text!!)
        undoCommands.push(cmd)
        redoCommands.clear()
    }

    fun read() {
        document.read()
    }
}