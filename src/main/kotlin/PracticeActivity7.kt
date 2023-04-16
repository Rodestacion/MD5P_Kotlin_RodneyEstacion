fun main(){
    //initialize
    var number : Int = 0
    var oddOrEven:Int = 0

    //input
    println("Enter number: ")
    number = readln().toInt()

    //process
    oddOrEven = number%2

    if(oddOrEven==0) {
        println("The number is even")
    }else{
        println("The number is odd")
    }
}