package kotlinprograms

fun main(){
    //when statement > java, c, c# c++ > switch statement
    // digits to words
    var num: Int = 0

    println("Enter a number: ")
    num = readln().toInt()

    // when statement does not use conditional operators
    when(num){
        1 ->{
            println("one")
        }
        2 ->{
            println("two")
        }
        3 -> {
            println("three")
        }
        else ->{
            println("invalid number")
        }
    }
}