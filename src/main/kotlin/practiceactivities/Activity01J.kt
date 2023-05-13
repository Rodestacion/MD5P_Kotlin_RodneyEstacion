package practiceactivities
fun main(){
    //Using Activity 01 - C
    //Implement a process where items are added to the grocery cart.
    //User : Cashier
    //Goal : List of Items bought, how many items were bought and total cost.

    var groceryItem = mutableListOf(
        mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10),//selection
        mutableListOf<String>("Coca Cola Litro","Ketchup","Coffee 3in1","Nido 2.4 kg","Canola oil Double pack","Yakult","Sugar 1/2 kl","Tender Juicy 1kl","Sinigang Original Mix","Gardenia Bread"),//product name
        mutableListOf<Double>(45.0,27.0,70.0,1399.0,326.0,45.0,44.5,190.0,25.0,68.0),//price
        mutableListOf<Int>(11,12,13,14,15,16,17,18,19,20)//stock quantity
        //mutableListOf<String>(),//product name
    )

    var cart = mutableListOf(
        mutableListOf<String>(),//product name
        mutableListOf<Int>(),//order number
        mutableListOf<Double>()//total amount
    )

    var total : Double = 0.0

    //to move in while loop
    repeat(10){column->0
        repeat(4){
            print(" ${groceryItem[it][column]}\t")
        }
        println()
    }
    var answer: Boolean = true
    while(answer){

        println("[1] Add cart")
        println("[2] Check out")

        when(1){
            1->{
                println("Add to cart")
                println(groceryItem[2][0])
                //cart[2].add(groceryItem[2].indexOf(0))
                //println(cart[2][0])
                groceryItem[2]
                //cart[2].add(groceryItem[2].elementAt(0) as Nothing)


                answer= false //for remove
            }
            2->{
                //cart[2].add(groceryItem[2].elementAt(0) as Nothing)
                println("Checkout")
                // 1 replace variable of row size
                repeat(1){
                //    total = total + cart[2][it]

                }

                println(total)

                answer= false

            }

        }


    }


}