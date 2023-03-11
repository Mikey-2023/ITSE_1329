package unit04

fun main(){
    print("Enter today's sales for store 1: ")
    val store1 = readln().toInt()/100
    print("Enter today's sales for store 2: ")
    val store2 = readln().toInt()/100
    print("Enter today's sales for store 3: ")
    val store3 = readln().toInt()/100
    print("Enter today's sales for store 4: ")
    val store4 = readln().toInt()/100
    print("Enter today's sales for store 5: ")
    val store5 = readln().toInt()/100

    for (i in 1..5){
        when (i) {
            1 -> println("Store 1: " + "*".repeat(store1))
            2 -> println("Store 2: " + "*".repeat(store2))
            3 -> println("Store 3: " + "*".repeat(store3))
            4 -> println("Store 4: " + "*".repeat(store4))
            5 -> println("Store 5: " + "*".repeat(store5))
        }
    }
}