package studentenrollmentsystem

class Course(){
    var courseID = mutableListOf<String>("BSC","BSIT","BSCpE")
    var courseName = mutableListOf<String>("Bachelor of Science in Computer Science", "Bachelor of Science in Information Technology","Bachelor of Science in Computer Engineering")
    var instructorName = mutableListOf<String>("Samonte","Salac","Destrza")
    var maxStudents = mutableListOf<Int>(40,50,25)
    private var studentEnrolled = mutableListOf<Any>()

    init {
        studentEnrolled.add(0, mutableListOf<String>("William","Olivia","Jack"))
        studentEnrolled.add(1, mutableListOf<String>("Noah","Oliver","Ava"))
        studentEnrolled.add(2, mutableListOf<String>("Emma","Mia","Benjamin"))
    }

    fun addStudent(name:String,courseId:String){
        var courseIndex = this.courseID.indexOf(courseId)

        var studentArray = mutableListOf<String>(this.studentEnrolled.elementAt(courseIndex).toString())
        studentArray.add(name)
        println(studentArray)
    }




}