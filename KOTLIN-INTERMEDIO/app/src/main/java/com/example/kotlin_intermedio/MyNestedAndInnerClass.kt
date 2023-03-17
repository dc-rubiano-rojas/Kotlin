package com.example.kotlin_intermedio

class MyNestedAndInnerClass {

    private val one = 1

    private fun returnOne(): Int {
        return one
    }

    // Clase anidada - Nested Class
    class MyNestedClass {
        fun sum(n1: Int, n2: Int): Int {
            return n1 + n2
        }
    }

    // Clase Interna - Inner Class
    inner class MyInnerClass() {
        fun sumTwo(n1: Int): Int {
            return n1 + one + returnOne()
        }
    }

}