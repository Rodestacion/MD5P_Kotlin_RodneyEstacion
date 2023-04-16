fun main(){
    //if else if statement
    // age 0 - 12 > kids
    // age 13 - 18 > Teenagers
    // age  19 - 59 > Adult
    // age 60 and above > Senior Citizen
    // less than 0 > invalid age

    var age : Int = 0

    println("Please enter your age: ")
    age = readln().toInt()

    if(age >= 60) {
        println("Senior Citizen")
    }
    else if(age>=19){
        println("Adults")
    }
    else if(age>=13){
        println("Teenager")
    }
    else if(age>=0){
        println("kids")
    }
    else{
        println("Invalid age")
    }

}