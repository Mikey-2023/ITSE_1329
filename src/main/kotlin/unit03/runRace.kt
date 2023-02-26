fun main(){
    print("Enter your name: ")
    var runner1 = readln()
    print("Enter your time in minutes: ")
    var time1 = readln().toDouble()

    print("Enter your name: ")
    var runner2 = readln()
    print("Enter your time in minutes: ")
    var time2 = readln().toDouble()

    print("Enter your name: ")
    var runner3 = readln()
    print("Enter your time in minutes: ")
    var time3 = readln().toDouble()

    if (time1 < time2){
        when{
            (time3 < time1) -> print("$runner3, $runner1, $runner2")
            (time2 < time3) -> print("$runner1, $runner2, $runner3")
            (time1 < time3 && time3 < time2) -> print("$runner1, $runner3, $runner2")
            (time1 == time3) -> print("$runner1 and $runner3 tied for first, and $runner2 came in last")
            (time2 == time3) -> print("$runner1 won and runners $runner2 and $runner3 tied in last")
        }
    }

    if (time2 < time1){
        when{
            (time3 < time2) -> print("$runner3, $runner2, $runner1")
            (time1 < time3) -> print("$runner2, $runner1, $runner3")
            (time2 < time3 && time3 < time1) -> print("$runner2, $runner3, $runner1")
            (time2 == time3) -> print("$runner2 and $runner3 tied for first, and $runner1 came in last")
            (time1 == time3) -> print("$runner2 won and runners $runner1 and $runner3 tied in last")
        }
    }

    if (time1 == time2){
        when{
            (time3 < time1) -> print("$runner3 won and runners $runner1 and $runner2 tied in last")
            (time1 < time3) -> print("$runner1 and $runner2 tied for first and $runner3 came in last")
            (time1 == time3) -> print("It was a three-way tie! Congrats to $runner1, $runner2, and $runner3!")
        }
    }
}
