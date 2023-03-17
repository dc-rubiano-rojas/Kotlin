package com.example.kotlin_intermedio

open  class Person(name: String, age: Int): Work(), Game {
    // Cualquier clase hereda de una superclase común any
    open fun work() {
        println("Esta persona esta trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }

    // Lesson 4: Interfaces
    override val game: String
        get() = "Among Us"

    override fun play() {
        println("Esta persona esta jugando $game")
    }
}