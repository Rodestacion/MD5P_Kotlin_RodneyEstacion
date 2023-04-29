package practiceactivities

fun main(){
    var inputText: String = ""

    println("Enter a Text: ")
    inputText = readln()

    //display the reverse text
    println(reverseText(inputText))
}

fun reverseText(text:String):String{
    var counter: Int = 0
    var result:String = ""
    counter = text.length

    //loop to reverse each character
    while (counter>0){
        result += text[counter - 1]
        counter--
    }

    return result
}