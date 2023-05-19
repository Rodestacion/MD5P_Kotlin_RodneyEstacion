package kotlinoop.kotlinoop13

class Person:Singer,Dancer, Performer() {
    private var name:String

    init {
        name = "default name"
    }

    fun setName(name:String){
        this.name = name
    }

    fun getName():String{
        return name
    }

    override fun sing(){
        println("A person sings...")
    }

    override fun dance() {
        println("A person dances...")
    }

    override fun performer() {
        println("A person can perform")
    }
}