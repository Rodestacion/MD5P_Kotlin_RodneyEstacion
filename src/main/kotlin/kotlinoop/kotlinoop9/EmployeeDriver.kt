import kotlinoop.kotlinoop9.Employee
import kotlinoop.kotlinoop9.Manager

fun main(){
    var employee1 = Employee("00001", 20000.00)
    employee1.setName("Peter Parker")
    employee1.setAge(31)
    employee1.displayEmployeeDetails()

    val manager = Manager()
    manager.setName("Clark Kent")
    manager.setAge(25)
    println("Manager name is ${manager.getName()}")
    println("Manager age is ${manager.getAge()}")
    manager.managePeople()

}