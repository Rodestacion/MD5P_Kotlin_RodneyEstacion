package practiceactivities

fun main(){
    var inputMatrix= mutableListOf(
        mutableListOf<Int>(),
        mutableListOf<Int>(),
        mutableListOf<Int>()
    )
    var row: Int = 0
    var column : Int = 0
    var count : Int = 0

    //loop for user input
    while (row<3){
        //reset value to 0
        column  = 0

        while (column < 3){
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
    while (row< 3){
        //reset value to 0
        column  = 0
        while (column < 3){
            print("${inputMatrix[row][column]}\t")
            column++
        }
        println()
        row++
    }
}