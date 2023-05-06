package practiceactivities

fun main(){
    var number1:Int = 0
    var number2:Int = 0
    var sum: Int = 0
    var difference: Int = 0
    var product: Int = 0
    var quotient: Double = 0.0

    try {
        println("Enter the first number: ")
        number1 = readln().toInt()
        println("Enter the first number: ")
        number2 = readln().toInt()

        //throw exception if exceed to limit of integer
        Math.toIntExact(number1.toLong()+number2.toLong())
        Math.toIntExact(number1.toLong()+number2.toLong())
        Math.toIntExact(number1.toLong()+number2.toLong())
        Math.toIntExact(number1.toLong()+number2.toLong())

        //computation
        sum = number1 + number2
        difference = number1 - number2
        product = number1 * number2
        quotient = number1.toDouble() / number2.toDouble()

        println("The sum is: $sum")
        println("The difference is: $difference")
        println("The product is: $product")
        println("The sum quotient: ${String.format("%.2f",quotient)}")

    }catch (exception: ArithmeticException){
        println("Error: Arithmetic overflow. The result of the operation exceeds the maximum value of an integer.")
    }catch (exception: NumberFormatException){
        println("Invalid input for an integer.")
    }
}
