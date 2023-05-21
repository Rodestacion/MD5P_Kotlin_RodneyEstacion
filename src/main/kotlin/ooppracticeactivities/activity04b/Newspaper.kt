package ooppracticeactivities.activity04b

class Newspaper {
    private val newspaperName:String = "Manila Bulletin"
    private val dayPublished:String = "Sunday"
    private val monthPublished:String = "May"
    private val yearPublished:Int = 2023
    private val headline:String = "Legislated wage hike opposed"

    fun displayDetail(){
        println("----- Newspaper Information -----")
        println("Newspaper name: $newspaperName")
        println("Headline: $headline")
        println("Published Day: $dayPublished")
        println("Published Month: $monthPublished")
        println("Published Year: $yearPublished")
        println("*************************************")
        println()
    }
}