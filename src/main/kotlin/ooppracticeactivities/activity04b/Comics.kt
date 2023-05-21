package ooppracticeactivities.activity04b

class Comics {
    private val title:String = "Ghost Rider (2022) #12"
    private val monthPublished:String = "March"
    private val yearPublished:Int = 2023

    fun displayDetail(){
        println("----- Comics Information -----")
        println("Title: $title")
        println("Published Month: $monthPublished")
        println("Published Year: $yearPublished")
        println("*************************************")
        println()
    }

}