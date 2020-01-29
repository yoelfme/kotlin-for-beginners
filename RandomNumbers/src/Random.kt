import kotlin.random.Random

fun main() {
    val random = Random.nextInt(50) + 1

    when (random) {
        in 1..10 -> println("value $random is between 1 and 10")
        in 11..20 -> println("value $random is between 11 and 20")
        in 21..30 -> println("value $random is between 21 and 30")
        in 31..40 -> println("value $random is between 31 and 40")
        else -> println("value $random is greater than 40")
    }
}