package practiceactivities

fun main(){
    var studentName : String = "no name"
    var physicsGrade : Double = 0.00
    var algebraGrade : Double = 0.00
    var programmingGrade : Double = 0.00
    var average : Double = 0.00

    println("Enter name: ")
    studentName = readln()
    println("Enter grade in Physics: ")
    physicsGrade = readln().toDouble()
    println("Enter grade in Algebra: ")
    algebraGrade = readln().toDouble()
    println("Enter grade in Programing: ")
    programmingGrade = readln().toDouble()

    average = (physicsGrade + algebraGrade + programmingGrade)/3

    if(average<78){
        println("$studentName average grade is ${String.format("%.2f",average)}")
        println("Failure")
    }
    else if(average <= 82) {
        println("$studentName average grade is ${String.format("%.2f",average)}")
        println("Fair")
    }
    else if(average<=88){
        println("$studentName average grade is ${String.format("%.2f",average)}")
        println("Average Student")
    }
    else if(average<=94){
        println("$studentName average grade is ${String.format("%.2f",average)}")
        println("Dean Lister")
    }
    else if(average<=100){
        println("$studentName average grade is ${String.format("%.2f",average)}")
        println("President Lister")
    }
    else {
        println("Invalid grade")
    }

}