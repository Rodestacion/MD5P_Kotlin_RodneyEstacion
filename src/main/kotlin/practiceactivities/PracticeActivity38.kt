package practiceactivities

fun main(){
    var dozenCount:Int = 0
    var lessDozen: Int =0
    var quantity: Int = 0

    println("Enter the number of eggs: ")
    quantity= readln().toInt()

    dozenCount = determineDozen(quantity)
    lessDozen = showLessDozen(quantity)

    println("Number of dozen: $dozenCount")
    println("Eggs less than a dozen: $lessDozen")

}

fun determineDozen(quantityValue:Int):Int{
    var dozenCount = quantityValue / 12
    return dozenCount
}

fun showLessDozen(quantityValue:Int):Int{
    var lessCount = quantityValue % 12
    return lessCount
}