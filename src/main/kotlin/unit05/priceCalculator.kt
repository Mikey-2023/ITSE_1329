package unit05

// The function calculateRetail returns the monetary value of an item by receiving its wholesale and markup values
fun calculateRetail(wholesale: Double, markup: Double): Double {

    return wholesale + wholesale*(markup/100)

}

fun main(){

    var wholesale_var: Double? = null
    while (wholesale_var == null) {

        print("Enter the item's wholesale cost: ")
        try {
            wholesale_var = readln().toDouble()
            if (wholesale_var < 0) {
                println("Invalid input. Please enter a nonnegative number.")
                wholesale_var = null
            }
        }
        catch (e: Exception) {
            println("Invalid input. Please enter a number.")
        }

    }


    var markup_var: Double? = null
    while (markup_var == null) {

        print("Enter the item's markup as a percentage: ")
        try {
            markup_var = readln().toDouble()
            if (markup_var < 0) {
                println("Invalid input. Please enter a nonnegative number.")
                markup_var = null
            }
        }
        catch (e: Exception) {
            println("Invalid input. Please enter a number.")
        }

    }

    println("The item's retail price is $"+"%.2f".format(calculateRetail(wholesale_var, markup_var)))

}
