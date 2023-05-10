package ooppracticeactivities.ooppracticeactivity2

class Rectangle (var width:Double, var height:Double){

    fun calculateArea(){
        var area: Double = 0.0
        area = width * height
        println("The area is: ${String.format("%.2f",area)}")
    }
}