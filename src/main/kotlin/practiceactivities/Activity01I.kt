package practiceactivities

import ooppracticeactivities.activity04b.Publisher

fun main(){
    //Using Activity 01 - B, Implement a process where someone can borrow a book.
    //User: Librarian
    //Goal: Keep track of books borrowed, who borrowed and how long it can be borrowed.

    val bookCode = mutableListOf<String>("001","002","003","004","005","006","007")
    val bookName = mutableListOf<String>("Harry Potter: Philosopher's Stone","Harry Potter: Chamber of Secrets","Harry Potter: Prisoner of Azkaban","Harry Potter: Goblet of Fire","Harry Potter: Order of the Phoenix","Harry Potter: Half-Blood Prince","Harry Potter: Deathly Hallows")
    //var publishYear = mutableListOf<Int>(1997,1998,1999,2000,2003,2005,2007)

    var borrowedBookCode = mutableListOf<String>("002")
    var bookBorrowedDate = mutableMapOf("002" to "2023/04/16")
    var bookReturnDate = mutableMapOf("002" to "2023/05/16")
    var borrowerName = mutableMapOf("002" to "Juan Dela Cruz")

    while(true){
        try {
            var option:Int = 0
            var code : String= ""
            var dateBorrowed: String = ""
            var dateToReturn: String = ""
            var borrower:String = ""
            println("System Display Selection")
            println("[1] Borrowed a Book")
            println("[2] Return a book")
            println("[3] Checked book status")
            println("[4] Exit")
            print("Select your option: ")
            option = readln().toInt()
            println()

            when(option){
                1->{
                    print("Enter the book Code to borrow: ")
                    code = readln()

                    if(borrowedBookCode.contains(code)){
                        println("Book already borrowed by other student/faculty member")
                    }else if(bookCode.contains(code)){
                        print("Enter borrower name: ")
                        borrower = readln()
                        print("Enter Borrowed Date: ")
                        dateBorrowed = readln()
                        print("Enter Returning Date of the book: ")
                        dateToReturn = readln()

                        borrowedBookCode.add(code)
                        bookBorrowedDate.put(code,dateBorrowed)
                        bookReturnDate.put(code,dateToReturn)
                        borrowerName.put(code,borrower)

                        println("Book was successfully lend")
                    }else {
                        println("Sorry! The book does not exist")
                    }

                }
                2->{
                    print("Enter the book Code to return: ")
                    code = readln()

                    if(borrowedBookCode.contains(code)){
                        borrowedBookCode.remove(code)
                        bookBorrowedDate.remove(code)
                        bookReturnDate.remove(code)
                        borrowerName.remove(code)

                        println("Book already return")

                    }else{
                        println("Book code not exist in the borrowed list")
                    }
                }
                3->{
                    println("Code\tStatus\t\tBorrowed Date\tDate to return\tBorrower Name\t\tBook Name")
                    repeat(bookCode.size){
                        print("${bookCode.elementAt(it)}\t\t")

                        if(borrowedBookCode.contains(bookCode.elementAt(it))){
                            print("Borrowed\t")
                            print("${bookBorrowedDate[bookCode.elementAt(it)]}\t\t")
                            print("${bookReturnDate[bookCode.elementAt(it)]}\t\t")
                            print("${borrowerName[bookCode.elementAt(it)]}\t\t")
                        }else{
                            print("Available\t\t\t\t\t\t\t\t\t\t\t\t\t\t")
                        }
                        print("${bookName.elementAt(it)}\n")

                    }
                }
                4->{
                    break
                }

            }

            println()

        } catch (exception:Exception){
            println("Invalid Input")
        }
    }






}