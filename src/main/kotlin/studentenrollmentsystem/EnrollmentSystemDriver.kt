package studentenrollmentsystem



fun main(){
    val student = Student()
    student.addStudent("Jess",19,"Male","09765406033","jess@yahoo.com","BS Biology")
    student.displayStudentInfo()
    student.removeStudent("Juan")
    student.displayStudentInfo()

    val course = Course()
    course.addStudent("Jones","BSC")
    course.removeStudent("Mia","BSCpE")
    course.displayCourseInformation()
}