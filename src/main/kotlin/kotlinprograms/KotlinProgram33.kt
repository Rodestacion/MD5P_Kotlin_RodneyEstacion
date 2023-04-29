package kotlinprograms

fun main(){
    print("Enter Number: ")
    var input = readln().toInt()
    var num = cube(input)
    println("The cube of $input is $num")
}

fun cube(number:Int):Int{
    var result: Int = number * number * number
    return result
}