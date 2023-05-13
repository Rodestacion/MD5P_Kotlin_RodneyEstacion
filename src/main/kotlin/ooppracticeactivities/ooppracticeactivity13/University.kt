package ooppracticeactivities.ooppracticeactivity13

class University {

    val name = "Batangas College"

    inner class Student{
        var name:String =""
        var id: Int =0


        fun callUniversity(name:String,id:Int){
            this.name = name
            this.id = id
        }
    }

}