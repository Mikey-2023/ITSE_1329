package unit04

fun main(){
    print("Enter a string: ")
    val userInput = readln()

    print("Enter a single character: ")
    val userChar = readln()[0]

    var sum = 0
    for (x in userInput){
        if (x == userChar){
            sum += 1
        }
    }

    print("The character you chose appeared $sum times in the string you entered.")
}