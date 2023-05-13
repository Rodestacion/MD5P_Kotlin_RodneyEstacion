package ooppracticeactivities.ooppracticeactivity8

fun main(){
    println("First Constructor")
    val newDate1 = Date()
    println("Christmas Day is ${newDate1.day}/${newDate1.month}/${newDate1.year}")

    println("Second Constructor")
    val newDate2 = Date(12,26,2023)
    println("Favorite Day is ${newDate2.day}/${newDate2.month}/${newDate2.year}")

}