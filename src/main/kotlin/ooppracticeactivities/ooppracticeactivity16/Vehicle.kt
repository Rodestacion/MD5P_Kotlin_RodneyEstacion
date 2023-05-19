package ooppracticeactivities.ooppracticeactivity16

abstract class Vehicle(brand:String,year:Int) {
    abstract fun start()
    abstract fun stop()
    open fun accelerate() { }

}