package practiceactivities
fun main(){
    //Covered Topic(s) : Functions
    //Instructions :
    //Note: Names are single word with no spaces example, "Marco", "Eugene", "Sarah", "Isaiah", "Anthony", "Henry".
    //1. Create an ArrayList of names with 20 entries.
    //2. Create a function "isStudentInRecord" that will accept a name and return true if the name is found, otherwise false.
    //3. Create a function "addStudent" that will accept a name and add it to the ArrayList.
    //4. Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.
    //5. Create a function "countStudent" that will return the size of the ArrayList.
    //6. Create a function "searchStudentWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of names that matched if there are.
    //7. Create a function  "searchStudentName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of names that matched if there are.
    //8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if the String input is less than or equal to three, and it will call "searchStudentName" if the String input is greater than three.
    //9.  Create a function "showStudents" that will print all the entries in the ArrayList.

    var studentName = mutableListOf<String>("Adriel","Zechariah","Amya","Sullivan","Zaiden", "Gabrielle",
        "Silas","Kamila","Mira","Tyrone","Magdalena","Cloe","Aniya",
        "Donald","Shayla","Lorelei","Keegan","Byron","Dominick","Raegan")

    while (true){
        try {
            var option: Int = 0
            var inputText: String = ""
            println("[1] Search Student if in the Record")
            println("[2] Add the student")
            println("[3] Remove the student")
            println("[4] Show Number of Enrolled")
            println("[5] Student Wild Search")
            println("[6] Search Student Name")
            println("[7] Search Student")
            println("[8] Show Students List")
            println("[9] Exit")
            print("Select your option: ")
            option = readln().toInt()

            when (option){
                1->{
                    print("Input Student name to search in record: ")
                    inputText = readln()
                    if(isStudentInRecord(studentName,inputText)){
                        println("Student $inputText is existing in the list")
                    }else{
                        println("Sorry! Student $inputText is not exist in the list")
                    }
                }
                2->{
                    print("Input Student name add in record: ")
                    inputText = readln()

                    if(addStudent(studentName,inputText)){
                        println("Sorry! Student $inputText is already exist in the list")
                    }else{
                        studentName.add(inputText)
                        println("Student Add successfully")
                    }
                }
                3->{
                    print("Input Student name to remove ")
                    inputText = readln()

                    if (removeStudent(studentName,inputText)<0){
                        println("Sorry! Student $inputText is not exist in the list")
                    }else{
                        studentName.removeAt(removeStudent(studentName,inputText))
                        println("Student Remove successfully")
                    }
                }
                4->{
                    println("Total student enrolled is: ${countStudent(studentName)}")
                }
                5->{
                    print("Input text to search: ")
                    inputText = readln()
                    searchStudentWildSearch(studentName,inputText)
                }
                6->{
                    print("Input exact Student name to search: ")
                    inputText = readln()
                    searchStudentName(studentName,inputText)
                }
                7->{
                    print("Input Student name to search: ")
                    inputText = readln()
                    searchStudent(studentName,inputText)
                }
                8->{
                    showStudents(studentName)
                }
                9->{
                    break
                }

            }
            println()
        }catch (exception:Exception){
            println("Invalid Input")
        }
    }
}

fun isStudentInRecord(studentName:MutableList<String>,searchName:String):Boolean{
    var number :Int = 0
    var answer:Boolean = false

    while (number<studentName.size){
        if(studentName.elementAt(number).uppercase()==searchName.uppercase()){
            answer = true
            break
        }
        number++
    }

    return answer
}

fun addStudent(studentName:MutableList<String>,searchName: String):Boolean{
    var number :Int = 0
    var answer:Boolean = false

    while (number<studentName.size){
        if(studentName.elementAt(number).uppercase()==searchName.uppercase()){
            answer = true
            break
        }
        number++
    }

    return answer
}

fun removeStudent(studentName:MutableList<String>,searchName: String):Int{
    var remove: Int = -1
    var number :Int = 0

    while (number<studentName.size){
        if(studentName.elementAt(number).uppercase()==searchName.uppercase()){
            remove = number
            break
        }
        number++
    }
    return remove
}

fun countStudent(studentName:MutableList<String>):Int{
    return studentName.size
}

fun searchStudentWildSearch(studentName:MutableList<String>,searchName: String){
    var number :Int = 0

    println("List of Name searched")
    while (number<studentName.size){
        if(studentName.elementAt(number).uppercase().contains(searchName.uppercase())){
            println(studentName.elementAt(number))
        }
        number++
    }
    println("---Nothing Follows---")
}

fun searchStudentName(studentName:MutableList<String>,searchName: String){
    var number :Int = 0

    println("List of Name searched")

    while (number<studentName.size){
        if(studentName.elementAt(number).uppercase()==searchName.uppercase()){
            println(studentName.elementAt(number))
        }
        number++
    }
    println("---Nothing Follows---")
}

fun searchStudent(studentName:MutableList<String>,searchName: String){

    if(searchName.length<=3){
        searchStudentWildSearch(studentName,searchName)
    }else{
        searchStudentName(studentName,searchName)
    }
}

fun showStudents(studentName:MutableList<String>){
    println("List of the student")
    repeat(studentName.size){
        println(studentName.elementAt(it))
    }
    println("---Nothing Follows---")
}
