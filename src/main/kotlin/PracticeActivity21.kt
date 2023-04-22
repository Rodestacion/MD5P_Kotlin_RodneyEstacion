fun main() {
    var ctr1= 0

    //Display output
    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5
    while(ctr1<6){
        var ctr2=0
        while(ctr2<ctr1){
            print("${ctr2+1} ")
            ctr2++
        }
        println()
        ctr1++
    }
}