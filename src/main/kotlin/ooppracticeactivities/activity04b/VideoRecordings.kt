package ooppracticeactivities.activity04b

class VideoRecordings {
    private val recordLength : String = "53 seconds"
    private val dateRecorded : String = "April 3, 2023"
    private val title : String = "PBBM explains why he skips breakfast"
    private val publisher : String = "Manila bulletin"

    fun displayDetail(){
        println("----- Video Recording Information -----")
        println("Title: $title")
        println("Record length: $recordLength")
        println("Date Recorded: $dateRecorded")
        println("Publisher: $publisher")
        println("*************************************")
        println()
    }
}