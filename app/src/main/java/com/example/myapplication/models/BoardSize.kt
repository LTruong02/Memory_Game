package com.example.myapplication.models

enum class BoardSize(val numCards: Int) {
    EASY(8),
    MEDIUM(18),
    HARD(24);

    fun getWidth(): Int {
        return when (this) {
            EASY -> 2
            MEDIUM -> 3
            HARD -> 4
        }
    }

    companion object {
        // one line function that sets the enum on the amount of cards created by a custom game
        fun getByValue(value: Int) = values().first {it.numCards == value}
    }

    fun getHeight(): Int {
        return numCards / getWidth()
    }

    fun getNumPairs(): Int {
        return numCards / 2
    }
}