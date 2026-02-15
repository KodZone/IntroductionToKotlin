package Lecture

fun main() {

    val numbers = listOf(1, 2, 3)

    // 1️ Non-nullable variable
    // We are sure 2 exists in the list
    val n1: Int = numbers.find { it == 2 }!!
    println("n1 number: $n1")

    // 2️ Nullable variable
    // 5 does NOT exist, so find() returns null
    val n2: Int? = numbers.find { it == 5 }
    println("n2 number: $n2")   // Prints: null

    // 3️ Safe-access operator
    // Safely try to convert to string length (just for demo)
    println("Length of n2 string: ${n2?.toString()?.length}")
}
