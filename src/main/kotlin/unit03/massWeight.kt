fun main(){
    print("Enter the mass in kilograms: ")
    var mass = readln().toDouble()

    var weight = mass * 9.8

    if(weight > 1000){
        print("That's too heavy!")
    } else if(weight < 10){
        print("That's too light!")
    }
}