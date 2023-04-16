fun main(){
    var productName: String = "no name"
    var price: Double = 0.00
    var discount: Double = 0.00
    println("Enter product name: ")
    productName = readln()
    println("Enter price: ")
    price = readln().toDouble()

    if ((price>=0)&&(price<=10000)){
        println("Price of $productName is $price")
        discount = price * 0
        println("Discount is ${String.format("%.2f",discount)}")
        println("Net Price is ${String.format("%.2f",price-discount)}")
    }
    else if((price>=10001)&&(price<=20000)){
        println("Price of $productName is $price")
        discount = price * 0.05
        println("Discount is ${String.format("%.2f",discount)}")
        println("Net Price is ${String.format("%.2f",price-discount)}")
    }
    else if((price>=20001)&&(price<=50000)){
        println("Price of $productName is $price")
        discount = price * 0.1
        println("Discount is ${String.format("%.2f",discount)}")
        println("Net Price is ${String.format("%.2f",price-discount)}")
    }
    else if((price>=50001)&&(price<=100000)){
        println("Price of $productName is $price")
        discount = price * 0.15
        println("Discount is ${String.format("%.2f",discount)}")
        println("Net Price is ${String.format("%.2f",price-discount)}")
    }
    else if(price>100000){
        println("Price of $productName is $price")
        discount = price * 0.2
        println("Discount is ${String.format("%.2f",discount)}")
        println("Net Price is ${String.format("%.2f",price-discount)}")
    }
}