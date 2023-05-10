package ooppracticeactivities.ooppracticeactivity5

class Student(var name:String, var age:Int,var grade:Int) {

    fun promote(){
        age +=1
        grade +=1
        println("Student Name: $name")
        println("Age: $age")
        println("Grade: $grade\n")
    }
}