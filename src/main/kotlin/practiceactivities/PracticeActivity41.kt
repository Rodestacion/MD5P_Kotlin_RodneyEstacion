package practiceactivities

fun main(){
    var inputText: String = ""
    var outputText: String = ""

    print("Enter a string: ")
    inputText = readln()

    outputText = replaceSpaces(inputText)
    println("String with spaces replaced: $outputText")
}

fun replaceSpaces(text:String):String{
    var result:String = ""
    result = text.replace(" ","_")
    return result
}