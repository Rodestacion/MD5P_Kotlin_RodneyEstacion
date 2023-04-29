package practiceactivities

fun main(){
    var inputWeight: Double =0.0
    var inputHeight: Double =0.0
    var bodyMassIndex : Double =0.0

    print("Weight (kg): ")
    inputWeight = readln().toDouble()
    print("Height (m): ")
    inputHeight = readln().toDouble()

    bodyMassIndex = calculateBMI(inputWeight,inputHeight)

    println("BMI: ${String.format("%.2f",bodyMassIndex)}")
}
fun calculateBMI(weight:Double,height:Double):Double{
    var bodyMassIndex :Double = 0.0

    bodyMassIndex = weight / (height*height)

    return bodyMassIndex
}