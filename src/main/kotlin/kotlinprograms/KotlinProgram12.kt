package kotlinprograms

fun main(){
    //password saved in database
    var defaultUsername :String = "admin"
    var defaultPassword : String = "pass123"

    //login
    println("Enter Username: ")
    var username : String = readln()
    println("Enter password: ")
    var password : String = readln()

    //test if credential is correct
    if ((username == defaultUsername)&&(password==defaultPassword)){
        println("Logged in!")
    }
    else{
        println("Invalid username or password")
    }
}