package unit04
fun main(){
    var userNum: Int? = null

    while (userNum == null){
        print("Enter a positive integer: ")
        val readLineVar = readln()
        try{
            userNum = readLineVar.toInt()
            if (userNum <= 0){
                println("Please enter a positive integer.")
                userNum = null
            }
        } catch (e: Exception){
            println("Please enter a positive integer.")
        }
    }

    var sum = 0
    for (num in 1..userNum){
        sum += num
    }

    print("The sum of all positive integers up to the one you entered is $sum")
}