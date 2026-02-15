package Lecture

fun main() {

    // Prompt the user to enter their name
    println("Enter your name:")
    val n = readln()   // readln() reads input as a String

    // In Kotlin, 'if' can be used as an expression.
    // This means it returns a value.
    // The result of the condition is stored in the variable 'msg'.
    val msg = if (n == "Linus Torvalds")
        "You invented Linux"
    else
        "You didn't invent Linux"

    // Print the result stored in 'msg'
    println(msg)

    // Prompt the user to enter their grade
    println("Enter your grade:")
    val grade = readln()

    // 'when' can also be used as an expression (like a value-returning switch).
    // The matching branch returns a String which is stored in 'degree'.
    val degree = when (grade) {
        "A" -> "First"        // If grade is "A", return "First"
        "B" -> "2.1"          // If grade is "B", return "2.1"
        "C" -> "2.2"          // If grade is "C", return "2.2"
        "D" -> "Third"        // If grade is "D", return "Third"
        "F" -> "Fail"         // If grade is "F", return "Fail"

        // 'else' acts as the default case
        else -> "Invalid grade $grade."
    }

    // Print the final degree classification
    println("Degree awarded: $degree.")
}
