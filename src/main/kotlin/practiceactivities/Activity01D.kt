package practiceactivities
fun main(){
    //Create an application that will accept 5 monetary amounts.
    //After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
    //The total of the 5  inputs will be divided by the answer in the second question input.

    while (true){
        var money = mutableListOf<Int>()
        var divisor : Int = 0
        var total : Int = 0
        var share : Double = 0.0

        println("Enter 5 value")
        try {
            repeat(5){
                print("Input value [#${it+1}]: ")
                money.add(readln().toInt())
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

            total = money.sum()
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