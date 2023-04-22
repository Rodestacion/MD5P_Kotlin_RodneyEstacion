package practiceactivities

fun main() {
    var ctr1= 0
    var number : Int=0

    print("Enter a positive number: ")
    number = readln().toInt()

    //Display the product multiplied by 1 to 10
    while(ctr1<10){
        println("$number * ${ctr1+1} = ${number*(ctr1+1)}")
        ctr1++
    }
}