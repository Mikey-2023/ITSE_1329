package unit05

fun fibonacci(number: Int): Int{

    return if (number >= 3) {
        fibonacci(number-2) + fibonacci(number-1)
    } else if (number > 0) {
        1
    } else {
        0
    }

}


fun main(){

    println(fibonacci(1))
    println(fibonacci(2))
    println(fibonacci(3))
    println(fibonacci(4))
    println(fibonacci(5))
    println(fibonacci(6))
    println(fibonacci(7))
    println(fibonacci(10))

}