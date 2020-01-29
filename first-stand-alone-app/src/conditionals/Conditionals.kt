package conditionals

fun main(args: Array<String>) {
    val age: Int = 17
    val mode: Int = 3

    if (age < 18) {
        println("You cannot register")
    } else {
        println("You're good to go!")
    }

    val x = if (mode < 2) {
        println("Mode is less than 2")
        17
    } else {
        42
    }
}