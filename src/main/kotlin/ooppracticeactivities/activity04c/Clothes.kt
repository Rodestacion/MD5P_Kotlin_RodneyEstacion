package ooppracticeactivities.activity04c

class Clothes {
    private val productName:String = "Converse Men's Exotic Lizards Tee in White"
    private val typeOfProduct:String = "Apparel-Men"
    private val manufacturer:String = "Converse"
    private val sizeOfProduct:Double= 1.0
    private val sizeUnit:String = "S/M/L/XL"
    private val priceOfProduct: Double = 774.50

    fun displayItem(){
        println("----- $typeOfProduct Clothes Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}