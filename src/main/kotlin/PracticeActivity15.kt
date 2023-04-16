fun main(){
    var number1 : Int = 0
    var number2 : Int = 0
    var number3 : Int = 0

    var pythagorean1 : Boolean = false
    var pythagorean2 : Boolean = false
    var pythagorean3 : Boolean = false

    print("Enter number 1: ")
    number1 = readln().toInt()
    print("Enter number 2: ")
    number2 = readln().toInt()
    print("Enter number 3: ")
    number3 = readln().toInt()

    pythagorean1 = ((number1*number1)==((number2*number2)+(number3*number3)))
    pythagorean2 = ((number2*number2)==((number1*number1)+(number3*number3)))
    pythagorean3 = ((number3*number3)==((number1*number1)+(number2*number2)))

    if(pythagorean1||pythagorean2||pythagorean3){
        println("These numbers form a Pythagorean triple")
    }else{
        println("These numbers do not form a Pythagorean triple")
    }

}