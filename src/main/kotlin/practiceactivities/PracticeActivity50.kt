package practiceactivities

fun main(){
    var inputWeight: Double =0.0
    var inputHeight: Double =0.5
    val bodyMassIndex = {weight:Double,height:Double -> (weight / (height*height))}

    print("Weight (kg): ")
    inputWeight = readln().toDouble()
    print("Height (m): ")
    inputHeight = readln().toDouble()


    println("BMI: ${String.format("%.2f",bodyMassIndex(inputWeight,inputHeight))}")
}