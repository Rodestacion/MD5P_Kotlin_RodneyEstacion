fun main(){
    var number: Int = 0
    var counter : Int = 1 //set value as 1 that use in multiplication computation
    var factorial : Double = 1.0 //to handle factorial of input number above 20

    print("Input a positive integer: ")
    number = readln().toInt()

    //factorial computation using do while
    do {
        factorial *= counter
        counter ++
    } while (counter<=number)

    //display factorial output
    println("The factorial of $number is ${String.format("%.0f",factorial)}")
}
