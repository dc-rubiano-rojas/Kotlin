package com.example.kotlin_intermedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

typealias MyMapList = MutableMap<Int, ArrayList<String>>
typealias MyFun = (Int, String, MyMapList) -> Boolean
typealias MyNesttedClass = MyNestedAndInnerClass.MyNestedClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lesson 1: Enum Classes
        // enumClasses()

        // Lesson 2: Nested and Inner Classes
        // nestedAndInnerClasses()

        // Lesson 3: Inheritance (Herencia)
        // classInheritance()

        // Lesson 4: Interfaces
        // Interfaces()

        // Lesson 5: Visibility Modifiers
        // VisibilityModifiers()

        // Lesson 6: Data Classes
        // DataClasses()

        // Lesson 7: Alias
        // typeAlias()

        // Lesson 8: Destructuring declaration
        // destructuringDeclaration()

        // Lesson 9: Extentions
        // extension()

        // Lesson 10: Lambdas
        lambdas()
    }

    enum class Direction(val dir: Int) {
        NORTH(1), SOUTH(-1), EAST(1), WEST(-1);

        fun description(): String {
            return when (this) {
                NORTH -> "Norte"
                SOUTH -> "Sur"
                EAST -> "Este"
                WEST -> "Oeste"
            }
        }
    }

    // Lesson 1: Enum Classes
    private fun enumClasses() {
        val userDirection: Direction = Direction.NORTH
        //userDirection?.let {
        //   println("Direction: $it")
        //}
        println(userDirection.description())
        println(userDirection.dir)
    }

    // Lesson 2: Nested and Inner Classes
    private fun nestedAndInnerClasses() {

        // Nested Class (anidada)
        val myNestedClass = MyNesttedClass()
        val sum = myNestedClass.sum(10, 5)
        println("El resultado de la suma es: $sum")

        // Inner Class
        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sumTwo = myInnerClass.sumTwo(2)
        println("El resultado con inner class es: $sumTwo")
    }

    // Lesson 3: Inheritance (Herencia)
    private fun classInheritance() {
        val programmer = Programmer("Daniel", 23, "KOTLIN")
        programmer.work()
        programmer.sayLanguage()
        val designer = Designer("Camilo", 33)
        designer.work()
    }

    // Lesson 4: Interfaces
    private fun Interfaces() {
        val gamer = Person("Camilo", 30)
        gamer.play()
        gamer.stream()
    }

    // Lesson 5: Visibility Modifiers
    private fun VisibilityModifiers() {
        val visibility = Visibility()
        visibility.sayMyName()
        visibility.name = "Daniel"
        visibility.sayMyName()
    }

    // Lesson 6: Data Classes
    private fun DataClasses() {
        val camilo = Worker("Camilo", 30, "Developer")
        camilo.lastWork = "Walmart"

        val daniel = Worker("Daniel", 24, "dish washer")
        camilo.lastWork = "nada"

        // equals & hashCode
        // if(camilo == daniel) {
        if(camilo == daniel) {
            println("Son iguales")
        } else {
            println("No son iguales")
        }

        // toString()
        println(camilo.toString())

        // copy()
        val camilo2 = camilo.copy(age=27)
        println(camilo2.toString())

        // componentN
        val (name, age) = camilo
        println(name)
        println(age)

    }

    // Lesson 7: Alias
    private var myMap: MyMapList = mutableMapOf()
    private fun typeAlias() {
        val myNewMap: MyMapList = mutableMapOf()
        myNewMap[1] = arrayListOf("sada", "asdad")
        myMap = myNewMap
    }

    // Lesson 8: Destructuring declaration
    private fun destructuringDeclaration() {
        val (name, _, work) = Worker("Camilo", 30, "Developer")
        println(name)
        println(work)
    }

    // Lesson 9: extension
    private fun extension() {
        val myDate = Date()
        println(myDate.customFormat())
        println(myDate.formatSize)
    }

    // Lesson 10: Lambdas
    private fun lambdas() {
        val myIntList = arrayListOf(1,2,3,4,5,6,7,8,9,10)
        //val myFilterIntList = myIntList.filter {
        //    it > 5
        //}
        val myFilterIntList = myIntList.filter { myInt ->
            if(myInt == 1) {
                return@filter true
            }
            myInt > 5
        }
        println(myFilterIntList)

        //val myFunct = fun (x: Int, y: Int): Int {
        //    return x + y
        //}
        val mySumFunct = fun (x: Int, y: Int): Int = x + y
        val myMultFunct = fun (x: Int, y: Int): Int = x * y

        println(myOperationFun(5, 6, mySumFunct))
        println(myOperationFun(5, 6, myMultFunct))

        //myOperationFun(5, 6) { x, y ->
        //    x - y
        //}
        println(myOperationFun(5, 6) { x, y -> x - y })


        myAsyncFun("Daniel") {
            println(it)
        }
    }
    private fun myOperationFun(x: Int, y: Int, myFun: (Int, Int) -> Int): Int {
        return myFun(x, y)
    }

    private fun myAsyncFun(name: String, hello: (String) -> Unit) {
        val myNewString = "Hello $name"

        thread {
            Thread.sleep(5000)
            hello(myNewString)
        }
    }
}