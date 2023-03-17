package com.example.kotlin_intermedio

class Programmer(name: String, age: Int, val language: String): Person(name, age) {
    override fun work() {
        println("Esta persona esta programando")
    }

    fun sayLanguage() {
        println("Esta persona esta programando en $language")
    }

    override fun goToWork() {
        // super.goToWork()
        println("Esta persona va a google")
    }
}