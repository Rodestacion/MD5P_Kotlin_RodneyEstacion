package practiceactivities
fun main(){
    var number1: Double = 0.0
    var number2: Double = 0.0
    val quotient = {num1:Double, num2:Double -> num1/num2}
    var result: Double = 0.0

    try {
        println("Enter the first number: ")
        number1 = readln().toDouble()
        println("Enter the first number: ")
        number2 = readln().toDouble()

        if(number2==0.0){
            throw ArithmeticException()
        }
        result = quotient(number1,number2)
        println("Average: ${String.format("%.2f",result)}")


    }catch (exception:ArithmeticException){
        println("Error: Division by Zero")
    }catch (exception:Exception){
        println("Error: Enter Number Only")
    }
}