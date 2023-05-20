package onlinebookstore

open class User(private val name:String,private val email:String) {

    fun displayUser(){
        println("User Name: ${this.name}")
        println("E-mail address: ${this.email}")
    }
}