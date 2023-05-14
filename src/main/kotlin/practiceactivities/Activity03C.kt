package practiceactivities
fun main(){
    //Covered Topic(s) : Functions
    //Instructions :
    //1. Create an ArrayList of grocery products with 20 entries.
    //2. Create a HashMap called Cart.
    //Hint:  Hashmap<String, Int>
    //2. Create a function "addToCart" that will accept a String and an Int, the it will add the input in the Hashmap. If the Entry already exists, create a new entry in the HashMap.
    //Hint : you may add a "_01", "_02"
    //Example Coke_01, Coke_02
    //3. Create a function "checkOut". This will compute how many items have been checked out.
    //4. Create a function "removefromCart"  that will accept a String and remove the input from the Hashmap. If there are multiple entries, remove all from the HashMap.

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
                    print("Input name of item to add: ")
                    inputText = readln()
                    print("How many items?: ")
                    inputCount = readln().toInt()

                    if(addToCart(groceryProduct,inputText)){
                        cart[inputText] = inputCount
                        println(cart)
                    }


//                    if(addToCart(groceryProduct,inputText)){
//                        println("Sorry! Item $inputText not listed in ")
//                    }else{
//                        groceryProduct.add(inputText)
//                        println("Item Add successfully")
//                    }
                }
                2->{
                    checkOut(cart)
                }
                3->{
                    print("Input item to remove ")
                    inputText = readln()
                    println(cart)
                    cart.remove(inputText)
                    println(cart)

//                    if (removeFromCart(groceryProduct,inputText) <0){
//                        println("Sorry! Book $inputText is not exist in the list")
//                    }else{
//                        groceryProduct.removeAt(removeFromCart(groceryProduct,inputText))
//                        println("Book Remove successfully")
//                    }
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

fun addToCart(groceryProduct:MutableList<String>,searchItem:String): Boolean {
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
fun checkOut(cart: HashMap<String, Int>){
    repeat(cart.size){
        println(cart)
    }
}

fun removeFromCart(groceryProduct:MutableList<String>,searchItem:String): Int {
    var remove: Int = -1
    var number :Int = 0

    while (number<groceryProduct.size){
        if(groceryProduct.elementAt(number).uppercase()==searchItem.uppercase()){
            remove = number
            break
        }
        number++
    }
    return remove
}

