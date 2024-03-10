package com.example.designpattern.BehavioralPatterns._2_command_pattern


class DocumentEditorCommand(document: Document, text: String) : Command {
    private val document: Document
    private val text: String

    init {
        this.document = document
        this.text = text
        document.write(text)
    }

    override fun undo() {
        document.eraseLast()
    }

    override fun redo() {
        document.write(text)
    }
}