package unit05

fun printGameRules() {

    println("Rock is 1")
    println("Paper is 2")
    println("Scissors is 3")

}

/**
 * Returns true if the user enters "y", and otherwise returns false
 */
fun wantsToPlay(): Boolean {

    print("Do you want to play? Type 'y' or 'n': ")
    return readln() == "y"

}

/**
 * Returns the player's choice only once they enter either "1", "2", or "3"
 */
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


fun computerAnswer(): Int {
    return (1..3).random()
}

/**
 * Returns both the player's and computer's choice as a pair of integers
 * Uses functions validateAnswers and computerAnswer to get the choices
 */
fun getAnswers(): Pair<Int, Int> {

    print("Choose Rock, Paper or Scissors: ")
    val playerChoice = validateAnswer()

    val computerChoice = computerAnswer()

    val numsForRPS = mapOf(1 to "Rock", 2 to "Paper", 3 to "Scissors")
    println("The computer chose ${numsForRPS[computerChoice]}")

    return Pair(playerChoice, computerChoice)  // First element is the player's choice, and the second is the computer's

}

//                  --------------------------------------------------------------

fun main(){

    printGameRules()

    /* The map object below stores the combinations of rock/paper/scissors that result in the player winning, losing,
       or tying with the computer */
    val mapResults = mapOf(
                            Pair(1,1) to "Tie!", Pair(2,2) to "Tie!", Pair(3,3) to "Tie!",
                            Pair(1,3) to "You win", Pair(2,1) to "You win", Pair(3, 2) to "You win",
                            Pair(1,2) to "You lose", Pair(2,3) to "You lose", Pair(3,1) to "You lose"
                          )

    while (wantsToPlay()) {

        println(mapResults[getAnswers()])

    }

}