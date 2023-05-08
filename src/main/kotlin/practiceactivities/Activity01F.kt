package practiceactivities
fun main(){
    //Scope : String, Loops
    //Create an application that will accept 2 string inputs.
    //Your application will print all unique characters in both Strings.
    //Union of Unique characters in both Strings

    var string1:String = "" // for input value
    var string2:String = "" // for input value
    var text:String = "" // for lambda output
    val combineLetter = {letterList:Set<String> -> repeat(letterList.size){text+=(letterList.elementAt(it))};text}

    print("Enter first string: ")
    string1 = readln()
    print("Enter second string: ")
    string2 = readln()

    println("Unique: ${combineLetter(displayUnique(string1,string2).toSet())}")

}
fun displayUnique(string1:String,string2:String): MutableList<String> {
    var letterCount = mutableListOf<Int>()
    var combineSet = mutableListOf<String>()
    var combineSet2 = mutableListOf<String>()

    combineSet = convertToList(string1+string2) //original string format
    combineSet2 = convertToList(string1.lowercase() +string2.lowercase()) //convert string to lowercase to get the unique letter
    var sortLetter = combineSet2.toSortedSet()

    //check the count of each identified unique letter
    repeat(sortLetter.size){
        letterCount.add(it, letterCounting(string1.lowercase()+string2.lowercase(),sortLetter.elementAt(it)))
    }

    //loop to remove duplicate letter
    repeat(sortLetter.size){
        var counter: Int = 0

        while(counter<letterCount.elementAt(it)-1){ //subtract the loop limit to 1 to ensure the last unique letter will not remove
            var counter2: Int = 0
            while (counter2<combineSet.size){
                if(combineSet.elementAt(counter2).lowercase() == sortLetter.elementAt(it)){ //condition to remove duplicate letter uppercase/lowercase format
                    combineSet.removeAt(counter2)
                    break
                }
                counter2++
            }
            counter++
        }
    }

    return combineSet
}
fun convertToList(text:String): MutableList<String> {
    var splitText= arrayListOf<String>()
    repeat(text.length){
        splitText.add(text.substring(it,it+1))
    }

//    splitText = text.split("") as ArrayList<String>
//    splitText.remove("") //remove only 1 space
//    println(splitText)

    return splitText
}
fun letterCounting(text:String,character:String):Int{ //from PracticeActivity42
    var counter: Int = 0
    var letterCount: Int = 0

    while (counter<text.length){
        if(character.lowercase()==text.substring(counter,counter+1).lowercase()){
            letterCount++
        }
        counter++
    }

    return letterCount
}


