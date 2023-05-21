package ooppracticeactivities.activity04b

class AudioRecordings {
    private val recordLength : String = "31.25 minutes"
    private val dateRecorded : String = "May 11, 2023"
    private val title : String = "What's new in Android"
    private val publisher : String = "Android Developers"

    fun displayDetail(){
        println("----- Audio Recording Information -----")
        println("Title: $title")
        println("Record length: $recordLength")
        println("Date Recorded: $dateRecorded")
        println("Publisher: $publisher")
        println("*************************************")
        println()
    }
}