package ooppracticeactivities.activity04c

class Condiments {
    private val productName:String = "Silver Swan Patis Seasoning"
    private val typeOfProduct:String = "Fish Sauce"
    private val manufacturer:String = "NutriAsia"
    private val sizeOfProduct:Double=350.0
    private val sizeUnit:String = "ml"
    private val priceOfProduct:String = "22.75"

    fun displayItem(){
        println("----- $typeOfProduct Condiments Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}