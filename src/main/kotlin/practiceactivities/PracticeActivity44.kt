package practiceactivities

fun main(){
    var inputTemperature: Double =0.0
    var outputTemperature : Double =0.0

    print("Temperature (Celsius): ")
    inputTemperature = readln().toDouble()

    outputTemperature = convertTemperature(inputTemperature)

    println("Temperature (Fahrenheit): ${String.format("%.2f",outputTemperature)}")
}
fun convertTemperature(celsius:Double):Double{
    var fahrenheit :Double = 0.0

    fahrenheit = (celsius * 9/5 ) + 32

    return fahrenheit
}