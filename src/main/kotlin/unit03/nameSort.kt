fun main() {
    print("Enter a name: ")
    var name1 = readln()
    var name1L = name1.lowercase()

    print("Enter a second name: ")
    var name2 = readln()
    var name2L = name2.lowercase()

    print("Enter a third name: ")
    var name3 = readln()
    var name3L = name3.lowercase()

    if(name1L<name2L){
        when{
            (name3L<name1L) -> print("$name3\n$name1\n$name2")
            (name2L<name3L) -> print("$name1\n$name2\n$name3")
            else -> print("$name1\n$name3\n$name2")
        }
    }

    if (name2L<name1L){
        when{
            (name3L<name2L) -> print("$name3\n$name2\n$name1")
            (name1L<name3L) -> print("$name2\n$name1\n$name3")
            else -> print("$name2\n$name3\n$name1")
        }
    }

    if(name1L==name2L){
        when{
            (name3L<name1L) -> print("$name3\n$name1\n$name2")
            (name1L<name3L) -> print("$name1\n$name2\n$name3")
            else -> print("$name1\n$name2\n$name3")
        }
    }
}