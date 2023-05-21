package ooppracticeactivities.activity04b

class Illustrator {
    private val firstName:String = "Edwin"
    private val lastName:String = "Abbey"
    private val middleName:String = "Austin"
    private val dateOfBirth:String = "April1, 1852"

    fun displayDetail(){
        println("----- Illustrator Information -----")
        println("First Name: $firstName")
        println("Middle Name: $middleName")
        println("Last Name: $lastName")
        println("Date of Birth: $dateOfBirth")
        println("*************************************")
        println()
    }
}