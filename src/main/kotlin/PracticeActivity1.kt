fun main(){
    //initialize variable
    var areaTriangle : Int = 0
    var base :Int =0
    var height : Int = 0
    var a : Int = 0
    var b: Int = 0
    var c: Int = 0

    //input
    println("Enter Triangle base: ")
    base = readln().toInt()
    println("Enter Triangle height: ")
    height = readln().toInt()
    println("Enter value of a: ")
    a = readln().toInt()
    println("Enter value of b: ")
    b = readln().toInt()

    //process
    areaTriangle = (base * height)/2
    c= ((a*2)+(2*a*b)-(4*(b+a)))/2

    //output
    println("The Area of Triangle is $areaTriangle")
    println(" The value of c is $c")
}