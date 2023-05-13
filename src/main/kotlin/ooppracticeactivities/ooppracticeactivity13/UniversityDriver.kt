package ooppracticeactivities.ooppracticeactivity13

fun main(){
    val universityObject = University()
    val studentObject = universityObject.Student()

    studentObject.callUniversity("Juan Dela Cruz",12345)

    println("School Name: ${universityObject.name}")
    println("Student Name: ${studentObject.name}")
    println("Student ID: ${studentObject.id}")

}