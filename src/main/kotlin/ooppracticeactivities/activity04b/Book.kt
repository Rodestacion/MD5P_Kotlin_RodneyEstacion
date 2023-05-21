package ooppracticeactivities.activity04b

class Book {
    private val title:String = "Harry Potter and the Philosopher's Stone"
    private val author:String = "J. K. Rowling"
    private val yearPublished:Int = 1997
    private val edition:String = "1st Edition"
    private val isbn :String = "978-0-7475-3269-9"
    private val publisher:String = "Bloomsbury Children's Books"
    private val chapters = mutableListOf<String>("The Boy Who Lived","The Vanishing Glass","The Letters from No One","The Keeper of the Keys","Diagon Alley","The Journey from Platform Nine and Three-Quarters","The Sorting Hat","The Potions Master","Midnight Duel","Hallowe'en","Quidditch","The Mirror of Erised","Nicolas Flamel","Norbert the Norwegian Ridgeback","The Forbidden Forest","Through the Trapdoor","The Man with the Two Faces")
    private val numberPages:Int = 223

    fun displayDetail(){
        println("----- Book Information -----")
        println("Title: $title")
        println("Author: $author")
        println("Published Year: $yearPublished")
        println("Edition: $edition")
        println("ISBN: $isbn")
        println("Publisher: $publisher")
        println("Number of Pages: $numberPages")
        println("Chapter List")
        repeat(chapters.size){
            println("Chapter ${it+1}: ${chapters.elementAt(it)}")
        }
        println("*************************************")
        println()
    }
}