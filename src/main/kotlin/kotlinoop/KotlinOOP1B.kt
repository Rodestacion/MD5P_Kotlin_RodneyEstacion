package kotlinoop

class Person1B(name:String, age:Int){
    var name : String
    var age : Int

    //init block, initialize

    init {
        this.name = name //this.name > variable name > parameter
        this.age = age
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
    var pedroObject = Person1B("John",21)

    println(pedroObject.name)
    println(pedroObject.age)

    pedroObject.sayHello()
}

