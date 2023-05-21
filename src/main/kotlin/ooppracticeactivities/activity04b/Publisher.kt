package ooppracticeactivities.activity04b

class Publisher {
    private val publisherName : String = "Bloomsbury Children's Books"
    private val publisherAddress : String = "31 Bedford Avenue, London,WC1B 3AT"
    private val dateEstablish : String = "1986"

    fun displayDetail(){
        println("----- Publisher Information -----")
        println("Name: $publisherName")
        println("Address: $publisherAddress")
        println("Date Establish: $dateEstablish")
        println("*************************************")
        println()
    }
}