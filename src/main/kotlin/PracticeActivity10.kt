fun main(){
    var productName: String = "no name"
    var price: Double = 0.00
    var discount: Double = 0.00

    println("Enter product name: ")
    productName = readln()
    println("Enter price: ")
    price = readln().toDouble()

    if ((price>=0)&&(price<=10000)){
        discount = 0.00
    }
    else if((price>=10001)&&(price<=20000)){
        discount = price * 0.05
    }
    else if((price>=20001)&&(price<=50000)){
        discount = price * 0.1
    }
    else if((price>=50001)&&(price<=100000)){
        discount = price * 0.15
    }
    else if(price>100000){
        discount = price * 0.2
    }
    else{
        println("Invalid Part number")
    }

    println("Price of $productName is $price")
    println("Discount is ${String.format("%.2f",discount)}")
    println("Net Price is ${String.format("%.2f",price)}")
}