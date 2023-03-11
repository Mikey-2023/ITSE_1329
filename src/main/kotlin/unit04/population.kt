package unit04

fun main(){
    var initialOrganisms: Int? = null
    while (initialOrganisms == null){
        print("Enter the initial organism population: ")
        val readLn = readln()
        try{
            initialOrganisms = readLn.toInt()
            if (initialOrganisms < 2){
                println("Please start with a population of 2 or more.")
                initialOrganisms = null
            }
        } catch (e: Exception){
            println("Please enter an integer greater or equal to 2.")
        }
    }

    var avgIncrease: Double? = null
    while (avgIncrease == null){
        print("Enter the average daily population increase: ")
        val readLn2 = readln()
        try{
            avgIncrease = readLn2.toDouble()
            if (avgIncrease < 0){
                println("This should be a non-negative value.")
                avgIncrease = null
            }
        } catch(e: Exception){
            println("Please enter a non-negative number.")
        }
    }

    var daysIncrease: Int? = null
    while (daysIncrease == null){
        print("Enter the number of days: ")
        val readLn3 = readln()
        try{
            daysIncrease = readLn3.toInt()
            if (daysIncrease < 1){
                println("This should be an integer of 1 or greater.")
                daysIncrease = null
            }
        } catch(e: Exception){
            println("Please enter a non-negative number.")
        }
    }

    var totalOrganisms: Double = initialOrganisms.toDouble()
    for (d in 1..daysIncrease){
        if (d == 1){
            println("On day 1, there are " + totalOrganisms.toInt() + " organisms." )
        }
        else {
            totalOrganisms += totalOrganisms * avgIncrease
            println("On day $d there are " + totalOrganisms.toInt() + " organisms.")
        }
    }
}