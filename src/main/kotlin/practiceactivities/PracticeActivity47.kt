package practiceactivities

fun main(){
    var inputText: String = ""
    var wordCount : Int = 0

    print("Enter a string: ")
    inputText = readln()

    wordCount = countWords(inputText.trim())
    println("Number of words: $wordCount")
}
fun countWords(text:String):Int{
    var letterCount: Int = 0
    var count: Int = 0
    var splitText = text.split(" ")

    while(count<splitText.size){
        if(splitText.elementAt(count).length==1|| splitText.elementAt(count).isEmpty()){
            if(splitText.elementAt(count).uppercase()=="I" || splitText.elementAt(count).uppercase()=="A"){
                letterCount++
            }
        }else{
            letterCount++
        }
        count++
    }

    return letterCount
}