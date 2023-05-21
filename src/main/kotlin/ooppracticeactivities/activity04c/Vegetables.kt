package ooppracticeactivities.activity04c

class Vegetables {
    private val productName:String = "SM Bonus J Onion Bulb Red Local"
    private val typeOfProduct:String = "Root"
    private val supplier:String = "North Star Meat Merchants"
    private val sizeOfProduct:Double=400.0
    private val sizeUnit:String = "g"
    private val priceOfProduct: Double = 75.20

    fun displayItem(){
        println("----- $typeOfProduct Vegetable Information -----")
        println("Product Name: $productName")
        println("Supplier: $supplier")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}