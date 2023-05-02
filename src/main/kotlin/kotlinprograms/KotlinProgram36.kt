package kotlinprograms

fun main(){
    var number1:Int = 0
    var number2:Int = 0
    //Exception handling - try and catch block

    try {
        println("*************************")
        println("Simple Calculator")
        println("*************************")
        println("Enter number 1: ")
        number1 = readln().toInt()
        println("Enter number 2: ")
        number2 = readln().toInt()

        println("The quotient is ${number1/number2}")

    }catch (exception:ArithmeticException){
        println("ArithmeticException")
        println("Wrong input! Integer Inputs only!")
    }catch (exception:NumberFormatException){
        println("NumberFormatException")
        println("Wrong input! Integer Inputs only!")
    }

    println("This is a test")

}