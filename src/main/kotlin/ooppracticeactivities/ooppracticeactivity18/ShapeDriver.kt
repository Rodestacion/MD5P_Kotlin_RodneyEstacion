package ooppracticeactivities.ooppracticeactivity18

fun main(){
    val circle = Circle(45.0)
    println("Circle Area is: ${String.format("%.2f",circle.calculateArea())}")

    println()
    val rectangle = Rectangle(25.0, 30.0)
    println("Rectangle Area is: ${rectangle.calculateArea()}")
}
