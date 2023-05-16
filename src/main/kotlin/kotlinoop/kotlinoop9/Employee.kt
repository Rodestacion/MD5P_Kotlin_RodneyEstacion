package kotlinoop.kotlinoop9

//Employee is a Person?
class Employee(private var empId:String, private var salary:Double) : Person() {
    fun setEmpId(empId:String){
        this.empId = empId
    }

    fun setSalary(salary:Double){
        this.salary = salary
    }

    fun getEmpId():String{
        return empId
    }

    fun getSalary():Double{
        return salary
    }

    fun displayEmployeeDetails(){
        println("Employee name is ${getName()}")
        println("Employee age is ${getAge()}")
        println("Employee ID is $empId")
        println("Employee Salary is $salary")
    }
}