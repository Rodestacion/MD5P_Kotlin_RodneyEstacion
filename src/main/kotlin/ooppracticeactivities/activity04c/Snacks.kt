package ooppracticeactivities.activity04c

class Snacks {
    private val productName:String = "Jack & Jill Piattos Cheese"
    private val typeOfProduct:String = "Chips & Dips"
    private val manufacturer:String = "Universal Robina Corporation's (URC)"
    private val sizeOfProduct:Double=85.0
    private val sizeUnit:String = "g"
    private val priceOfProduct:Double = 35.00

    fun displayItem(){
        println("----- $typeOfProduct Snacks Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}