package unit04
import java.util.Random
fun main(){
    val random = Random()
    val randomNum = random.nextInt(11)

    print("Enter a number between 1 and 10. I'll tell you whether or not you've gotten the right number: ")
    var userNum = readln().toInt()

    while (userNum != randomNum){
        if (userNum > randomNum){
            print("Too high, try again: ")
            userNum = readln().toInt()
        } else{
            print("Too low, try again: ")
            userNum = readln().toInt()
        }
    }
    print("You got it!")
}