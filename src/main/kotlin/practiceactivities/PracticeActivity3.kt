package practiceactivities

fun main(){
    //initialize
    var item : String = "no item"
    var priceDay1 : Double = 0.00
    var priceDay2 : Double = 0.00
    var priceDay3 : Double = 0.00
    var average : Double = 0.00

    //input
    println("Enter item: ")
    item = readln()
    println("Enter Price in Day 1: ")
    priceDay1 = readln().toDouble()
    println("Enter Price in Day 2: ")
    priceDay2 = readln().toDouble()
    println("Enter Price in Day 3: ")
    priceDay3 = readln().toDouble()

    //process
    average = (priceDay1 + priceDay2 + priceDay3)/3

    //output
    println("Item: $item")
    println("Price in day 1: $priceDay1")
    println("Price in day 2: $priceDay2")
    println("Price in day 3: $priceDay3")
    println("Average price of gasoline is ${String.format("%.2f",average)} per gallon")
}