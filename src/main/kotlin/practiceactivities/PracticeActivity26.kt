package practiceactivities

fun main(){
    var number :Int = 0
    var matrix : Int = 0
    var matrixEndLine: Int = 0
    var difference :Int = 0
    var lineString : String = ""

    //1st print statement
    print("Enter matrix size: ")
    number = readln().toInt()

    //compute the maximum size of matrix
    matrix = number *number
    //compute the boundary of the loop
    matrixEndLine = matrix - number

    //1st loop
    while (matrix>matrixEndLine){
        difference = matrix

        //2nd loop
        repeat(number){
            //concatenate the string rather than to use print
            lineString = "$lineString $difference\t"
            difference -= number
        }

        //2nd print >> Display the output of concatenated string
        println(lineString)
        //reset the string to blank
        lineString=""

        matrix--
    }

}