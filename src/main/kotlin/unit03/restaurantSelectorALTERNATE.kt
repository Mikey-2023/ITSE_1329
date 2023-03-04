fun main(){
    val JoesGB = "NNN Joe's GB"
    val MainSPC = "YNY Main SPC"
    val CornerC = "YYY Corner C"
    val MamasFI = "YNN Mamas FI"
    var TheCK = "YYY The CK"
    val listRestaurants = listOf<String>(JoesGB, MainSPC, CornerC, MamasFI, TheCK)
    var listOptions = mutableListOf<String>(JoesGB, MainSPC, CornerC, MamasFI, TheCK) // May not need second variable at all

    print("Is anyone vegetarian? Answer 'yes' or 'no': ")
    val vegetarian = readln()
    print("Is anyone vegan? Answer 'yes' or 'no': ")
    val vegan = readln()
    print("Is anyone gluten-free? Answer 'yes' or 'no': ")
    val glutenFree = readln()

    if (vegetarian == "yes"){
        for (element in listRestaurants){
            if (element[0] == 'N'){
                listOptions -= element
            }
        }

    }

    if (vegan == "yes"){
        for (element in listRestaurants){
            if (element[1] == 'N'){
                listOptions -= element
            }
        }
    }

    if (glutenFree == "yes"){
        for (element in listRestaurants){
            if (element[2] == 'N'){
                listOptions -= element
            }
        }
    }
// Revisit when dictionaries are discussed (replace the restaurant strings "NYN", etc with a dictionary
}