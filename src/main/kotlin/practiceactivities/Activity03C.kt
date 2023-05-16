package practiceactivities

fun main(){
    //Covered Topic(s) : Functions
    //Instructions :
    //1. Create an ArrayList of grocery products with 20 entries.
    //2. Create a HashMap called Cart.
    //Hint:  Hashmap<String, Int>
    //2. Create a function "addToCart" that will accept a String and an Int, that will add the input in the Hashmap. If the Entry already exists, create a new entry in the HashMap.
    //Hint : you may add a "_01", "_02"
    //Example Coke_01, Coke_02
    //3. Create a function "checkOut". This will compute how many items have been checked out.
    //4. Create a function "removeFromCart"  that will accept a String and remove the input from the Hashmap. If there are multiple entries, remove all from the HashMap.

    var groceryProduct = mutableListOf<String>("Applesauce","Sugar","Tabasco Sauce","French Fries","Marshmallows","Red Chile Powder",
        "Sesame Seeds","Wine","Chicken","Flour","Pasta","Cranberries","Pumpkin Seeds",
        "Condensed Milk","Beef","Coconut Milk","Canola Oil","Garlic Powder","Curry Leaves","Gelatin"
    )
    var cart = hashMapOf<String,Int>()

    while (true){
        try {
            var option: Int = 0
            var inputText: String = ""
            var inputCount: Int = 0
            println("[1] Add from Cart")
            println("[2] Check Out")
            println("[3] Remove from Cart")
            println("[4] Exit")
            print("Select your option: ")
            option = readln().toInt()

            when (option){
                1->{
                    println(groceryProduct)
                    print("Input name of item to add: ")
                    inputText = readln()
                    print("How many items?: ")
                    inputCount = readln().toInt()

                    if(checkExist(groceryProduct,inputText)){
                        val cartTemp = addToCart(groceryProduct, inputText,inputCount, cart)
                        cart.clear()
                        cart = cartTemp
                    }else{
                        println("Input item is not in the selection of grocery product")
                    }

                }
                2->{
                    checkOut(groceryProduct, cart)
                }
                3->{
                    println(cart)
                    print("Input item to remove ")
                    inputText = readln()
                    println(cart)

                    if(checkExist(groceryProduct,inputText)){
                        val cartTemp = removeFromCart(groceryProduct, inputText, cart)
                        cart.clear()
                        cart = cartTemp
                    }else{
                        println("Input item is not in the cart")
                    }


                }
                4->{
                    break
                }

            }
            println()
        }catch (exception:Exception){
            println("Invalid Input")
        }
    }
}

fun addToCart(groceryProduct: MutableList<String>, searchItem: String, inputCount: Int, cart: HashMap<String, Int>): HashMap<String, Int> {
    var number :Int = 0
    var answer:String = ""
    var extension :Int = 1
    var duplicate :Boolean = false
    val tempCart=hashMapOf<String, Int>()

    while (number<groceryProduct.size){
            if(groceryProduct.elementAt(number).uppercase()==searchItem.uppercase()){
                answer = groceryProduct.elementAt(number)
                break
            }
            number++
    }

    for (text in cart){
        if(text.key.contains(answer)){
                val tempInt = text.value
                val tempKey = "${answer}_$extension"
                tempCart[tempKey]=tempInt
                duplicate=true
                extension++
        }else{
                tempCart[text.key]=text.value
        }
    }

    if(duplicate){
            tempCart["${answer}_$extension"] = inputCount
    }else{
            tempCart[answer] = inputCount
    }

    return tempCart
}
fun checkOut(groceryProduct: MutableList<String>, cart: HashMap<String, Int>){
    var number : Int = 0
    var total : Int = 0
    println("Count\tProduct Name")
    while (number<groceryProduct.size){
        var sum:Int = 0
        for (text in cart){
            if(text.key.contains(groceryProduct.elementAt(number))){
                sum+=text.value.toInt()
            }
        }
        if(sum>0){
            println("$sum\t\t\t${groceryProduct.elementAt(number)}")
            total+=sum
        }
        number++
    }
    println("---Nothing Follows---")
    println("Total is: $total")


}

fun removeFromCart(groceryProduct: MutableList<String>, searchItem: String, cart: HashMap<String, Int>): HashMap<String, Int> {
    var number :Int = 0
    var answer:String = ""
    val tempCart=hashMapOf<String, Int>()

    while (number<groceryProduct.size){
        if(groceryProduct.elementAt(number).uppercase()==searchItem.uppercase()){
            answer = groceryProduct.elementAt(number)
            break
        }
        number++
    }

    for (text in cart){
        if(text.key.contains(answer)){
            continue
        }else{
            tempCart[text.key]=text.value
        }
    }
    return tempCart
}

fun checkExist(groceryProduct:MutableList<String>,searchItem:String): Boolean{
    var number :Int = 0
    var answer:Boolean = false

    while (number<groceryProduct.size){
        if(groceryProduct.elementAt(number).uppercase()==searchItem.uppercase()){
            answer = true
            break
        }
        number++
    }

    return answer
}

