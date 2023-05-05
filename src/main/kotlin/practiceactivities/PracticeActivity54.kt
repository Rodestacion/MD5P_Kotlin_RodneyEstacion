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
    numberAverage = calculateAverage(
        inputNumber.elementAt(0),
        inputNumber.elementAt(1),
        inputNumber.elementAt(2),
        inputNumber.elementAt(3),
        inputNumber.elementAt(4))

    println("Average: ${String.format("%.2f",numberAverage)}")

}fun calculateAverage(vararg numbers: Double):Double{
    var average: Double = 0.0
    average = numbers.sum()/numbers.size

    return average
}