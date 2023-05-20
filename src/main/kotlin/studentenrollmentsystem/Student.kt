package studentenrollmentsystem

class Student {
    var studentID = mutableListOf<String>("2023-001")
    var name= mutableListOf<String>("Juan Dela Cruz")
    var age= mutableListOf<Int>(25)
    var gender= mutableListOf<String>("Male")
    var contactNumber= mutableListOf<String>("09161234567")
    var contactEmail= mutableListOf<String>("juan.cruz@outloo.com")
    var enrolledCourses= mutableMapOf<String, String>()

    init {
        enrolledCourses["2023-001"] = "BS Mathematics"
    }
    fun addStudent(name:String,age:Int,gender:String,contactNumber:String,contactEmail:String){
        var count =studentID.size

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

        display()

    }
    fun removeStudent(name:String){
        val tempIndex: Int = getIndex(name)
        val tempID = studentID.elementAt(tempIndex)

        if(checkExist(name)){
            this.name.removeAt(tempIndex)
            this.age.removeAt(tempIndex)
            this.gender.removeAt(tempIndex)
            this.contactEmail.removeAt(tempIndex)
            this.contactNumber.removeAt(tempIndex)
            this.enrolledCourses.remove(tempID)


            display()


        }
    }
    fun display(){
        println("Student Summary")
        repeat(studentID.size){
            println(studentID)
            println(name)
            println(age)
            println(gender)
            println(contactNumber)
            println(contactEmail)
            println(enrolledCourses)
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