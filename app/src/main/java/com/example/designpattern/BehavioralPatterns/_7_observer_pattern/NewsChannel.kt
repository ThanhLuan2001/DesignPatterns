package com.example.designpattern.BehavioralPatterns._7_observer_pattern

import java.util.Observable
import java.util.Observer

// Observer
@Suppress("DEPRECATION")
class NewsChannel(private val name: String) : Observer {
    private var news: String = ""

    @Deprecated("Deprecated in Java")
    override fun update(observable: Observable?, arg: Any?) {
        if (observable is NewsAgency) {
            this.news = arg as String
            display()
        }
    }

    fun display() {
        println("$name received news: $news")
    }
}
