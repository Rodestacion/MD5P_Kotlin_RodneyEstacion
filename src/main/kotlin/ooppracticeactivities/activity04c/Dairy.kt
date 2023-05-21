package ooppracticeactivities.activity04c

class Dairy {
    private val productName:String = "Nestle All Purpose Cream"
    private val typeOfProduct:String = "Cream"
    private val manufacturer:String = "Nestle"
    private val sizeOfProduct:Double= 250.0
    private val sizeUnit:String = "ml"
    private val priceOfProduct:Double = 77.50

    fun displayItem(){
        println("----- $typeOfProduct Dairy Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}