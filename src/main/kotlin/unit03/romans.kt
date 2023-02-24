fun main() {
    print("Enter a number between 1 and 10: ")
    var num = readln().toInt()
    when (num) {
        1 -> print("I")
        2 -> print("II")
        3 -> print("III")
        4 -> print("IV")
        5 -> print("V")
        6 -> print("VI")
        7 -> print("VII")
        8 -> print("VIII")
        9 -> print("IX")
        10 -> print("X")
        else -> print("ERROR")
    }
}