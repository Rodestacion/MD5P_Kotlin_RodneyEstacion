package practiceactivities

fun main(){
    var inputNumber: Int = 0
    var listOfNumber = listOf<String>("Chess","Monopoly","Scrabble","Battleship","Snake and ladder")

    try {
        println("Enter an index: ")
        inputNumber = readln().toInt()

        println("Family Game for today is: ${listOfNumber.elementAt(inputNumber)}")

    }catch (exception:ArrayIndexOutOfBoundsException){
        println("Error: Index out of bounds. Please enter an index between 0 and 4")
    }

}
