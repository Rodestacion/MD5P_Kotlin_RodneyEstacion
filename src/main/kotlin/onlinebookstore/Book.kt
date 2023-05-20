package onlinebookstore

class Book(private var title: String, private var authors:String, private var price :Double, private var quantityInStocks:Int) {

    fun getTitle():String{
        return this.title
    }
    fun setTitle(title:String){
        this.title = title
    }

    fun getAuthors():String{
        return this.authors
    }
    fun setAuthors(authors:String){
        this.authors = authors
    }

    fun getPrice():Double{
        return this.price
    }
    fun setPrice(price:Double){
        this.price = price
    }

    fun getQuantityInStocks():Int{
        return this.quantityInStocks
    }
    fun setQuantityInStocks(quantityInStocks:Int){
        this.quantityInStocks = quantityInStocks
    }

    fun displayDetails(){
        println("Book Title: ${getTitle()}")
        println("Author of the Book: ${getAuthors()}")
        println("Book current Price: ${getPrice()}")
        println("Remaining Stocks: ${getQuantityInStocks()}")
    }
}