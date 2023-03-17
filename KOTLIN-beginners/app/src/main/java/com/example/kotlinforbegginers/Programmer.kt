package com.example.kotlinforbegginers

class Programmer (val name: String,
                  var age: Int,
                  val lenguages: Array<Languages>, val friends: Array<Programmer>? = null) {

    enum class Languages {
        KOTLIN,
        JS,
        TS
    }

    fun code() {
        for (lengu in lenguages) {
            println("Yo $name programo en $lengu")
        }
    }
}