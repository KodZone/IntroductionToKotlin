package Seminar

fun main() {
    print("Enter percentage (0–100): ")
    val p = readln().trim().toInt()

    val grade = when (p) {
        in 70..100 -> "A"
        in 60..69  -> "B"
        in 50..59  -> "C"
        in 40..49  -> "D"
        in 30..39  -> "E"
        in 0..29   -> "F"
        else -> "Error - invalid percentage"
    }

    println(grade)
}
