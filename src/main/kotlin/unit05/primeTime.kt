package unit05
import kotlin.math.floor
import kotlin.math.sqrt

fun isNumberDivisible(number: Int, divisor: Int): Boolean {

    return number % divisor == 0

}


fun isPrime(number: Int): Boolean {

    if (number <= 1) {
        return false
    }

    for (i in 2..floor(sqrt(number.toDouble())).toInt()) {
        if (isNumberDivisible(number, i)) {
            return false
        }
    }

    return true

}


fun main(){

    println(isPrime(6))
    println(isPrime(13))
    println(isPrime(8893))

}