package practiceactivities

fun main(){
    var counter: Int = 1
    var number: Int = 0
    var total: Int = 0
    var average: Double = 0.0

    //Input repetition
    while (counter<=5){
        print("Enter number $counter: ")
        number= readln().toInt()

        //variable temporary hold the summation of input number
        total += number

        counter++
    }

    //compute average
    average = total.toDouble()/5
    println("The average of input number is ${String.format("%.2f",average)}")

}