package ooppracticeactivities.ooppracticeactivity3

class Book (var title:String,var author: String,var year:Int){

    fun printDetails(){
        println("Book Information")
        println("Book Title: $title")
        println("Book Author: $author")
        println("Published Year: $year")
    }
}