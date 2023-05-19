package ooppracticeactivities.ooppracticeactivity18

class Rectangle(private var length:Double,private var width:Double):Shape {
    override fun calculateArea(): Double {
        return length * width
    }
}