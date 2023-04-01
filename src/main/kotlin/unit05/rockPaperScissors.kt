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


fun playerAnswer(): Int {
    print("Choose rock, paper or scissors: ")
    return readln().toInt()
}

fun cpuAnswer(): Int {
    return (1..3).random()
}

// function selectWinner should take unit05.playerAnswer as first argument and unit05.cpuAnswer as second argument
// it then returns who won as a string, 'player' or 'computer', or 'tie'
fun selectWinner(x: Int, y: Int): String {

    if ((x == 1 && y == 3) || (x == 2 && y == 1) || (x == 3 && y == 2)) {
        return "player"
    }
    if ((x == 1 && y == 1) || (x == 2 && y == 2) || (x == 3 && y == 3)) {
        return "tie"
    }
    if ((x == 1 && y == 2) || (x == 2 && y == 3) || (x == 3 && y == 1)) {
        return "computer"
    }
    return "ERROR"
}

fun printResults(winner: String) {

    if (winner == "player") {
        println("Player wins")
    } else if (winner == "computer") {
        println("Computer wins")
    } else if (winner == "tie") {
        println("Tie")
    }
}


fun main(){
    printGameRules()

    while (wantsToPlay()) {
        val cpuAnswer = cpuAnswer()
        val playerAnswer = playerAnswer()
        println("The computer chose $cpuAnswer")
        val winner = selectWinner(playerAnswer, cpuAnswer)
        printResults(winner)
    }

}