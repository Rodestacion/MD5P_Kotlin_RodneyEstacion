package practiceactivities

fun main(){
    var name = mutableSetOf<String>("Alice","Bob","Charlie")
    var phoneNumber = mutableSetOf<String>("555-1234","555-5678","555-9101")
    var counter: Int = 0
    var searchName: String = ""

    print("What is the name? ")
    searchName = readln()

    while(counter < name.size){
        if(searchName==name.elementAt(counter)){
            println("${name.elementAt(counter)} phone number is ${phoneNumber.elementAt(counter)}")
            break
        }
        counter++
    }
}