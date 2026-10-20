package Seminar

fun main() {
    // Step 1: ask for the user's name
    print("Enter your name: ")
    val name = readln().trim()

    // Step 2: print the name 10 times
    for (i in 1 .. 10) {
        println("$i) Hello, $name!")
    }
}
