package ooppracticeactivities.activity04c

class SanitaryProducts {
    private val productName:String = "Nursy Baby Wipes Unscented"
    private val typeOfProduct:String = "Wipes"
    private val manufacturer:String = "Baoding Yusen Sanitary Health Supplies Co. Ltd"
    private val sizeOfProduct:Double= 30.0
    private val sizeUnit:String = "sheets"
    private val priceOfProduct: Double = 43.75

    fun displayItem(){
        println("----- $typeOfProduct Sanitary Products Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}