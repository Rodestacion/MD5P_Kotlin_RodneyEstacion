package kotlinprograms

fun main(){
    myHigherOrderFunction2(lamdhaMinus)
}

//var lamdhaAdd = {num1: Int, num2: Int -> num1 + num2}
var lamdhaMinus = {num1: Int, num2: Int -> num1 - num2}

fun myHigherOrderFunction2 (myFunction: (Int,Int) -> Int){
    println(myFunction(2,5))
}