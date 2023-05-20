package onlinebookstore

class ShoppingCart {
    private val bookTitle = mutableListOf<String>()
    private val bookAuthor = mutableListOf<String>()
    private val bookPrice = mutableListOf<Double>()
    private val bookQuantity = mutableListOf<Int>()
    fun addToCart(book: Book){
        bookTitle.add(book.getTitle())
        bookAuthor.add(book.getAuthors())
        bookPrice.add(book.getPrice())
        bookQuantity.add(book.getQuantityInStocks())
        println("Book added to cart: ${book.getTitle()}")
    }
    fun removeFromCart(book: Book){
        var count:Int = 0
        var tempIndex: Int = 0
        var itemExist: Boolean = false
        while (count<bookTitle.size){
            if (bookTitle.elementAt(count)==book.getTitle()){
                tempIndex=count
                itemExist=true
                break
            }
            count++
        }

        count=0
        if(itemExist){
            bookTitle.removeAt(tempIndex)
            bookAuthor.removeAt(tempIndex)
            bookPrice.removeAt(tempIndex)
            bookQuantity.removeAt(tempIndex)
        }else{
            println("Sorry item to remove is not match on the list")
        }
        println("Book removed from cart: ${book.getTitle()}")
    }
    fun displayCart(){
        println("\nShopping Cart")
        repeat(bookTitle.size){
            println("Title: ${bookTitle.elementAt(it)}")
            println("Author: ${bookAuthor.elementAt(it)}")
            println("Price: ${bookPrice.elementAt(it)}")
            println("Quantity in Stock: ${bookQuantity.elementAt(it)}")

        }
        println("------------------")
    }
}