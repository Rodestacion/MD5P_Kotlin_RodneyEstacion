package kotlinprograms

fun main(){
    //arraylist - mutable
    var names = ArrayList<String>()
    //names.add("John")
    //names.add("Peter")
    //names.add("Mary")

    println("Enter name 1: ")
    names.add(readln())
    println("Enter name 2: ")
    names.add(readln())
    println("Enter name 3: ")
    names.add(readln())

    var ctr2:Int =0
    while (ctr2 < names.size){
        println(names[ctr2])
        ctr2++
    }
}