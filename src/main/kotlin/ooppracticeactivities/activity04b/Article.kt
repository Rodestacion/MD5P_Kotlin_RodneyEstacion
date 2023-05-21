package ooppracticeactivities.activity04b

class Article {
    private val title : String = "LIFESTYLE"
    private val content:String = "Philippine Tourism turns golden fashionably"
    private val author:String = "Deedee Siytangco"

    fun displayDetail(){
        println("----- Article Information ------")
        println("Title: $title")
        println("Content: $content")
        println("Author: $author")
        println("*************************************")
        println()
    }

}