fun main(){
    /*note: I think this could be done much more elegantly using a different sort of string comparison,
     but it requires stuff we haven't covered yet */

    print("Is anyone in your party vegetarian? Type 'yes' or type 'no': ")
    var vegetarian = readln()


    print("is anyone in your party vegan? Type 'yes' or type 'no': ")
    var vegan = readln()


    print("Is anyone in your party gluten-free? Type 'yes' or type 'no': ")
    var glutenFree = readln()

    when {
        (vegetarian == "yes" && vegan == "yes" && glutenFree == "yes") -> print("Here are your options:" +
                "\nCorner Cafe\nThe Chef's Kitchen")
        (vegetarian == "no" && vegan == "yes" && glutenFree == "yes") -> print("Here are your options:" +
                "\nCorner Cafe\nThe Chef's Kitchen")
        (vegetarian == "yes" && vegan == "no" && glutenFree == "yes") -> print("Here are your options:" +
                "\nMain Street Pizza Company\nCorner Cafe\nThe Chef's Kitchen")
        (vegetarian == "yes" && vegan == "yes" && glutenFree == "no") -> print("Here are your options:" +
                "\nCorner Cafe\nThe Chef's Kitchen")
        (vegetarian == "no" && vegan == "no" && glutenFree == "no") -> print("Here are your options:" +
                "\nJoe's Gourmet Burgers\nMain Street Pizza Company\nCorner Cafe\nMama's Fine Italian" +
                "\nThe Chef's Kitchen")
        (vegetarian == "yes" && vegan == "no" && glutenFree == "no") -> print("Here are your options:" +
                "\nMain Street Pizza Company\nCorner Cafe\nMama's Fine Italian" +
                "\nThe Chef's Kitchen")
        (vegetarian == "no" && vegan == "yes" && glutenFree == "no") -> print("Here are your options:" +
                "\nCorner Cafe\nThe Chef's Kitchen")
        (vegetarian == "no" && vegan == "no" && glutenFree == "yes") -> print("Here are your options:" +
                "\nMain Street Pizza Company\nCorner Cafe\nThe Chef's Kitchen")
    }

    }