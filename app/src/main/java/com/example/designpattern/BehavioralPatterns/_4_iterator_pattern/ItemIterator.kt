package com.example.designpattern.BehavioralPatterns._4_iterator_pattern


interface ItemIterator<T> {
    operator fun hasNext(): Boolean
    operator fun next(): T
}