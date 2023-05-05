package practiceactivities

fun main(){
    var inputNumber = mutableListOf<Double>()
    var count: Int = 0

    //loop for the numbers input
    while(count<5) {
        print("Enter Number ${count+1}: ")
        inputNumber.add(count, readln().toDouble())
        count++
    }

    val numberAverage = { num:MutableList<Double> -> num.sum()/num.size }

    println("Average: ${String.format("%.2f",numberAverage(inputNumber))}")



}