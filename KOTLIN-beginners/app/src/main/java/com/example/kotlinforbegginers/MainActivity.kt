package com.example.kotlinforbegginers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lesson 1
        // variablesAndConstant()

        // Lesson 2
        //dataTypes()

        // Lesson 3
        // ifStatement()

        // Lesson 4
        // whenStatement()

        // Lesson 5
        // arrayCollection()

        // Lesson 6
        // mapsOrDiccionary()

        // Lesson 7
        // loops()

        // Lesson 8
        // nullSafety()

        // Lesson 9
        // funciones()

        // Lesson 10
        classes()
    }

    private fun variablesAndConstant() {

        // Variables
        var myFirstVariable = "Hello hackermen!"

        println(myFirstVariable)

        myFirstVariable = "Welcome"

        println(myFirstVariable)

        // Constants
        val myFirstConstant = "My first constant"

        println(myFirstConstant)
    }

    private fun dataTypes() {

        // String
        val myString: String = "Hey hackermen"
        val myStringTwo = "Welcome"
        //val myStringThree = myString + " " + myStringTwo
        val myStringThree = "$myString $myStringTwo"
        println(myStringThree)

        // Integers (Byte, Short, Int, Long)
        val myInt: Int = 1
        val myLong: Long = 1L
        val myInt2 = 2
        val result = myInt + myInt2
        println(result)

        // Decimals (Float, Double)
        val myDouble: Double = 1.5
        val myFloat: Float = 1.5f
        val myDouble2: Double = 3.2
        val resultDouble = myDouble + myDouble2
        println(resultDouble)

        // Boolean (Bool)
        val myBool = false
        val myBool2: Boolean = true
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    private fun ifStatement() {
        val myNumber = 7
        if (myNumber <= 10 && myNumber > 5) {
            println("$myNumber is less or equal than 10")
        } else {
            println("$myNumber is bigger than 10")
        }
    }

    private fun whenStatement() {
        // El when es como un switch

        // When with string
        val country = "Italia"

        when(country) {
            "Colombia", "Peru",  "Mexico", "Chile", "Argentina" -> {
                println("El idioma es castellano")
            }  else -> {
                println("no es castellano")
            }
        }

        // When with Int
        val age = 10

        when (age) {
            in 0..2 -> println("You are a baby")
            in 3..10 -> println("You are a kid")
            in 11..19 -> println("You are a teenager")
            else -> println("You are an adult")
        }
    }

    private fun arrayCollection() {
        val name = "Joe"
        val lastName = "Taylor"
        val company = "Google"
        val age = "32"

        // Creation of an array
        val myArray = arrayListOf<String>()
        myArray.add(name)
        myArray.add(lastName)
        myArray.add(company)
        myArray.add(age)
        println(myArray)

        // Add un conjunto de datos
        myArray.addAll(listOf("bogota", "happy"))
        println(myArray)

        // Access data
        val myCompany = myArray[2]
        println(myCompany)

        // Change data
        myArray[5] = "Changing"
        println(myArray)

        // Delete data
        myArray.removeAt(2)
        println(myArray)

        // Recorrer los datos
        myArray.forEach {
            println(it)
        }

        // Otras operaciones
        println(myArray.count())
        // myArray.clear()
        // println(myArray.count())

        myArray.sort()
        println(myArray)
    }

    private fun mapsOrDiccionary() {
        // Se guarda un key: value (no necesariamente del mismo tipo de dato)
        // todas las keys deben ser de un mismo tipo de dato
        // todas los values deben ser de un mismo tipo de dato
        // no puede haber keys repetidas pero si values

        // Syntax
        var myMap: Map<String, Int> =  mapOf();

        // Add element - no existe orden nada asegura que como agregamos a bryce en
        // primer lugar va salir de primero
        // el mapOf no es mutable
        //myMap = mapOf("bryce" to 1, "Peter" to 2, "Daniel" to 3)
        myMap = mutableMapOf("bryce" to 1, "Peter" to 2, "Daniel" to 3)
        println(myMap)

        // Add one by one
        myMap["Ana"] = 7

        // Update data
        myMap.put("Maria", 9)
        myMap["bryce"] = 6
        println(myMap.size)

        // Access data
        println(myMap["Peter"])

        // Delete data
        myMap.remove("Maria")
        println(myMap)
    }

    private fun loops() {
        val myArray: List<String> = listOf("hola", "buenos dias", "hello")
        val myMap: MutableMap<String, Int> = mutableMapOf("bryce" to 1, "Peter" to 2, "Daniel" to 3)

        // For
        for (myString: String in myArray) {
            println(myString)
        }

        for (myElement: MutableMap.MutableEntry<String, Int> in myMap) {
            println("${myElement.key} : ${myElement.value}")
        }

        for (x in 0..5) {
            // println(x)
        }

        // Con el until no llega a 10
        for (x in 0 until 10 ) {
            // println(x)
        }

        for (x in 0..10 step 2) {
            // println(x)
        }

        for (x in 5 downTo 0) {
            // println(x)
        }
        for (x in 15 downTo 0 step 3) {
            // println(x)
        }

        val myNumericArray = (0..20)
        for(myNum in myNumericArray) {
            // println(myNum)
        }

        // While
        var x = 0
        while (x < 10){
            println(x)
            // x++
            x+=2
        }
    }

    private fun nullSafety() {
        var name = "Camilo"
        // println(name)

        // Variable null safety
        var mySafetyNull: String? = "Null safety"
        mySafetyNull = null
        //println(mySafetyNull)
        mySafetyNull = "Daniel"

        //if(mySafetyNull != null) {
        //    println(mySafetyNull!!)
        //}

        // SAFE CALL
        // println(mySafetyNull!!.length)
        // println(mySafetyNull?.length)
        // .let{} funciona como un if para los null
        // hace lo que tiene adentro de los corchetes cuando la funcion no es null
        // it: es el valor de la variable forzando que no sea null
        // ?: run {}: se ejecuta cuando la variable es null
        mySafetyNull?.let {
            println(it)
        } ?: run {
            println(mySafetyNull)
        }

    }

    fun funciones() {
        sayHello("Daniel")

        println(sumTwoNumbers(4,8))
    }

    fun sayHello(name: String) {
        println("Hello $name")
    }

    fun sumTwoNumbers(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    private fun classes() {
        val programmer1 = Programmer("Daniel", 20, arrayOf(Programmer.Languages.KOTLIN, Programmer.Languages.JS))
        println(programmer1.name)
        programmer1.age = 30
        println(programmer1.age)

        programmer1.code()
    }
}