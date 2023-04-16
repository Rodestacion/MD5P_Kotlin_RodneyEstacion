fun main(){
    //var passengerType: Char ='0' //error in readln()
    var typeStatus: String = "OK"
    //var businessClass: Char = '0'
    var classStatus: String = "OK"
    var fare : Double = 0.00
    var discount : Double = 0.00
    var charge : Double = 0.00
    var newFare : Double = 0.00

    println("Fare Code \tPassenger\t\tDiscount\tIf travelling in business class")
    println("O \t\t\tOrdinary\t\t0%\t\t\tadditional 1000.0")
    println("S \t\t\tStudent\t\t\t5%\t\t\tadditional 700.0")
    println("C \t\t\tSenior Citizen\t10%\t\t\tadditional 500.0\n")

    println("Enter fare")
    fare = readln().toDouble()
    println("Passenger type [O,S,C]:  ")
    var passengerType = readln()
    println("Traveling in business class [Y/N]: ")
    var businessClass = readln()  // readln().first execute the computation even input is YN

    when(passengerType){
        //Ordinary
        'O'.toString() ->{
            discount = 0.00 * fare
            charge = 1000.00
        }
        //Standard
        'S'.toString() ->{
            discount = 0.05 * fare
            charge = 700.00
        }
        //Senior Citizen
        'C'.toString() ->{
            discount = 0.10 * fare
            charge = 500.00
        }
        else ->{
            typeStatus = "NG"
        }
    }

    when(businessClass){
        //Yes
        'Y'.toString() ->{
            newFare = fare -discount + charge
        }
        //No
        'N'.toString() ->{
            charge = 0.00
            newFare = fare -discount
        }
        else ->{
            classStatus = "NG"
        }
    }

    if((classStatus=="OK")&&(typeStatus =="OK")){
        println("Discount is ${String.format("%.2f",discount)}")
        println("Business class charge is ${String.format("%.2f",charge)}")
        println("New fare is ${String.format("%.2f",newFare)}")
    }
    else{
        println("Discount is 0.00")
        println("Business class charge is 0.00")
        println("New fare is 0.00")

        println("Your input are not on the selection")
    }
}