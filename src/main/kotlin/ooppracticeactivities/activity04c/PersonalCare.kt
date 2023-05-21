package ooppracticeactivities.activity04c

class PersonalCare {
    private val productName:String = "Potencee +Zinc Ascorbic Acid"
    private val typeOfProduct:String = "Vitamins"
    private val manufacturer:String = "Pascual Laboratories, Inc."
    private val sizeOfProduct:Double=30.0
    private val sizeUnit:String = "pcs"
    private val priceOfProduct: Double = 241.75

    fun displayItem(){
        println("----- $typeOfProduct Personal Care Information -----")
        println("Product Name: $productName")
        println("Manufactured: $manufacturer")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("*************************************")
        println()
    }
}