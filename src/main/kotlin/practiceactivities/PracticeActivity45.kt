package practiceactivities

fun main(){
    var inputNumber: Int =0
    var outputNumber : Int =0

    print("Enter a positive integer: ")
    inputNumber = readln().toInt()
    
    if(inputNumber>0) {
        outputNumber = findFactorial(inputNumber)
        println("Factorial: $outputNumber")
    }else{
        println("Invalid input. Non positive Integer")
    }    
}
fun findFactorial(number:Int):Int{
    var factorial :Int = 1
    var counter :Int = 1

    do {
        factorial *= counter
        counter ++
    } while (counter<=number)

    return factorial
}