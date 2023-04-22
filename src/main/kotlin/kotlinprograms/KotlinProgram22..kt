package kotlinprograms

fun main(){
    //list - immutable cannot be change
    var beatles = listOf<String>("Paul","John","Ringo","George")
    println("List size is ${beatles.size}")
    //println(beatles) //output [Paul, John, Ringo, George]
    //beatles [0] = "Ely" //cannot be replace

    var ctr:Int =0
    while (ctr < beatles.size){
        println(beatles[ctr])
        ctr++
    }

    println("***************")
    //mutable - can be changed
    var rivermaya = mutableListOf<String>("Bamboo","Rico","Perf","Juan")
    rivermaya.removeAt(0) //remove Bamboo
    rivermaya.remove("Rico") //remove Rico by calling the name
    rivermaya.add("John") //add value on the last
    rivermaya.add(2,"Peter") //add Peter 2nd to the last

    var ctr2:Int =0
    while (ctr2 < rivermaya.size){
        println(rivermaya[ctr2])
        ctr2++
    }
    
}