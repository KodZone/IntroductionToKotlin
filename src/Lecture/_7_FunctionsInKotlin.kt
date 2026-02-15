package Lecture

class FunctionsInKotlin {

    fun printString(s: String, nTimes: Int) {
        for (i in 1..nTimes) {
            print(s)
        }
        println()
    }

    fun cube(number: Double): Double {
        return number * number * number
    }
}

fun main() {
    val example = FunctionsInKotlin()

    example.printString("*", 3)
    example.printString("#", 4)
    example.printString("!", 5)

    println("The cube of 3 is: ${example.cube(3.0)}")
}
