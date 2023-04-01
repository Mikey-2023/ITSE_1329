package unit05
// Hi, mom!!
// The function calculateRetail returns the monetary value of an item by receiving its wholesale and markup values
fun calculateRetail(wholesale: Double, markup: Double): Double {

    return wholesale + wholesale*(markup/100)

}


fun main(){

    var wholesaleVar: Double? = null
    while (wholesaleVar == null) {

        print("Enter the item's wholesale cost: ")
        try {
            wholesaleVar = readln().toDouble()
            if (wholesaleVar < 0) {
                println("Invalid input. Please enter a nonnegative number.")
                wholesaleVar = null
            }
        }
        catch (e: Exception) {
            println("Invalid input. Please enter a number.")
        }

    }


    var markupVar: Double? = null
    while (markupVar == null) {

        print("Enter the item's markup as a percentage: ")
        try {
            markupVar = readln().toDouble()
            if (markupVar < 0) {
                println("Invalid input. Please enter a nonnegative number.")
                markupVar = null
            }
        }
        catch (e: Exception) {
            println("Invalid input. Please enter a number.")
        }

    }

    println("The item's retail price is $"+"%.2f".format(calculateRetail(wholesaleVar, markupVar)))

}
