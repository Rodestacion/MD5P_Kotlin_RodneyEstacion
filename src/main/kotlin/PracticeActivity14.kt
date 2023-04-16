fun main(){
    var year : Int = 0
    var leapYear4:Int = 0
    var leapYear100:Int = 0
    var leapYear400:Int = 0

    println("Enter a year: ")
    year = readln().toInt()

    //Check if year are divisible by 4, 100 and 400
    leapYear4 = year%4
    leapYear100 = year%100
    leapYear400 = year%400

    if(leapYear100==0 && leapYear400>0) {
        println("$year is not a leap year.")
    }else if(leapYear100==0 && leapYear400==0) {
        println("$year is a leap year.")
    }else if(leapYear4==0) {
        println("$year is a leap year.")
    }else{
        println("$year is not a leap year.")
    }
}