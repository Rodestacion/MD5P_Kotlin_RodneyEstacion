package ooppracticeactivities.activity04c

class Pet {
    private val productName:String = "Beggin Treats Bacon & Cheese"
    private val typeOfProduct:String = "Dog Food"
    private val manufacturer:String = "Nestle Purina Pet"
    private val sizeOfProduct:Double=170.0
    private val sizeUnit:String = "g"
    private val priceOfProduct:Double = 225.0

    fun displayItem(){
        println("----- $typeOfProduct Pet Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}