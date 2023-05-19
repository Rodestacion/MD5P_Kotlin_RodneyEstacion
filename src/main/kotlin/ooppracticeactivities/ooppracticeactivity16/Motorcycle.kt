package ooppracticeactivities.ooppracticeactivity16

class Motorcycle(private var brand:String,private var year:Int):Vehicle(brand, year) {

    override fun start() {
        println("Press the start button, and hold it until the motor start.")
    }

    override fun stop() {
        println("Slightly brake, until completely stop")
    }

    override fun accelerate(){
        println("Turn throttle to accelerate")
    }
    fun displayInfo(){
        println("Brand is: $brand")
        println("Model year is: $year")
    }

}