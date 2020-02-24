package oop

abstract class Person(open val name: String, open var age: Int) {
    init {
        println("Object was created")
    }

    abstract fun speak()

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth(): Int {
        return 5;
    }
}

class Student(override val name: String, override var age: Int, val studentID: Long): Person(name, age) {

    fun isIntelligent() = true

    override fun speak() {
        println("Hi there, I'm a student")
    }
}

class Employee(override val name: String, override var age: Int): Person(name, age) {

    fun receivePayment() {
        println("Received payment")
    }

    override fun speak() {
        println("Hi, I'm employee")
    }
}


fun main(args: Array<String>) {
    val student = Student("Yoel", 24, 1234)

    student.speak()
    println(student.isIntelligent())


    val employee = Employee("Jhon", 26)
    employee.receivePayment()
}