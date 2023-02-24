fun main(){
    print("Enter how many friends you have: ")
    val friendsCount = readln().toInt()

    if (friendsCount >= 500) {
        print("Adopt a Dog Today!")
    } else {
        print("Buy Cat Food 20% off")
    }
}