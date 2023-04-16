fun main(){
    var score : Int = 0

    println("Please enter your exam score (out of 100): ")
    score = readln().toInt()

    if(score<0){
        println("Invalid exam score")
    }
    else if(score <= 60) {
        println("Your grade is F")
    }
    else if(score<=69){
        println("Your grade is D")
    }
    else if(score<=79){
        println("Your grade is C")
    }
    else if(score<=89){
        println("Your grade is B")
    }
    else if(score<=100){
        println("Your grade is A")
    }
    else {
        println("Invalid exam score")
    }

}