package practiceactivities
fun main(){
    //Create an application that will accept 5 monetary amounts.
    //After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
    //The total of the 5  inputs will be divided by the answer in the second question input.

    while (true){
        //var money = mutableListOf<Int>()
        var amount1:Int = 0
        var amount2:Int = 0
        var amount3:Int = 0
        var amount4:Int = 0
        var amount5:Int = 0
        var divisor : Int = 0
        var total : Int = 0
        var share : Double = 0.0

        println("Enter 5 value")
        try {
//            repeat(5){
//                print("Input value [#${it+1}]: ")
//                money.d(readln().toInt())ad
//            }
            print("Input value [1]: ")
            amount1 = readln().toInt()
            print("Input value [2]: ")
            amount2 = readln().toInt()
            print("Input value [3]: ")
            amount3 = readln().toInt()
            print("Input value [4]: ")
            amount4 = readln().toInt()
            print("Input value [5]: ")
            amount5 = readln().toInt()

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

            //total = money.sum()
            total = amount1 + amount2 + amount3 + amount4 + amount5
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