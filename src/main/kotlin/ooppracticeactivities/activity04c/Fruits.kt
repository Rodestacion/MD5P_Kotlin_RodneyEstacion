package ooppracticeactivities.activity04c

class Fruits {
    private val productName:String = "NLFJ Banana Saba"
    private val typeOfProduct:String = "Whole"
    private val supplier:String = "North Star Meat Merchants"
    private val sizeOfProduct:Double=1200.0
    private val sizeUnit:String = "g"
    private val priceOfProduct: Double = 81.0

    fun displayItem(){
        println("----- $typeOfProduct Fruit Information -----")
        println("Product Name: $productName")
        println("Supplier: $supplier")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}