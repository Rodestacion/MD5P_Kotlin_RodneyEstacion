package practiceactivities

//import kotlin.math.roundToInt
fun main(){
    //initialize variable
    //var length: Double = 0.0
    //var width: Double = 0.0
    var length: Double = 12.5
    var width: Double = 36.55
    var perimeter: Double = 0.0
    var area: Double = 0.0


    //input
    /*println("Enter rectangle length: ")
    length = readln().toDouble()
    println("Enter rectangle width: ")
    width = readln().toDouble()*/

    //process
    perimeter = 2 *(length + width)
    area = length * width

    //1.implicit, With import kotlin.math.roundToInt, 100 with .0, 456.87
    //var decimalValue = (area*100.0).roundToInt()/100.0

    //1.explicit, error if Int
    //var decimalValue: Double = 0.0
    //With import kotlin.math.roundToInt, 100 with .0, 456.87
    //decimalValue = (area*100.0).roundToInt()/100.0


    //2.implicit, With import kotlin.math.roundToInt, 100, roundToInt().toDouble(), 456.87
    //var decimalValue = (area*100).roundToInt().toDouble()/100

    //2.explicit, error if Int
    //var decimalValue: Double = 0.0
    //With import kotlin.math.roundToInt, 100, roundToInt().toDouble(), 456.87
    //decimalValue = (area*100).roundToInt().toDouble()/100

    //3.convert into string, no package import, 2f = 2 decimal places
    var decimalValue = String.format("%.2f",area) //456.87

    //output
    println("The Perimeter of rectangle is $perimeter")
    println(" The Area of rectangle is $decimalValue")

}