package kotlinprograms

fun main(){
    //for loop

    for (counter in 5..10){ // type 5..10
        if(counter ==7){
            continue
        }
        println(counter)
    }
    println("Hello World!")
}