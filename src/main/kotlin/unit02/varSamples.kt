fun main(){
    var name = "Michael"
    var num = 13
    var numLetter = "12"

    println(name)
    println(num)
    println(numLetter)

    println("Your number times 2 is " + num*2)
    println("The other number times 2 is " + (num-1)*2)
    println("Again, that number times 2 is " + numLetter.toInt()*2)

    name = "Mike"
    num = 14

    println("Now, my name is " + name)
    println("Now, the first number is " + num)
}