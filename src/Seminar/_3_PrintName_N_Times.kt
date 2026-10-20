package Seminar

fun main() {
    // Step 1: ask for the user's name
    print("Enter your name: ")
    val name = readln().trim()

    // Step 2: ask how many times to print the name
    print("How many times should I print your name?")
    val times= readln().trim().toInt()
    // Loop: print the name 'times' times
    for (i in 1..times) {
        println("$i) Hello, $name!")
    }
}

