package kotlinprograms

fun main() {
    //outer loop
    var ctr1= 0
    while(ctr1<10){
        //inner loop
        var ctr2=0
        while(ctr2<10){
            print("*")
            ctr2++
        }
        println()
        ctr1++
    }
}