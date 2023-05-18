package ooppracticeactivities.ooppracticeactivity15

class PartTimeEmployee(private val workHours:Double):Employee() {
    private val hourRate:Double = 143.50
    override fun calculateEarnings(): Double {
        return workHours*hourRate
    }


}