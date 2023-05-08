package kotlinoop
//OOP
//Objects-
//Structural Programing, ProceduralProgramming
//-top to bottom

//Person class

//attributes/properties:
//name
//address
//phoneNumber
//gender
//birthday
//bloodtype
//civil status

//behaviors:
//walk
//eat
//sleep
//drive
//study
//breath

//1st variation
class Person{
    var name : String
    var age : Int

    //init block, initialize

    init {
        name = "Pedro"
        age = 21
    }

    fun walk(){
        println("A person walks")
    }

    fun eat(){
        println("A person eats")
    }

    fun sayHello(){
        println("$name says Hello!")
    }


}

fun main(){
    //instantiation - creating objects from a class
    var pedroObject = Person()

    println(pedroObject.name)
    //pedroObject.name = "John"
    //println(pedroObject.name)

    pedroObject.sayHello()
}

