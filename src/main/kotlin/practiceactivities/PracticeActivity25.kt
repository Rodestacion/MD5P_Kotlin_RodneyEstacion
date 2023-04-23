package practiceactivities

fun main(){
    var baseNumber: Int = 0
    var spaceNumber: Int = 0
    var displaySymbol : String = ""

    //1st println()
    print("Enter base size of dollar triangle: ")
    baseNumber = readln().toInt()
    
    //Handle of number of space
    spaceNumber = baseNumber

    repeat(baseNumber){

        repeat(baseNumber){counter2->
            //print spacing
            if(counter2<spaceNumber-1){
                displaySymbol = " "
            }
            //print dollar sign
            else{
                displaySymbol = "$"
            }
            //2nd println()
            print(displaySymbol)
        }
        //3rd println()
        println()
        spaceNumber--

    }

}