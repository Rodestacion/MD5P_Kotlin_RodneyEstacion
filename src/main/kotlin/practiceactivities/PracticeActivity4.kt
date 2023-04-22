package practiceactivities

fun main(){
    //initialize
    var name : String = "no name"
    var currentYear : Int = 0
    var birthYear : Int = 0
    var difference : Int = 0
        
    //input
    println("Enter name: ")
    name = readln()
    println("Enter current year: ")
    currentYear = readln().toInt()
    println("Enter birth year: ")
    birthYear = readln().toInt()

    //process
    difference = currentYear - birthYear

    //output
    println("$name, your age on $currentYear is $difference")
}