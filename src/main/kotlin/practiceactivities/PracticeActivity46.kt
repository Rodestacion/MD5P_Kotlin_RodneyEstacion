package practiceactivities

fun main(){
    var inputNumber = mutableListOf<Double>()
    var numberAverage : Double =0.0
    var count: Int = 0

    //loop for the numbers input
    while(count<5) {
        print("Enter Number ${count+1}: ")
        inputNumber.add(count, readln().toDouble())
        count++
    }
    numberAverage = computeAverage(inputNumber)

    println("Average: ${String.format("%.2f",numberAverage)}")
    
}
fun computeAverage(numbers: MutableList<Double>):Double{
    var counter :Int = 0
    var sum: Double = 0.0
    var average: Double = 0.0

    //get each numbers element and compute the summation
    while (counter<numbers.size){
        sum +=numbers.elementAt(counter)
        counter++
    }

    //compute the average
    average = sum/numbers.size

    return average
}