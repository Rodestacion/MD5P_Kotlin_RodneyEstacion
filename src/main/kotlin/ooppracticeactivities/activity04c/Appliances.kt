package ooppracticeactivities.activity04c

class Appliances {
    private val productName:String = "Carrier Split Type Aircon Alpha Series Inverter 1HP"
    private val typeOfProduct:String = "Split Type Aircon"
    private val model:String = "FP-53GCVBE010-303P"
    private val powerConsumption:String = "800 watts"
    private val manufacturer:String = "Carrier"
    private val dimension: String = "78.5 × 29.4 × 88.2 cm"
    private val sizeOfProduct:Double =29.0
    private val sizeUnit:String = "kg."
    private val priceOfProduct:Double = 31200.00
    private val features:String="Thunder Surge Protection and Noise Filter, Fireproof Electrical Box and Double Clean System"

    fun displayItem(){
        println("----- $typeOfProduct Appliance Information -----")
        println("Product Name: $productName")
        println("Model No.: $model")
        println("Manufactured: $manufacturer")
        println("Power Consumption: $powerConsumption")
        println("Dimension: $dimension")
        println("Size: $sizeOfProduct $sizeUnit")
        println("Product Price: $priceOfProduct")
        println("Features: $features")
        println("*************************************")
        println()
    }
}