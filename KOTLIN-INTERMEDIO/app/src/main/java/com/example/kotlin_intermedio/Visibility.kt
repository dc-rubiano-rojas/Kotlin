package com.example.kotlin_intermedio

class Visibility {

    var name: String? = null

    fun sayMyName() {
        name?.let {
            println("My name is $it :)")
        } ?: run {
            println("I dont have name :(")
        }
    }
}