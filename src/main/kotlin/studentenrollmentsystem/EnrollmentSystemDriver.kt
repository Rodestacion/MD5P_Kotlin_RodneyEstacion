package studentenrollmentsystem

fun main(){
    var student = Student()
    student.addStudent("Rodney",14,"Male","09765406033","rodney@yahoo.com")
    student.removeStudent("Rodney")

    var course = Course()
    course.addStudent("Jones","BSC")
}