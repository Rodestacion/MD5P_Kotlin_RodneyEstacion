package practiceactivities

fun main(){
    var number = ArrayList<Int>()
    var counter : Int = 0

    //input 5 numbers
    while (counter < 5){
        print("Enter number ${counter+1}: ")
        number.add(readln().toInt())
        counter++
    }

    //rearrange the array numbers from smallest to largest
    val sortedNumber = number.sorted() //sorted() -> sort but not remove duplicate

    //display the last index as the Maximum number
    println("Max value is: ${sortedNumber.elementAt(sortedNumber.size-1)}")
    //display the first index as the Minimum number
    println("Min value is: ${sortedNumber.elementAt(0)}")
}