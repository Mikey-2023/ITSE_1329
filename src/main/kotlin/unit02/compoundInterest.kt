fun main(){
    print("Enter the initial deposit amount: ")
    var p = readln().toDouble()

    print("Enter the annual interest rate: ")
    var r = readln().toDouble()

    print("Enter the compound rate: ")
    var n = readln().toDouble()

    print("Enter the number of years since the initial deposit: ")
    var t = readln().toDouble()

    var a = p * Math.pow(1.0 + (r/n), (n*t))

    print("The final balance is $$a")
}