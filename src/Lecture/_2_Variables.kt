package Lecture

fun main () {
    // Declare a as an Int. "val" means it is immutable (cannot be changed)
    val a: Int = 3

    // Type inference: "b" is an Int because it is initialised to an Int
    val b = 4

    // "c" is a "var", which means it can be changed
    var c = 5

    // increase "c" by one
    c++

    // this would give a compiler error as "b" is immutable
    // b++

    // this would also give a compiler error as "c" is implicitly an Int
    // c = "A String"

    // Some other data types
    val d = 12345678L // Long, because it ends with L
    val pi = 3.141592654 // Double, the default for floating-point numbers
    val f = 1.23f // Float
    val str = "Hello" // String


    // Print them out. Note how we can embed variables in a string
    // by preceding them with '$'
    println("a is $a, b is $b, c is $c, d is $d, f is $f, pi is $pi, str is $str")
}