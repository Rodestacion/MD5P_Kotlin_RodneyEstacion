package ooppracticeactivities.ooppracticeactivity16

fun main(){
    val car = Car("Suzuki",2023)
    car.displayInfo()
    car.start()
    car.accelerate()
    car.stop()

    println()

    val motorcycle = Motorcycle("Honda",2015)
    motorcycle.displayInfo()
    motorcycle.start()
    motorcycle.accelerate()
    motorcycle.stop()
}