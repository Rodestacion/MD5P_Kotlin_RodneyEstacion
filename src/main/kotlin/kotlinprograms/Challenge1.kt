package kotlinprograms

fun main(){
    var number1:Int = 0
    var number2:Int = 0
    var repeat : Boolean = true

    while (repeat){
        try {
                println("*************************")
                println("Simple Calculator")
                println("*************************")
                println("Enter number 1: ")
                number1 = readln().toInt()
                println("Enter number 2: ")
                number2 = readln().toInt()

                println("The quotient is ${number1 / number2}")
                repeat = false

        } catch (exception: Exception) {   //handle all kind of exception
            println("Wrong input! Integer Inputs only!")
            println("Program Restart")
        }
    }
}