package practiceactivities

fun main(){
    var inputNumber = mutableListOf<Double>()
    //var numberAverage : Double =0.0
    var total: Double = 0.0

    var count: Int = 0

    //loop for the numbers input
    while(count<5) {
        print("Enter Number ${count+1}: ")
        inputNumber.add(count, readln().toDouble())
        count++
    }

    //for debug kotlin.Unit
    val array = arrayOf(1, 2, 3, 4, 5, 6)
    inputNumber.forEach { number -> total += number }
    inputNumber.forEach { println(it * 4) }

//    //numberAverage = practiceactivities.computeAverage(inputNumber)
//    println(numberAverage(1))
    //println("Average: ${String.format("%.2f",numberAverage)}")
    val numberAverage = inputNumber.forEach{ number -> total +=number }
    println(numberAverage)

}