package ooppracticeactivities.ooppracticeactivity16

class Car(private var brand:String,private var year:Int):Vehicle(brand, year) {

    override fun start() {
        println("Clutch down and press break then start the engine")
    }

    override fun stop() {
        println("Clutch down, then press brake to stop")
    }

    override fun accelerate(){
        println("Press accelerator to accelerate")
    }

    fun displayInfo(){
        println("Brand is: $brand")
        println("Model year is: $year")
    }
}