package practiceactivities
fun main(){
    //Implement Activity 01 -  A using data structure.

    //var studentName:String = "Juan Dela Cruz"
    //var studentID: String = "2018-045068"
    var student = mapOf<String,String>("2018-045068" to "Juan Dela Cruz")
    var studentInformation = mutableListOf(
        mutableListOf<String>(), //Key
        mutableListOf<Int>(),
    )
    var age: Int = 18
    var gender:String = "Male"
    var birthday:String = "01/01/2000"

    var studentClassification: String = "Regular"
    var withScholarship:String = "Yes"
    var scholarshipType:String = "Varsity Scholar"
    var admissionYear:Int = 2018
    var currentYear: String = "5th"
    var section: String = "BSGE-B"

    var courseDegree: String = "Bachelor of Science in General Engineering"
    var courseMajor: String = "Electrical Engineering"
    var courseSubject : String = "AutoCAD 101"
    var finalSubjectGrade: Double = 90.45
    var gradeStatus: String = "Pass"
}