package kotlinprograms

fun main(){
    //default parameter values
    displayName("Joe",7)
}

fun displayName(name:String = "Unknown", numberOfTimes:Int=3){
    repeat(numberOfTimes){
        println("Hello $name")
    }
}