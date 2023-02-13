// Michael Camp
// 02.8 String Manipulator
// 02-12-2023
fun main(){
    print("Enter your favorite city: ")
    var favCity = readln()
    var numChars = favCity.length
    var upperCity = favCity.uppercase()
    var lowerCity = favCity.lowercase()
    var firstChar = favCity[0]

    println("Number of letters in your favorite city: $numChars")
    println("The name of your favorite city in all uppercase letters: $upperCity")
    println("The name of your favorite city in all lowercase letters: $lowerCity")
    println("The first letter of your favorite city: $firstChar")

}