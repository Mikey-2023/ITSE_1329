package unit06

//todo: input validation for direction choice and y/n done decision

fun main(){
    //room_list[roomindex][0] is room desc; room_list[roomindex][1] gives new room index if move north, 2 east, 3, south, 4 west
    val room_list = arrayOf(
                            arrayOf("I'm in a cozy bedroom.",3,1,-1,-1), arrayOf("I'm in a dusty, dark hallway.",4,2,-1,0),
                            arrayOf("This is a dining room.",5,-1,-1,1), arrayOf("I'm in a tiny bedroom.",-1,4,0,-1),
                            arrayOf("This is a bland hallway.",6,5,1,3), arrayOf("I'm in a kitchen.",-1,-1,2,4),
                            arrayOf("I think I'm on a balcony. The view is nice!",-1,-1,4,-1))

    println("Enter 'n' for north, 'e' for east, 's' for south, or 'w' for west")
    println("When you're done playing, type 'n'")
    var current_room_index = 0  // starting room
    println(room_list[0][0])  // starting description
    var done = false

    while (!done) {
        val copy_current_room_index = current_room_index
        var valid_response = false
        while (!valid_response){
            print("Which way should I move?: ")
            val direction = readln()

            when (direction) {
                "n" -> current_room_index = room_list[current_room_index][1] as Int
                "e" -> current_room_index = room_list[current_room_index][2] as Int
                "s" -> current_room_index = room_list[current_room_index][3] as Int
                "w" -> current_room_index = room_list[current_room_index][4] as Int
            }

            if (current_room_index == -1) {
                println("Can't go that way.")
                current_room_index = copy_current_room_index
            } else {
                valid_response = true
            }
        }
        println(room_list[current_room_index][0])
        print("Keep playing?: ")
        if (readln() == "n") {
            done = true
            print("Thanks for playing!")
        }



    }

}