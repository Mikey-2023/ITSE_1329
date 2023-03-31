package unit05

fun celsius(F: Double): Double {

    return (5.0/9.0) * (F-32.0)

}

fun main(){

    for (t in 0..20) {

        println("Fahrenheit: $t, Celsius: ${celsius(t.toDouble())}")

    }

}