fun main(){
    val calsPerCookie = 300.0 / 4

    print("Enter number of cookies eaten: ")
    var numAte = readln()!!.toInt()
    var caloriesTotal = numAte * calsPerCookie

    print("Your calorie intake was: $caloriesTotal calories.")
}