package studentenrollmentsystem

class Student {
    private var studentID = mutableListOf<String>("2023-001")
    private var name= mutableListOf<String>("Juan")
    private var age= mutableListOf<Int>(25)
    private var gender= mutableListOf<String>("Male")
    private var contactNumber= mutableListOf<String>("09161234567")
    private var contactEmail= mutableListOf<String>("juan.cruz@outloo.com")
    private var enrolledCourses= mutableListOf<String>("BS Mathematics")


    fun addStudent(name:String,age:Int,gender:String,contactNumber:String,contactEmail:String,course:String){
        val count =studentID.size

        val iD = setOf(studentID)
        val text:String = iD.last().toString()
        val num:Int = (text.substring(6,9).toInt())+1
        var tempID:String=""

        if(num.toString().length==1){
            tempID="2023-00${num}"
        }else if(num.toString().length==2){
            tempID="2023-0${num}"
        }else{
            tempID="2023-${num}"
        }

        this.studentID.add(count,tempID)
        this.name.add(count,name)
        this.age.add(count,age)
        this.gender.add(count,gender)
        this.contactNumber.add(count,contactNumber)
        this.contactEmail.add(count,contactEmail)
        this.enrolledCourses.add(count,course)

        println("Student $name with assign student ID ${studentID.elementAt(studentID.lastIndex)} was successfully add")

    }
    fun removeStudent(name:String){
        val tempIndex: Int = getIndex(name)
        val tempID = studentID.elementAt(tempIndex)

        if(checkExist(name)){
            this.studentID.removeAt(tempIndex)
            this.name.removeAt(tempIndex)
            this.age.removeAt(tempIndex)
            this.gender.removeAt(tempIndex)
            this.contactEmail.removeAt(tempIndex)
            this.contactNumber.removeAt(tempIndex)
            this.enrolledCourses.removeAt(tempIndex)

            println("Student $name with ID $tempID was successfully remove")
        }else{
            println("Student $name not exist in the list")
        }
    }
    fun displayStudentInfo(){
        println("\nStudent Summary")
        repeat(studentID.size){
            println("*******************")
            println("Student ID: ${studentID.elementAt(it)}")
            println("Name: ${name.elementAt(it)}")
            println("Age: ${age.elementAt(it)}")
            println("Gender: ${gender.elementAt(it)}")
            println("Contact #: ${contactNumber.elementAt(it)}")
            println("E-mail: ${contactEmail.elementAt(it)}")
            println("Course: ${enrolledCourses.elementAt(it)}")
            println()
        }

    }

    private fun checkExist(name:String):Boolean{
        var answer:Boolean = false
        for (text in this.name){
            if(text.uppercase()==name.uppercase()){
                answer=true
                break
            }
        }
        return answer
    }

    private fun getIndex(name:String):Int{
        var answer:Int = 0
        var count:Int = 0
        while (count < this.name.size){
            if(this.name.elementAt(count).uppercase()==name.uppercase()){
                answer=count
                break
            }
            count++
        }
        return answer
    }
}