package practiceactivities

fun main() {
    var numberSetA = ArrayList<Int>()
    var numberSetB = ArrayList<Int>()
    var counter: Int = 0

    //input 5 numbers for Set A
    println("Value of Set A")
    while (counter < 5) {
        print("Enter number ${counter + 1}: ")
        numberSetA.add(readln().toInt())
        counter++
    }

    //reset counter
    counter = 0
    println()

    //input 5 numbers for Set B
    println("Value of Set B")
    while (counter < 5) {
        print("Enter number ${counter + 1}: ")
        numberSetB.add(readln().toInt())
        counter++
    }

    println()

    //rearrange both Set A & Set B numbers from smallest to largest
    var sortedNumberA = numberSetA.toSortedSet() // toSortedSet() -> sort but remove duplicate
    var sortedNumberB = numberSetB.toSortedSet()

    //Display the number that intersect
    var intersectSet = sortedNumberA.intersect(sortedNumberB)
    println("Intersection of the sets: $intersectSet")

}