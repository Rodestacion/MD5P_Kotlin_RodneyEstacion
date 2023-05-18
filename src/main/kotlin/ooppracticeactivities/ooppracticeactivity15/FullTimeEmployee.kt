package ooppracticeactivities.ooppracticeactivity15

class FullTimeEmployee:Employee() {
    private val monthlySalary:Double = 30000.0
    override fun calculateEarnings(): Double {
        return this.monthlySalary
    }

    fun calculateEarnings(overtime:Double):Double {
        return (((this.monthlySalary*12)/313)/8)*overtime
    }
}