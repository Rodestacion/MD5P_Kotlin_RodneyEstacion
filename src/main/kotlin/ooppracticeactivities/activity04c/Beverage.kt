package ooppracticeactivities.activity04c

class Beverage {
    private val productName:String = "Coke Zero"
    private val typeOfProduct:String = "Carbonated Drinks"
    private val manufacturer:String = "Coca Cola"
    private val sizeOfProduct:Double=1.5
    private val sizeUnit:String = "L"
    private val priceOfProduct:Double= 67.50

    fun displayItem(){
        println("----- $typeOfProduct Beverage Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}