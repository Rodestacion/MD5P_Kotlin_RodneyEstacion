package ooppracticeactivities.activity04b

class Authors {
    private val firstName:String = "Erle"
    private val lastName:String = "Gardner"
    private val middleName:String = "Stanley"
    private val dateOfBirth:String = "June 17, 1889"

    fun displayDetail(){
        println("----- Author Information -----")
        println("First Name: $firstName")
        println("Middle Name: $middleName")
        println("Last Name: $lastName")
        println("Date of Birth: $dateOfBirth")
        println("*************************************")
        println()
    }
}