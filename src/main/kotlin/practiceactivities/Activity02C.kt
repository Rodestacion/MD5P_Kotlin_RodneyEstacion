package practiceactivities
fun main(){
    //Implement Activity 01 - C using data structure.

    var product = mapOf<String,String>("4800361418645" to "NIDO 3+ Advance 2.4 kg.") //barCode & Description

    var productInformation = mutableListOf(
        mutableListOf<String>("4800361418645"),     //barCode
        mutableListOf<String>("NIDO 3+ Advance"),   //productName
        mutableListOf<String>("Milk"),              //productType
        mutableListOf<String>("Nestle"),            //productBrand
        mutableListOf<Double>(2.4),                 //productSize
        mutableListOf<String>("kg"),                //sizeUnit
        mutableListOf<Int>(12),                     //shelfStock
        mutableListOf<Double>(1344.00),             //sellingPrice
        mutableListOf<String>("Infant"),            //shelfSection
        mutableListOf<String>("SH2-L03")            //shelfLocation
    )

    var productInventoryInformation = mutableListOf(
        mutableListOf<String>("4800361418645"),     //barCode
        mutableListOf<String>("Trade Ford"),        //supplierName
        mutableListOf<Int>(24),                     //supplyQuantity
        mutableListOf<String>("WH-SW-004")          //storageLocation
    )
}