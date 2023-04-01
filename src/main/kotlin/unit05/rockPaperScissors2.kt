package unit05

fun printGameRules2() {

    println("Rock is 1")
    println("Paper is 2")
    println("Scissors is 3")

}

fun wantsToPlay2(): Boolean {

    print("Do you want to play? Type 'y' or 'n': ")
    return readln() == "y"

}
fun getAnswers(): Pair<String, String> {

    print("Choose Rock, Paper or Scissors: ")
    val playerChoice = readln()

    val computerChoice = (1..3).random().toString()
    val numsForRPS = mapOf("1" to "Rock", "2" to "Paper", "3" to "Scissors")
    println("The computer chose ${numsForRPS[computerChoice]}")

    return Pair(playerChoice, computerChoice)  // First is player's answers , second is computer's

}



fun main(){

    printGameRules2()
    val mapResults = mapOf(
                            Pair("1","1") to "Tie!", Pair("2","2") to "Tie!", Pair("3","3") to "Tie!",
                            Pair("1","3") to "You win", Pair("2","1") to "You win", Pair("3", "2") to "You win",
                            Pair("1","2") to "You lose", Pair("2","3") to "You lose", Pair("3","1") to "You lose"
                          )

    while (wantsToPlay2()) {

        println(mapResults[getAnswers()])

    }

}