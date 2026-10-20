package Seminar

fun main() {
    // Store your favourite artists (lowercase for easy matching)
    val artists = arrayOf("adele", "coldplay", "beyonce", "taylor swift")

    println("Guess one of my favourite artists.")
    println("(Type a name; I'll keep asking until you guess one.)")

    while (true) {
        print("Your guess: ")
        val guess = readln().trim().lowercase()

        if (guess in artists) {
            println("Correct! $guess is on the list.")
            break
        } else {
            println("Wrong?? Not on my list. Try again!")
        }
    }
}
