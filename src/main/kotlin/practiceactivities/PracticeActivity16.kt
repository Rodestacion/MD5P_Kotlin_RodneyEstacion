package practiceactivities

fun main(){
    var number1 : Int = 0
    var number2 : Int = 0
    var number3 : Int = 0

    var does1Small : Boolean = false
    var does2Small : Boolean = false
    var does3Small : Boolean = false

    print("Enter number 1: ")
    number1 = readln().toInt()
    print("Enter number 2: ")
    number2 = readln().toInt()
    print("Enter number 3: ")
    number3 = readln().toInt()

    does1Small = ((number1<=number2)&&(number1<=number3))
    does2Small = ((number2<=number1)&&(number2<=number3))
    does3Small = ((number3<=number1)&&(number3<=number2))


    if(does1Small&&does2Small&&does3Small){
        println("The smallest number is $number1")
        println("All three input number are same.")
    }else if(does1Small){
        println("The smallest number is $number1")
    }else if(does2Small){
        println("The smallest number is $number2")
    }else {
        println("The smallest number is $number3")
    }

}