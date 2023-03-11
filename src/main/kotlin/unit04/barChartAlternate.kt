package unit04

fun main(){
    for (num in 1..5){
        print("Enter Store1's sales, rounded to the nearest hundred: ")
        var sales = readln().toInt()
        var salesDiv = sales/100
        print("Store $num: ")
        for (s in 1..salesDiv){
            print("*")
        }
        println()

    }

}