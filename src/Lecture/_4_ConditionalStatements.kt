package Lecture

fun main() {

    // Ask the user to enter their name
    println("Enter your name:")
    val n = readln()   // readln() reads input as a String

    // Simple if-else condition
    if (n == "Linus Torvalds") {
        println("You invented Linux")
    } else {
        println("You didn't invent Linux")
    }

    // Ask the user to enter their grade
    println("Enter your grade:")
    val grade = readln()   // Grade is read as String

    // 'when' expression in Kotlin (similar to switch in Java)
    when (grade) {
        // Each branch checks a specific value
        "A" -> println("First")
        "B" -> println("2.1")
        "C" -> println("2.2")
        "D" -> println("Third")

        // Multiple statements require curly braces
        "F" -> {
            println("Fail")
            println("Please resit in the summer.")
        }

        // Default case (handles unexpected input)
        else -> println("Invalid grade $grade.")
    }
}
