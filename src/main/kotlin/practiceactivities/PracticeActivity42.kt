package practiceactivities

fun main(){
    var inputText: String = ""
    var inputCharacter: String = ""
    var characterCount : Int = 0

    print("Enter a string: ")
    inputText = readln()
    print("Enter a character: ")
    inputCharacter = readln()

    characterCount = countOccurence(inputText,inputCharacter)
    println("Character count: $characterCount")
}
fun countOccurence(text:String,character:String):Int{
    var counter: Int = 0
    var letterCount: Int = 0

    while (counter<text.length){
        if(character.uppercase()==text.substring(counter,counter+1).uppercase()){
            letterCount++
        }
        counter++
    }

    return letterCount
}