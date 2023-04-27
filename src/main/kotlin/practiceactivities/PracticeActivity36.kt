package practiceactivities
fun main(){
    var inputMatrix= mutableListOf(
        mutableListOf<Int>(),
        mutableListOf<Int>(),
        mutableListOf<Int>()
    )
    var sum = mutableListOf<Int>()
    var row: Int = 0
    var column : Int = 0
    var count : Int = 0
    var sumRow : Int = 0
    var sumColumn : Int = 0
    var diagonalCount1 : Int =0
    var diagonalCount2 : Int =2
    var sumDiagonal1 : Int =0
    var sumDiagonal2 : Int =0

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
    while (row<3){
        //reset value to 0
        column  = 0
        while (column < 3){
            print("${inputMatrix[row][column]}\t")
            column++
        }
        println()
        row++
    }

    row=0
    count = 0
    while (row<3){
        //reset value to 0
        column  = 0
        sumColumn = 0
        sumRow = 0

        //For row and Column
        while (column < 3){
            //computation of row and column summation
            sumColumn +=inputMatrix[column][row]
            sumRow+=inputMatrix[row][column]
            column++
        }
        //Add the row and column to array once the computation is complete
        sum.add(count,sumColumn)
        //println(sum.elementAt(count))
        count++
        sum.add(count,sumRow)
        //println(sum.elementAt(count))
        count++

        //For Diagonal

        if(row == 2){
            //Add diagonal to array once the computation is complete
            sumDiagonal1+=inputMatrix[row][diagonalCount1]
            sumDiagonal2+=inputMatrix[row][diagonalCount2]
            sum.add(count,sumDiagonal1)
            //println(sum.elementAt(count))
            count++
            sum.add(count,sumDiagonal2)
            //println(sum.elementAt(count))
        }else{
            //computation of two diagonal summation
            sumDiagonal1+=inputMatrix[row][diagonalCount1]
            sumDiagonal2+=inputMatrix[row][diagonalCount2]
            diagonalCount1++
            diagonalCount2--
        }

        println()
        row++
    }

    //sort the array and remove duplicate
    var sortedNumber = sum.toSortedSet()
    //println(sortedNumber)

    //if array size is more than 1 it automatically identifies as not a magic square
    if(sortedNumber.size==1){
        println("The number inputted is a magic square")
    }else{
        println("The number inputted is not a magic square")
    }
}