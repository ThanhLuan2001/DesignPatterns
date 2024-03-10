@file:Suppress("DEPRECATION")
package com.example.designpattern.BehavioralPatterns._7_observer_pattern

fun main(){
    val newsAgency = NewsAgency()

    val channel1 = NewsChannel("Channel 1")
    val channel2 = NewsChannel("Channel 2")

    // Add observers to the subject
    newsAgency.addObserver(channel1)
    newsAgency.addObserver(channel2)

    // Set news in the subject, observers will be notified
    newsAgency.setNews("Breaking News: Kotlin is awesome!")

    println("--------------------------------------------")
    println(newsAgency.getNews())

}