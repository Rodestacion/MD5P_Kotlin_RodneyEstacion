package ooppracticeactivities.ooppracticeactivity15

fun main(){
    val partTime =PartTimeEmployee(140.0)
    println("Part-time salary is: ${partTime.calculateEarnings()}")

    val fullTime =FullTimeEmployee()
    println("\nMonthly salary is: ${fullTime.calculateEarnings()}")
    println("Overtime pay is: ${fullTime.calculateEarnings(36.5)}")

}