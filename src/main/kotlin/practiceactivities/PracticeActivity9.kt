package practiceactivities

fun main(){
    var weekDay: Int = 0

    println("Enter a number between 1 and 7: ")
    weekDay = readln().toInt()

    when(weekDay){
        1 ->{
            println("The corresponding day of the week is Monday")
        }
        2 ->{
            println("The corresponding day of the week is Tuesday")
        }
        3 ->{
            println("The corresponding day of the week is Wednesday")
        }
        4 ->{
            println("The corresponding day of the week is Thursday")
        }
        5 ->{
            println("The corresponding day of the week is Friday")
        }
        6 ->{
            println("The corresponding day of the week is Saturday")
        }
        7 ->{
            println("The corresponding day of the week is Sunday")
        }
        else ->{
            println("Error: Please enter a number between 1 and 7")
        }
    }
}