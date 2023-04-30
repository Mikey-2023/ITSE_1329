package unit07

import kotlin.math.roundToInt

fun valueAssessment(propertyValue: Int): Double{
    return propertyValue*0.6
}

fun propertyTax(valueAssessed: Double): Double{
    return valueAssessed*0.0064
}

fun propertyValueValidation(): Int {
    var propertyValue: Int? = null
    while(propertyValue==null){
        print("Enter your property's current value, rounded to the nearest integer: ")
        try{
            propertyValue = readln().toInt()
        } catch (e: Exception){
            println("Enter an integer")
            propertyValue = null
        }
    }
    return propertyValue

}

fun main(){
    val propertyValue = propertyValueValidation()
    val assessmentValue = valueAssessment(propertyValue)
    val propertyTax = (propertyTax(assessmentValue)*100.0).roundToInt()/100.0
    print("Your property's assessed value is $$assessmentValue and the corresponding property tax is $$propertyTax")
}