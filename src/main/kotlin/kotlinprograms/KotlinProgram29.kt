package kotlinprograms

fun main(){
    var matrix = listOf(
        //      0   1   2
        listOf('a','b','c'), //0
        listOf('d','e','f'), //1
        listOf('g','h','i'), //2
        listOf('j','k','l'), //3
    )
    //println(matrix[2][0])
    println(matrix.size) //get the number of rows
    var row: Int = 0

    while (row<matrix.size){
        var column : Int = 0
        while (column < matrix[row].size){
            print("${matrix[row][column]}\t")
            column++
        }
        row++
        println()
    }
}