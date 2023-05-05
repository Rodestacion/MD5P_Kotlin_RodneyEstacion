package practiceactivities

fun main(){
    var inputNumber: Int =0
    var factorial :Int = 1
    val outputNumber = {number:Int -> repeat(number){factorial*=(it+1)}
        factorial} //return the value


    try {
        print("Enter a positive integer: ")
        inputNumber = readln().toInt()

        if(inputNumber<0) {
            throw IllegalArgumentException()
        }

        println("Factorial: ${outputNumber(inputNumber)}")

    }catch (exception:IllegalArgumentException) {
        println("Invalid input. Please enter a positive integer")
    }

}