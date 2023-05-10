package practiceactivities
fun main(){
    //Implement Activity 01 -  A using data structure.

    var student = mapOf<String,String>("2018-045068" to "Juan Dela Cruz") //studentID & studentName

    var studentPersonalInformation = mutableListOf(
        mutableListOf<String>("2018-045068"),     //Key
        mutableListOf<Int>(18),                   //age
        mutableListOf<String>("Male"),            //gender
        mutableListOf<String>("01/01/2000")       //birthday
    )

    var studentAcademicInformation = mutableListOf(
        mutableListOf<String>("2018-045068"),                                   //Key
        mutableListOf<Int>(18),                                                 //studentClassification
        mutableListOf<String>("Yes"),                                           //withScholarship
        mutableListOf<String>("Varsity Scholar"),                               //scholarshipType
        mutableListOf<Int>(2018),                                               //admissionYear
        mutableListOf<String>("5th"),                                           //currentYear
        mutableListOf<String>("BSGE-B"),                                        //section
        mutableListOf<String>("Bachelor of Science in General Engineering"),    //courseDegree
        mutableListOf<String>("Electrical Engineering")                         //courseMajor
    )

    var studentSubjectInformation = mutableListOf(
        mutableListOf<String>("2018-045068"),   //Key
        mutableListOf<String>("AutoCAD 101"),   //courseSubject
        mutableListOf<Double>(90.45),           //finalSubjectGrade
        mutableListOf<String>("Pass")           //gradeStatus
    )
}