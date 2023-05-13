package ooppracticeactivities.ooppracticeactivity9

fun main(){

    println("First Constructor")
    val newCar1 = Car("Toyota","Innova")
    println("Car Maker: ${newCar1.maker}")
    println("Car Model: ${newCar1.model}")
    println("Model Year: ${newCar1.year}")

    println("Second Constructor")
    val newCar2 = Car("Suzuki","Ertiga",2023)
    println("Car Maker: ${newCar2.maker}")
    println("Car Model: ${newCar2.model}")
    println("Model Year: ${newCar2.year}")
}