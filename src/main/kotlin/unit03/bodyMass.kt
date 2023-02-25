import kotlin.math.*
fun main(){
    print("Enter your weight in pounds: ")
    var weight = readln().toDouble()

    print("Enter your height in inches: ")
    var height = readln().toDouble()

    var BMI = (weight*703)/(Math.pow(height.toDouble(), 2.toDouble()))

    when {
        (BMI > 25.0) -> print("You are overweight")
        (BMI in 18.5..25.0) -> print("You are in the optimal weight range for your height")
        (BMI < 18.5) -> print("You are underweight")
    }
}