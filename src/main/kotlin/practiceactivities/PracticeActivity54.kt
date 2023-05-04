package practiceactivities

fun main(){
    var inputNumber = mutableListOf<Double>()
    var numberAverage : Double =0.0
    var count: Int = 0

    //loop for the numbers input
    while(count<5) {
        print("Enter Number ${count+1}: ")
        inputNumber.add(count, readln().toDouble())
        //inputNumber.add(count, (count+1).toDouble())
        count++
    }
    numberAverage = calculateAverage(inputNumber)

    println("Average: ${String.format("%.2f",numberAverage)}")

}
//fun computeAverage(numbers: MutableList<Double>):Double{
fun calculateAverage(vararg numbers: MutableList<Double>):Double{
    var sum: Double = 0.0
    var average: Double = 0.0

    //get each numbers element and compute the summation
    //for debug 1 index output only
    for ((counter, num) in numbers.withIndex()){
        println(num)//.elementAt(counter))
        println(num.elementAt(counter))
        sum +=num.elementAt(counter)
    }

    //compute the average
    average = sum/5

    return average
}