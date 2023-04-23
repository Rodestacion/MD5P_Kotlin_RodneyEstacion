package kotlinprograms
fun main(){
    //maps - key - value pair structure immutable
    //<key> to <value>
    //traverse

    //var fruits = mapOf(1 to "Apple",5 to "Banana",7 to "Grapes")
    //var fruits = mapOf(-1 to "Apple",-5 to "Banana",-7 to "Grapes") //acceptable negative integer
    var fruits = mapOf('a' to "Apple",'b' to "Banana",'c' to "Grapes") //acceptable letter
    println(fruits['b'])
    println(fruits)

    //println(fruits[6])
    //println(fruits[-1])
    //println(fruits['a'])

    for ((id, element) in fruits){
        println("Key is $id and value is $element")
    }

    var fruits2 = mutableMapOf<Int, String>()
    fruits2[1] = "Melon"
    fruits2[2] = "Watermelon"
    fruits2[5] = "Papaya"
    println(fruits2)
    fruits2.remove(2)
    fruits2.replace(5,"Tamarind")
    println(fruits2)

}