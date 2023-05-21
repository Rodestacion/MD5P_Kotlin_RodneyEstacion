package ooppracticeactivities.activity04c

class Laundry {
    private val productName:String = "Ariel Liquid Detergent Refill Sunrise Fresh"
    private val typeOfProduct:String = "Liquid Detergent"
    private val manufacturer:String = "FMCG Viet Co., Ltd"
    private val sizeOfProduct:Double=810.0
    private val sizeUnit:String = "g"
    private val priceOfProduct:Double = 148.75

    fun displayItem(){
        println("----- $typeOfProduct Laundry Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}