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

    perimeter= calculatePerimeter(length,width)
    area = calculateArea(length,width)

    println("Perimeter is ${String.format("%.2f",perimeter)} meters")
    println("Area is ${String.format("%.2f",area)} meters")
}

fun calculatePerimeter(lengthValue:Double, widthValue:Double):Double{
    var perimeter = (lengthValue*2)+(widthValue*2)
    return perimeter
}

fun calculateArea(lengthValue:Double, widthValue:Double):Double{
    var area = lengthValue*widthValue
    return area
}