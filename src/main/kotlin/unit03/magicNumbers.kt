fun main(){
    print("Enter the month as a number: ")
    var monthNum = readln().toInt()

    print("Enter the day as a number: ")
    var dayNum = readln().toInt()

    print("Enter the year as a two-digit number: ")
    var yearNum = readln().toInt()

    if (monthNum*dayNum == yearNum){
        print("The date you entered is magic!")
    } else{
        print("The date you entered isn't magic.")
    }
}