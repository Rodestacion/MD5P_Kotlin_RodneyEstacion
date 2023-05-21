package ooppracticeactivities.activity04c

class Poultry {
    private val productName:String = "Magnolia Chicken Drumstick"
    private val typeOfProduct:String = "Drumstick"
    private val supplier:String = "San Miguel Food, Inc."
    private val sizeOfProduct:Double=550.0
    private val sizeUnit:String = "g"
    private val priceOfProduct: Double = 123.75

    fun displayItem(){
        println("----- $typeOfProduct Poultry Information -----")
        println("Product Name: $productName")
        println("Supplier: $supplier")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}