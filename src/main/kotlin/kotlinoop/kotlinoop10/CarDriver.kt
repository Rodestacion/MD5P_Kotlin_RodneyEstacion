package kotlinoop.kotlinoop10

fun main(){
    var myCar = Car("Toyota","Corolla",2001)

    myCar.accelerate()
    myCar.refuel()


    myCar.accelerate(100.0)
    myCar.displayInfo()
}