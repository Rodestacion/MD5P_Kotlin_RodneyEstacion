package practiceactivities

fun main(){
    //var number = mutableSetOf<Int>(2,4,6,8,10)
    //var square = mutableSetOf<Int>(4,16,36,64,100)
    //var cube = mutableSetOf<Int>(8,64,216,512,1000)

    //change to listOf<>, number, square and cube are static value
//    var number = listOf<Int>(2,4,6,8,10)
//    var square = listOf<Int>(4,16,36,64,100)
//    var cube = listOf<Int>(8,64,216,512,1000)

    var number = ArrayList<Int>()
    var square: Int = 0
    var cube: Int = 0
    var sumSquare : Int = 0
    var sumCube : Int = 0
    var counter : Int = 0

    while (counter < 5){
        print("Enter number ${counter+1}: ")
        number.add(readln().toInt())
        counter++
    }

    //Display Output
    //1st println()
    println("Number\t\tSquare\t\tCube")

    //reset counter to 0
    counter = 0
    while (counter < number.size){
        // compute the product and summation of square & cube
        square = number[counter]*number[counter]
        cube = number[counter]*number[counter]*number[counter]
        sumSquare+=square
        sumCube += cube

        //2nd println()
        println("${number[counter]}\t\t\t$square\t\t\t$cube")

        counter++
    }
    //3rd println()
    println("Total\t\t$sumSquare\t\t\t$sumCube")
}