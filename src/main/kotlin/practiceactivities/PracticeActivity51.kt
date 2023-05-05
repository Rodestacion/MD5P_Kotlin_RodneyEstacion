package practiceactivities

fun main(){
    var inputNumber: Int =0
    var factorial :Int = 1

    val outputNumber = {number:Int -> repeat(number){factorial*=(it+1)}
        factorial} //return the value

    print("Enter a positive integer: ")
    inputNumber = readln().toInt()

    if(inputNumber>0) {
        println("Factorial: ${outputNumber(inputNumber)}")
    }else{
        println("Invalid input. Non positive Integer")
    }
}