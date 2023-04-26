package practiceactivities

fun main(){
    var inputMatrix= mutableListOf(
        mutableListOf<Int>(1,0,0),
        mutableListOf<Int>(0,1,0),
        mutableListOf<Int>(0,0,1)
    )
    var row: Int = 0
    var column : Int = 0
    var count : Int = 0
    var rowSize : Int = 0
    var columnSize : Int = 0

    //get maximum size of row and column
    rowSize=inputMatrix.size
    columnSize = inputMatrix[row].size

    //loop for user input
    while (row<rowSize){
        inputMatrix[row].removeAll(0..rowSize)
        //reset value to 0
        column  = 0

        while (column < columnSize){
            print("Enter a number ${count+1}: ")
            inputMatrix[row].add(column,readln().toInt())
            column++
            count++
        }
        row++
    }

    //loop for output display
    //reset value to 0
    row=0
    while (row<rowSize){
        //reset value to 0
        column  = 0
        while (column < columnSize){
            print("${inputMatrix[row][column]}\t")
            column++
        }
        println()
        row++
    }
}