package kotlinprograms

fun main(){
    //array
    //any data type
    //var names = arrayOf("Paul","John","Ringo","George")
    //only strings
    var names = arrayOf<String>("Paul","John","Ringo","George")
    println("array size is ${names.size}")
    //println(names) // error [Ljava.lang.String;@27973e9b

    //changes value in an array
    //names[3]="Ely"
    var ctr:Int =0
    while (ctr < names.size){
        println(names[ctr])
        ctr++
    }


}