package practiceactivities

fun main(){
    var number :Int = 0
    var matrix : Int = 0
    var newStartingPoint :Int = 0
    var reverse : Boolean = false

    //1st println()
    print("Enter matrix to generate (n by n): ")
    number = readln().toInt()

    //end when zero or negative integer has been input
    if(number>0) {
        matrix = number * number

        while (matrix > 0) {
            newStartingPoint = matrix
            repeat(number) {
                //2nd println()
                print("$newStartingPoint\t")

                if (reverse) {
                    //when reverse do increment
                    newStartingPoint++
                } else {
                    //when not reverse do decrement
                    newStartingPoint--
                }

            }
            //3rd println()
            println()

            //change the next line Starting number
            if (reverse) {
                reverse = false
                matrix-- //n=3  since it perform the reversing method  matrix = 4 - 1 >> 3
                //on repeat process perform the newStartingPoint--
            } else {
                reverse = true
                matrix = matrix - (number *2) + 1 //n=3  matrix= 9-6+1 >> 4
                //on repeat process perform the newStartingPoint++
            }
        }
    }

}