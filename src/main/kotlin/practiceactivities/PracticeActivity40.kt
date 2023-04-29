package practiceactivities

fun main(){
    var inputText: String = ""
    var outputText: String = ""

    print("Enter a string: ")
    inputText = readln()

    outputText = removeDuplicate(inputText)
    println("String with duplicates removed: $outputText")
}

fun removeDuplicate(text:String):String{
    var counter: Int = 0
    var newArraySize: Int = 0
    var textArray = mutableListOf<String>()
    var result:String = ""

    while (counter<text.length){
        textArray.add(counter,text.substring(counter,counter+1))
        counter++

    }
    newArraySize= textArray.distinct().size

    counter=0
    while (counter<newArraySize){
        result += textArray.distinct().elementAt(counter)
        counter++

    }

    return result
}