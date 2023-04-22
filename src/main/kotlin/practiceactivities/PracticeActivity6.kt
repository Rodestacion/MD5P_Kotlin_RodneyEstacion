package practiceactivities

fun main(){
    //initialize
    var number : Int = 0

    //input
    println("Enter a number: ")
    number = readln().toInt()

    //process
    if(number==0) {
        println("The number is zero")
    }else if(number>0) {
        println("The number is positive")
    }else {
        println("The number is negative")
    }
}