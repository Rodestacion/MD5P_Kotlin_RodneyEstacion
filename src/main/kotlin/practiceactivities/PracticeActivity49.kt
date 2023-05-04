package practiceactivities

fun main(){
    var length:Double =0.0
    var width:Double =0.0
    var perimeter:Double =0.0
    var area:Double =0.0

    print("Enter length: ")
    width= readln().toDouble()
    print("Enter width: ")
    length= readln().toDouble()

    perimeter= length calculatePerimeter width
    area = length calculateArea width

    println("Perimeter is ${String.format("%.2f",perimeter)} meters")
    println("Area is ${String.format("%.2f",area)} meters")
}

infix fun Double.calculatePerimeter(widthValue:Double):Double{
    var perimeter = (this*2)+(widthValue*2)
    return perimeter
}

infix fun Double.calculateArea(widthValue:Double):Double{
    var area = this * widthValue
    return area
}