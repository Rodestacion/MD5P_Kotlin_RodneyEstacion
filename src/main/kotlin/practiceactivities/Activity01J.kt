package practiceactivities

import javax.swing.JCheckBoxMenuItem

fun main(){
    //Using Activity 01 - C
    //Implement a process where items are added to the grocery cart.
    //User : Cashier
    //Goal : List of Items bought, how many items were bought and total cost.

    val groceryItem = mutableListOf(
        mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10),//selection
        mutableListOf<Double>(45.0,27.0,70.0,1399.0,326.0,45.0,44.5,190.0,25.0,68.0),//price
        mutableListOf<String>("Coca Cola Litro","Ketchup","Coffee 3in1","Nido 2.4 kg","Canola oil Double pack","Yakult","Sugar 1/2 kl","Tender Juicy 1kl","Sinigang Original Mix","Gardenia Bread"),//product name
        mutableListOf<Int>(11,12,13,14,15,16,17,18,19,20)//stock quantity
    )
//    val cart = arrayListOf(
//        arrayListOf<Int>(),
//        arrayListOf<Double>(),
//        arrayListOf<String>()
//    )
//    val cart = mutableListOf(
//        mutableListOf<String>(),
//        mutableListOf<String>(),
//        mutableListOf<String>()
//    )

    val cart = mutableListOf(
        mutableListOf<Any>(),
        mutableListOf<Any>(),
        mutableListOf<Any>()
    )

    var totalAmount : Double = 0.0
    var totalItem : Int = 0
    var select :Int = 0
    var addCart : Int = 0
    var addItem: Int = 0
    var addAmount: Double = 0.0

    while(true){
        try {
            println("No.\t\tPrice\t\tItem Name")
            repeat(10) { column ->
                0
                repeat(3) {
                    print(" ${groceryItem[it][column]}\t\t")
                }
                println()
            }
            println("\nCart amount: $totalAmount")
            println("[1] Add cart")
            println("[2] Check out")
            print("Select action: ")
            select = readln().toInt()

            when (select) {
                1 -> {
                    print("\nWhat is the Item number to add?")
                    addCart = readln().toInt()

                    if (addCart <= 0 || addCart > 11) {
                        println("Invalid Input")
                    } else {
                        print("How many items?")
                        addItem = readln().toInt()
                        if (addItem <= 0) {
                            println("Invalid Input")
                        } else {
                            totalItem += addItem
                            addAmount = (groceryItem[1].elementAt(addCart - 1) as Double) * addItem
                            totalAmount += addAmount

//                        cart[0].add(cart[0].size, addItem.toString())
//                        cart[1].add(cart[1].size, addAmount.toString())
//                        cart[2].add(cart[2].size, groceryItem[2].elementAt(addCart-1).toString())


                            cart[0].add(cart[0].size, addItem.toInt())
                            cart[1].add(cart[1].size, addAmount.toDouble())
                            cart[2].add(cart[2].size, groceryItem[2].elementAt(addCart - 1).toString())
                        }
                    }
                }

                2 -> {
                    if (totalAmount == (0).toDouble()) {
                        println("Cart is empty")
                    } else {
                        println("\t\t\tPrint receipt")
                        println("Count\t\tPrice\t\tItem Name")

                        repeat(cart[0].size) {
                            repeat(cart.size) { count ->
                                0
                                print("${cart[count][it]}\t\t\t")
                            }
                            println()
                        }
                        println("Total amount: $totalAmount")
                        println("Total item count: $totalItem")
                    }
                    break
                }
            }
        }catch (exception:Exception){
            println("Invalid input")
        }
    }
}