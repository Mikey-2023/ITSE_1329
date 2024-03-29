package unit05

fun profit(NS: Double, PP: Double, PC: Double, SP: Double, SC: Double): Double {

    return ((NS*SP)-SC)-((NS*PP)+PC)

}

//                  --------------------------------------------------------------

fun main() {

    val profitVar = profit(5.3, 7000.50, 1000.50, 10000.80, 700.00)
    if (profitVar > 0) {
        print("A profit of $" + "%.2f".format(profitVar) + " was made.")
    } else if (profitVar < 0) {
        print("A loss of $" + "%.2f".format(profitVar) + " was made.")
    } else {
        print("You broke even.")
    }

}