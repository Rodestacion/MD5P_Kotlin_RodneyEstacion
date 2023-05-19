package ooppracticeactivities.ooppracticeactivity17

class Smartphone: ElectronicDevice {
    override fun turnOn() {
        println("Power On, open recently closed apps")
    }

    override fun turnOff() {
        println("Power Off, locked screen activate")
    }
}