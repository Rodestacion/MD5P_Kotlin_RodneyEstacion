package ooppracticeactivities.ooppracticeactivity6

fun main(){
    println("First Constructor")
    val newShape1 = Shape()
    println("Length is: ${newShape1.length}")
    println("Width is: ${newShape1.width}")

    println("Second Constructor")
    val newShape2 = Shape(25,21)
    println("Length is: ${newShape2.length}")
    println("Width is: ${newShape2.width}")
}