package practiceactivities
fun main(){
    //Implement Activity 01 - D using data structure.

    while (true){
        var money = mutableListOf<Int>() //data structure mutableListOf
        var divisor : Int = 0
        var total : Int = 0
        var share : Double = 0.0

        println("Enter 5 value")
        try {
            repeat(5){
                print("Input value [#${it+1}]: ")
                money.add(readln().toInt()) //mutableListOf add new element
            }

            while (true){
                try{
                    print("Divide the value by how many? ")
                    divisor = readln().toInt()
                    if(divisor<1){
                        throw NumberFormatException()
                    }
                    break
                }catch (exception:NumberFormatException){
                    println("Invalid divisor. Must be input a positive integer\n")
                }
            }

            total = money.sum() //mutableListOf sum function
            share = total.toDouble()/divisor

            println("The total amount is: $total")
            println("The amount divisible by $divisor is: ${String.format("%.2f",share)}")


            break
        }
        catch (exception:NumberFormatException){
            println("Invalid input. Repeat All Inputs\n")
        }
    }
}