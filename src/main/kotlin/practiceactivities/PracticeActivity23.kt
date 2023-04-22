package practiceactivities
fun main(){
    var numbers = ArrayList<Int>()
    var counter:Int =0
    var remainder: Int = 0
    var even:Int  = 0
    
    //Input 5 numbers
    while (counter < 5){
        print("Enter number ${counter+1}: ")
        numbers.add(readln().toInt())
        counter++
    }
    
    //reset counter to 0
    counter = 0

    //Check if input number is Even
    while (counter < numbers.size){
        remainder = numbers[counter]%2

        //Count the even numbers that has been input
        if(remainder ==0){
            even++
        }
        counter++
    }

    println("The number of even numbers are: $even")
}