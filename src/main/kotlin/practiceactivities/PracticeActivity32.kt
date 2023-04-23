package practiceactivities

fun main() {
    var athleteName = ArrayList<String>()
    var athleteSales = ArrayList<Double>()
    //var rankCounter : Int = 0
    var counter: Int = 0
    var totalSales: Double = 0.0

    //input 5 numbers
    while (counter < 5) {
        print("Enter Athlete ${counter + 1}: ")
        athleteName.add(readln())
        print("Enter sales: ")
        athleteSales.add(readln().toDouble())
        counter++
    }

    //var sortedSales = athleteSales.sortedDescending() //
    //println(sortedSales)
    //println(athleteSales)


    //Output display
    println("Top SportsMan")
    println("Name\t\tSales")
    println("===================================")

    /*counter=0
    do{
        repeat(5){
            if(sortedSales.elementAt(counter)==athleteSales.elementAt(it)){
                rankCounter++
                print("${athleteName.elementAt(it)}\t\t$")
                println(athleteSales.elementAt(it))
                totalSales += athleteSales.elementAt(it)
            }
        }
        counter++
    }while(rankCounter<5) */

    counter=0
    while(counter<5){
        print("${athleteName.elementAt(counter)}\t\t$")
        println(athleteSales.elementAt(counter))
        totalSales += athleteSales.elementAt(counter)
        counter++
    }

    println("===================================")
    println("Total\t\t$${String.format("%.2f",totalSales)}")
}