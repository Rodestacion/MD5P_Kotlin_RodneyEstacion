package practiceactivities

fun main(){
    var number:Double = 0.0

    try {
        println("Enter a decimal number: ")
        number = readln().toDouble()

        println("Converted to integer: ${number.toInt()}")

    }catch (exception: NumberFormatException){ //exception if input non decimal number
        println("Error: Invalid input. Please enter a valid decimal number.")
    }
}
