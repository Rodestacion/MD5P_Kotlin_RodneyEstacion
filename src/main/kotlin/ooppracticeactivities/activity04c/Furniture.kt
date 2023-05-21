package ooppracticeactivities.activity04c

class Furniture {
    private val productName:String = "Home Suite 4 Seater Domino Dining Set"
    private val typeOfProduct:String = "Dinning"
    private val manufacturer:String = "Delux Deco"
    private val sizeOfProduct:Double=1.0
    private val sizeUnit:String = "Set"
    private val priceOfProduct: Double = 10999.75

    fun displayItem(){
        println("----- $typeOfProduct Furniture Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}