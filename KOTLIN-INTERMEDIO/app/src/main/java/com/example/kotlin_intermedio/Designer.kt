package com.example.kotlin_intermedio

class Designer(name: String, age: Int): Person(name, age) {
    override fun work() {
        println("Esta persona esta diseñando")
    }
}