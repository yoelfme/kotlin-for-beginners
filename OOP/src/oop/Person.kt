package oop

class Person {
    var name: String = "Sara"
    var age: Int = 42

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth(): Int {
        return 5;
    }
}

fun main(args: Array<String>) {
    val person = Person()

    person.speak()
    person.greet("world")

    println(person.name)
    println(person.age)

    person.name = "Peter"

    println(person.name)
}