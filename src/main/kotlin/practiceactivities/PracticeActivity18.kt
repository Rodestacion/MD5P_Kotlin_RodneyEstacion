package practiceactivities

fun main(){
    var number: Int = 0
    var remainder: Int = 0
    var outputDisplay : String = ""

    print("Enter positive Integer: ")
    number = readln().toInt()


    repeat(number){counter->
        //determine if the number is odd
        remainder=(counter+1)%2

        if (remainder==1) {
            //set the display number in one row
            outputDisplay = ("$outputDisplay${counter+1} ")
        }

    }
    println(outputDisplay)
}