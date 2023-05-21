package ooppracticeactivities.activity04c

class CannedGoods {
    private val productName:String = "Maling Luncheon Meat Chicken"
    private val typeOfProduct:String = "Canned Meat"
    private val manufacturer:String = "Bright Food Group Co."
    private val sizeOfProduct:Double=397.0
    private val sizeUnit:String = "g"
    private val priceOfProduct:Double = 116.5

    fun displayItem(){
        println("----- $typeOfProduct Canned Goods Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}