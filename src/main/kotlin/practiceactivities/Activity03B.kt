package practiceactivities
fun main(){
    //Covered Topic(s) : Functions
    //Instructions :
    //1. Create an ArrayList of bookname with 20 entries.
    //2. Create a function "isBookInRecord" that will accept a String and return true if the book is found, otherwise false.
    //3. Create a function "addBook" that will accept a String and add it to the ArrayList.
    //4. Create a function "removeBook"  that will accept a name and remove it from the ArrayList if it exactly matches the book name.
    //5. Create a function "countBooks" that will return the size of the ArrayList.
    //6. Create a function "searchBookWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of books that matched if there are.
    //7. Create a function  "searchBookName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of books that matched if there are.
    //8.  Create a function "showBooks" that will print all the entries in the ArrayList.

    var talkingEnglishBook = mutableListOf<String>("What's Your Name?","I like food","In The Garden","My School",
        "What Time is It?","Hide and Seek","How Are You?","Sets and Numbers",
        "Back To School","Field Trip","Musical Instruments","It's Nice to Meet You",
        "What Do You Enjoy?","One, Two, Three","Where Are You From?","What Would You Like?",
        "Can I Help You?","Ready For School?","Simon Says","Joe Goes Shopping",)

    while (true){
        try {
            var option: Int = 0
            var inputText: String = ""
            println("[1] Search Book if in the Record")
            println("[2] Add the Book")
            println("[3] Remove the Book")
            println("[4] Show Number of Books")
            println("[5] Book Wild Search")
            println("[6] Search Book Name")
            println("[7] Show Books List")
            println("[8] Exit")
            print("Select your option: ")
            option = readln().toInt()

            when (option){
                1->{
                    print("Input Book name to search in record: ")
                    inputText = readln()
                    if(isBookInRecord(talkingEnglishBook,inputText)){
                        println("Book $inputText is existing in the list")
                    }else{
                        println("Sorry! Book $inputText is not exist in the list")
                    }
                }
                2->{
                    print("Input Book name add in record: ")
                    inputText = readln()

                    if(addBook(talkingEnglishBook,inputText)){
                        println("Sorry! Book $inputText is already exist in the list")
                    }else{
                        talkingEnglishBook.add(inputText)
                        println("Book Add successfully")
                    }
                }
                3->{
                    print("Input Book name to remove ")
                    inputText = readln()

                    if (removeBook(talkingEnglishBook,inputText) <0){
                        println("Sorry! Book $inputText is not exist in the list")
                    }else{
                        talkingEnglishBook.removeAt(removeBook(talkingEnglishBook,inputText))
                        println("Book Remove successfully")
                    }
                }
                4->{
                    println("Total Book is: ${countBooks(talkingEnglishBook)}")
                }
                5->{
                    print("Input text to search: ")
                    inputText = readln()
                    searchBookWildSearch(talkingEnglishBook,inputText)
                }
                6->{
                    print("Input exact Book name to search: ")
                    inputText = readln()
                    searchBookName(talkingEnglishBook,inputText)
                }
                7->{
                    showBooks(talkingEnglishBook)
                }
                8->{
                    break
                }

            }
            println()
        }catch (exception:Exception){
            println("Invalid Input")
        }
    }

}

fun isBookInRecord(talkingEnglishBook:MutableList<String>,searchBook:String): Boolean {
    var number :Int = 0
    var answer:Boolean = false

    while (number<talkingEnglishBook.size){
        if(talkingEnglishBook.elementAt(number).uppercase()==searchBook.uppercase()){
            answer = true
            break
        }
        number++
    }

    return answer
}

fun addBook(talkingEnglishBook:MutableList<String>,searchBook:String): Boolean {
    var number :Int = 0
    var answer:Boolean = false

    while (number<talkingEnglishBook.size){
        if(talkingEnglishBook.elementAt(number).uppercase()==searchBook.uppercase()){
            answer = true
            break
        }
        number++
    }

    return answer
}

fun removeBook(talkingEnglishBook:MutableList<String>,searchBook:String): Int {
    var remove: Int = -1
    var number :Int = 0

    while (number<talkingEnglishBook.size){
        if(talkingEnglishBook.elementAt(number).uppercase()==searchBook.uppercase()){
            remove = number
            break
        }
        number++
    }
    return remove
}

fun countBooks(talkingEnglishBook:MutableList<String>): Int {
    return talkingEnglishBook.size
}

fun searchBookWildSearch(talkingEnglishBook:MutableList<String>,searchBook:String){
    var number :Int = 0

    println("List of Book searched")
    while (number<talkingEnglishBook.size){
        if(talkingEnglishBook.elementAt(number).uppercase().contains(searchBook.uppercase())){
            println(talkingEnglishBook.elementAt(number))
        }
        number++
    }
    println("---Nothing Follows---")
}

fun searchBookName(talkingEnglishBook:MutableList<String>,searchBook:String){
    var number :Int = 0

    println("List of Book searched")

    while (number<talkingEnglishBook.size){
        if(talkingEnglishBook.elementAt(number).uppercase()==searchBook.uppercase()){
            println(talkingEnglishBook.elementAt(number))
        }
        number++
    }
    println("---Nothing Follows---")
}

fun showBooks(talkingEnglishBook:MutableList<String>){
    println("List of the Book")
    repeat(talkingEnglishBook.size){
        println(talkingEnglishBook.elementAt(it))
    }
    println("---Nothing Follows---")
}