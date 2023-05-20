package studentenrollmentsystem

class Course(){
    private var courseID = mutableListOf<String>("BSC","BSIT","BSCpE")
    private var courseName = mutableListOf<String>("Bachelor of Science in Computer Science", "Bachelor of Science in Information Technology","Bachelor of Science in Computer Engineering")
    private var instructorName = mutableListOf<String>("Samonte","Salac","Destrza")
    private var maxStudents = mutableListOf<Int>(40,50,25)
    private var studentEnrolled = mutableListOf(
        mutableListOf<String>("William","Olivia","Jack"),
        mutableListOf<String>("Noah","Oliver","Ava"),
        mutableListOf<String>("Emma","Mia","Benjamin"))


    fun addStudent(name:String,courseId:String){
        val courseIndex = this.courseID.indexOf(courseId)

        this.studentEnrolled[courseIndex].add(name)

        println("Student name $name was successfully add in Course $courseId")
    }

    fun removeStudent(name:String,courseId:String){
        val courseIndex = this.courseID.indexOf(courseId)

        this.studentEnrolled[courseIndex].remove(name)

        println("Student name $name was successfully remove in Course $courseId")
    }

    fun displayCourseInformation(){
        repeat(courseID.size){
            println("\n*******************")
            println("Course ID: ${courseID.elementAt(it)}")
            println("Course Name: ${courseName.elementAt(it)}")
            println("Instructor Name: ${instructorName.elementAt(it)}")
            println("Maximum Students: ${maxStudents.elementAt(it)}")
            println("List of Students")
            repeat(studentEnrolled[it].size){count->
                println("${count+1}. ${studentEnrolled[it].elementAt(count)}")
            }
        }
    }




}