package practiceactivities

fun main(){
    var phoneDirectory = mapOf("Alice" to "555-1234","Bob" to "555-5678","Charlie" to "555-9101")
    var searchName: String = ""

    print("What is the name? ")
    searchName = readln()

    for((name,phone) in phoneDirectory){
        if(searchName==name){
            println("$name phone number is $phone")
            break
        }else{
            println("The name is not listed in directory")
        }
    }
}