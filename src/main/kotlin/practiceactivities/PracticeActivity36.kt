package practiceactivities

import ch.qos.logback.core.joran.conditional.IfAction

fun main(){
    val inputMatrix= mutableListOf(
        mutableListOf<Int>(),
        mutableListOf<Int>(),
        mutableListOf<Int>()
    )
    var checkInput = mutableListOf<Int>()

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

    println("Magic Square Game")
    println("Input number 1 - 9 once only")
    println("\t#1 #2 #3\n\t#4 #5 #6\n\t#7 #8 #9\n")
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
            checkInput.add(inputMatrix[row][column])
            print("${inputMatrix[row][column]}\t")
            column++
        }
        println()
        row++
    }


    //loop for Checking if magic square
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
            sumColumn +=inputMatrix[column][row]    // vertical reading (0,0) (1,0) (2,0)
            sumRow+=inputMatrix[row][column]        // horizontal reading (0,0) (0,1) (0,2)
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
        // sumDiagonal1 combination -> (0,0) (1,1) (2,2)
        // sumDiagonal2 combination -> (0,2) (1,1) (2,0)

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
            //computation of two diagonal
            sumDiagonal1+=inputMatrix[row][diagonalCount1]
            sumDiagonal2+=inputMatrix[row][diagonalCount2]
            diagonalCount1++
            diagonalCount2--
        }

        row++
    }

    //sort the array and remove duplicate
    var sortedNumber = sum.toSortedSet()
    var check = checkInput.toSortedSet()

    //if array size is more than 1 it automatically identifies as not a magic square
    if(sortedNumber.size==1){
        if(sortedNumber.elementAt(0)==15 && check.size==9){
            println("Congratulation!! This is a Magic Square")
        }else{
            println("You input an Invalid number for Magic Square")
        }
    }else{
        println("Sorry!! This is not a Magic Square")
    }
}