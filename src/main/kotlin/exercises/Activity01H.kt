package exercises
fun main(){
    //Create an application that will accept 2 Integers.
    //It will identify the lower value and bigger value of the two inputs.
    //Then, your application will print all the prime numbers starting from the lower number up to the largest number.

    var firstNumber : Int = 0
    var secondNumber : Int = 0
    var maximumValue : Int = 0
    var minimumValue : Int = 0
    var output: String = ""

    while(true){
        try {
            print("Enter first number: ")
            firstNumber = readln().toInt()
            print("Enter second number: ")
            secondNumber = readln().toInt()

            if(firstNumber==secondNumber){
                throw UnsupportedOperationException()
            }else{
                if(firstNumber>secondNumber){
                    maximumValue = firstNumber
                    minimumValue = secondNumber
                }else{
                    maximumValue = secondNumber
                    minimumValue = firstNumber
                }
            }

            output = checkPrimeNumber(minimumValue,maximumValue)

            println("Prime number between $minimumValue to $maximumValue -> $output")

            break
        }catch (exception:NumberFormatException){
            println("Invalid input. Enter Integer number only\n")
        }catch (exception:java.lang.UnsupportedOperationException){
            println("Invalid input. Both integer should not have same value\n")
        }
    }

}

fun checkPrimeNumber(num1:Int,num2:Int):String{
    var count1:Int = 0  //counter in 1st loop
    var count2:Int = 0  //counter in 2nd loop
    var limit :Int = 0
    var primeCount:Int = 0
    var numList = mutableListOf<Int>()
    var remainder : Int = 0
    var output:String = ""

    count1 = num1

    if(Math.abs(num1)>num2){
        limit =Math.abs(num1) //set 2nd loop end, use the absolute value of negative integer if higher than to positive integer
    }else{
        limit = num2
    }

    while (count1 <= num2){
        count2 = 2
        primeCount = 0

        if(count1==-1||count1==1){
            numList.add(count1)
        }else {
            while (count2 <= limit) {
                remainder = count1 % count2
                if (remainder == 0) {
                    primeCount++
                    if (primeCount > 1) {
                        break //end the 2nd loop, consider more than two count as non-prime number
                    }
                }
                count2++
            }

            if (primeCount == 1) {
                numList.add(count1)
            }
        }
        count1++
    }

    repeat(numList.size){
        if(it==(numList.size-1)){
            output += numList.elementAt(it)
        }else{
            output = output + numList.elementAt(it) + ", "
        }
    }
    return output
}