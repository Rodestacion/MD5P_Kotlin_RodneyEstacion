package ooppracticeactivities.ooppracticeactivity1

class Person (var name:String,var age : Int,var email:String){

    //var age : Int = 0
    //var email:String = ""
    fun printDetails(){
        println("Information Details")
        println("Name: $name")
        println("Age: $age")
        println("Email address: $email")
    }
}