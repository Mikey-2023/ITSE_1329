package unit05

import kotlin.math.pow

fun fallingDistance(seconds: Double): Double {

    return (0.5)*(9.8)*(seconds.pow(2))

}


fun main(){

    for (s in 1..10) {

        println(fallingDistance(s.toDouble()))

    }

}
