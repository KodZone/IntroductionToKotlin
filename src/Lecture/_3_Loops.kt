package Lecture

fun main () {
    // Count from 1 to 10
    println("*** for .. ***")
    for (i in 1..10) {
        println(i)
    }

    // Count from 1 to 9 ("until" discounts 10 itself)
    println("*** for until ***")
    for(j in 1 until 10) {
        println(j)
    }

    // count from 1 to 9 in steps of 2
    println("*** for .. steps of 2 ***")
    for(k in 1..9 step 2) {
        println(k)
    }

    // While loop
    println("*** While (Loop with condition) ***")
    var m = 1;
    while(m <= 10) {
        println(m)
        m++
    }
}