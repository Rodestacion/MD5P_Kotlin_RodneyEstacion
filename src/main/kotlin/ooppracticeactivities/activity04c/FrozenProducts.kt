package ooppracticeactivities.activity04c

class FrozenProducts {
    private val productName:String = "CDO Smoked Longanisa"
    private val typeOfProduct:String = "Processed Meat"
    private val manufacturer:String = "CDO Foodsphere, Inc."
    private val sizeOfProduct:Double=250.0
    private val sizeUnit:String = "g"
    private val priceOfProduct: Double = 89.50

    fun displayItem(){
        println("----- $typeOfProduct Frozen Products Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}