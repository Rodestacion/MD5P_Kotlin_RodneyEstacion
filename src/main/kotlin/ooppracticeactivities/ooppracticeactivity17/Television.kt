package ooppracticeactivities.ooppracticeactivity17

class Television:ElectronicDevice {
    override fun turnOn() {
        println("Power On, no channel signal")
    }

    override fun turnOff() {
        println("Power Off, television is on standby mode")
    }
}