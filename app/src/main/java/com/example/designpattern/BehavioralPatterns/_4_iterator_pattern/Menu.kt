package com.example.designpattern.BehavioralPatterns._4_iterator_pattern


class Menu {
    private val menu: MutableList<Item> = ArrayList()

    fun add(item: Item) {
        menu.add(item)
    }

    operator fun iterator(): ItemIterator<Item> {
        return MenuIterator()
    }

    inner class MenuIterator : ItemIterator<Item> {
        private var currentPosition = 0

        override fun hasNext(): Boolean {
            return currentPosition < menu.size
        }

        override fun next(): Item {
            return menu[currentPosition++]
        }
    }
}