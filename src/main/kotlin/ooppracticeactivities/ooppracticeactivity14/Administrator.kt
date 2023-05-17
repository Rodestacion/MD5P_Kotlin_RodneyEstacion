package ooppracticeactivities.ooppracticeactivity14

class Administrator(name:String, age:Int, private var department:String):Employee(name,age) {
    override fun displayInfo(){
        println("Administrator Info")
        super.displayInfo()
        println("Department: $department")
    }
}