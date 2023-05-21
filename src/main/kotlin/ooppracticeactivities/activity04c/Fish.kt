package ooppracticeactivities.activity04c

class Fish {
    private val productName:String = "JSL Dagupan Daing na Bangus Boneless"
    private val typeOfProduct:String = "Processed Fish"
    private val supplier:String = "Dagupan Boneless Bangus"
    private val sizeOfProduct:Double=400.0
    private val sizeUnit:String = "g"
    private val priceOfProduct: Double = 172.0

    fun displayItem(){
        println("----- $typeOfProduct Fish Information -----")
        println("Product Name: $productName")
        println("Supplier: $supplier")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}