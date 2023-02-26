fun main(){
    print("Enter the number of checks written for the month: ")
    var numChecks = readln().toInt()
    when {
        (numChecks < 20) -> print("Service fees: " + (10 + numChecks*0.10))
        (numChecks <= 39) -> print("Service fees: " + (10 + numChecks*0.08))
        (numChecks <= 59) -> print("Service fees: " + (10 + numChecks*0.06))
        (numChecks >= 60) -> print("Service fees: " + (10 + numChecks*0.04))
    }
}
