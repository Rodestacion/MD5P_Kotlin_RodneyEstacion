package ooppracticeactivities.activity04c

class Liquor {
    private val productName:String = "Johnnie Walker Red Label Scotch Whisky"
    private val typeOfProduct:String = "Whisky"
    private val manufacturer:String = "Diageo"
    private val sizeOfProduct:Double=1.0
    private val sizeUnit:String = "L"
    private val priceOfProduct:Double = 810.0

    fun displayItem(){
        println("----- $typeOfProduct Liquor Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}