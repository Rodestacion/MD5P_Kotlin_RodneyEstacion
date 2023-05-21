package ooppracticeactivities.activity04b

class Magazine {
    private val editor:String = "Perry C. Mangilaya"
    private val title:String = "Liwayway: Lumangoy sa Agos ng Sining"
    private val monthPublished:String = "May"
    private val yearPublished:Int = 2023

    fun displayDetail(){
        println("----- Magazine Information -----")
        println("Title: $title")
        println("Editor: $editor")
        println("Published Month: $monthPublished")
        println("Published Year: $yearPublished")
        println("*************************************")
        println()
    }
}