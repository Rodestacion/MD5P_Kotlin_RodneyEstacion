package practiceactivities

fun main(){
    var length:Double =0.0
    var width:Double =0.0
    var perimeter = {lengthValue:Double,widthValue:Double -> (lengthValue*2)+(widthValue*2)}
    var area= {lengthValue:Double,widthValue:Double -> lengthValue*widthValue}

    print("Enter length: ")
    width= readln().toDouble()
    print("Enter width: ")
    length= readln().toDouble()

    println("Perimeter is ${String.format("%.2f",perimeter(length,width))} meters")
    println("Area is ${String.format("%.2f",area(length,width))} meters")
}