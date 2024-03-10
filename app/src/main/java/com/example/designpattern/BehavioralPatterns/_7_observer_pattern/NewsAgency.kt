package com.example.designpattern.BehavioralPatterns._7_observer_pattern

import java.util.Observable

// Subject
class NewsAgency : Observable() {
    private var news: String = ""

    fun setNews(news: String) {
        this.news = news
        setChanged()
        notifyObservers(news)
    }

    fun getNews(): String {
        return news
    }
}