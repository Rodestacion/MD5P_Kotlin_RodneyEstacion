package ooppracticeactivities.activity04c

class Breakfast {
    private val productName:String = "Nestle Koko Krunch"
    private val typeOfProduct:String = "Cereals"
    private val manufacturer:String = "Nestle"
    private val sizeOfProduct:Double=450.0
    private val sizeUnit:String = "g"
    private val priceOfProduct: Double = 211.95

    fun displayItem(){
        println("----- $typeOfProduct Breakfast Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}