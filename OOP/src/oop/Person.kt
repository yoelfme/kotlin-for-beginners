package oop

open class Person(open val name: String, open var age: Int) {
    init {
        println("Object was created")
    }

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

class Student(override val name: String, override var age: Int, val studentID: Long): Person(name, age) {

    fun isIntelligent() = true
}

class Employee(override val name: String, override var age: Int): Person(name, age) {

    fun receivePayment() {
        println("Received payment")
    }
}


fun main(args: Array<String>) {
    val person = Person("Jack", 27)
 
    person.speak()
    person.greet("world")

    println(person.name)
    println(person.age)

    println(person.name)

    val student = Student("Yoel", 24, 1234)

    student.speak()
    println(student.isIntelligent())


    val employee = Employee("Jhon", 26)
    employee.receivePayment()
}