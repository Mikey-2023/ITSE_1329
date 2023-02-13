fun main(){
    val myAge = 22
    var averageAge : Double = 22.0
    averageAge = (averageAge + 30) / 2

    val testNumber = 147
    val evenOdd = testNumber % 2
    /* Because testNumber and evenOdd are both constant in value, neither can be assigned a new value;
    if they had both been prefixed with 'var' instead of 'val', then the values they hold could be changed;
    in this case, if I, for example, assigned testNumber to 148, then the value evenOdd holds would be 0
    */

    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    answer *= 1000
    println("The answer is " + answer)
}