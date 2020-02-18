package loops

fun main() {
    var sum = 0;
    for (i in 1..10) {
        sum += i;
    }

    println(sum)

    val list = listOf("Java", "Kotlin", "Python")

    for (element in list) {
        println(element)
    }

    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value")
    }

    var x = 9

    while (x >= 0) {
        println(x)
        x--;
    }

    var i = 1;

    // Break keyword
    for (c in "Python") {
        if (c == 'o') {
            break
        }

        println(c)
    }

    while (i <= 10) {
        println(i)
        i++
    }

    // Continue keyword
    for (str in list) {
        if (!str.contains('o')) {
            continue
        }

        println(str)
    }

    // named loops
    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                break@outer
            }


            println("$i - $j")
        }
    }
}