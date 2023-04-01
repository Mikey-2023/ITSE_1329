package unit05

fun printGameRules() {

    println("Rock is 1")
    println("Paper is 2")
    println("Scissors is 3")

}

fun wantsToPlay(): Boolean {

    print("Do you want to play? Type 'y' or 'n': ")
    return readln() == "y"

}

fun validateAnswer(): Int {

    var playerChoice: Int? = null
    while (playerChoice == null) {

        print("Enter your choice: ")
        try {

            playerChoice = readln().toInt()
            if (playerChoice !in (1..3)) {
                print("ERROR: Please enter a number between 1 to 3")
                playerChoice = null

            }
        } catch (e: Exception) {

            print("ERROR: Please enter a number between 1 to 3")

        }

    }
    return playerChoice

}
fun getAnswers(): Pair<Int, Int> {

    print("Choose Rock, Paper or Scissors: ")
    val playerChoice = validateAnswer()

    val computerChoice = (1..3).random()
    val numsForRPS = mapOf(1 to "Rock", 2 to "Paper", 3 to "Scissors")
    println("The computer chose ${numsForRPS[computerChoice]}")

    return Pair(playerChoice, computerChoice)  // First is player's answers , second is computer's

}

//                  --------------------------------------------------------------


fun main(){

    printGameRules()
    val mapResults = mapOf(
                            Pair(1,1) to "Tie!", Pair(2,2) to "Tie!", Pair(3,3) to "Tie!",
                            Pair(1,3) to "You win", Pair(2,1) to "You win", Pair(3, 2) to "You win",
                            Pair(1,2) to "You lose", Pair(2,3) to "You lose", Pair(3,1) to "You lose"
                          )

    while (wantsToPlay()) {

        println(mapResults[getAnswers()])

    }

}