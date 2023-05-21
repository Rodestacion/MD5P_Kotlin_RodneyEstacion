package ooppracticeactivities.activity04c

class Condiments {
    private val productName:String = ""
    private val typeOfProduct:String = ""
    private val manufacturer:String = ""
    private val sizeOfProduct:Double=0.0
    private val sizeUnit:String = ""
    private val priceOfProduct:String = ""

    fun displayItem(){
        println("----- $typeOfProduct Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}