package practiceactivities

fun main(){
    var inputText: String = ""
    var inputCharacter: String = ""
    var characterCount : Int = 0

    print("Enter a string: ")
    inputText = readln()
    print("Enter a character: ")
    inputCharacter = readln()

    characterCount = inputText charCount inputCharacter
    println("Character count: $characterCount")
}
infix fun String.charCount(character:String):Int{
    var counter: Int = 0
    var letterCount: Int = 0

    while (counter<this.length){
        if(character.uppercase()==this.substring(counter,counter+1).uppercase()){
            letterCount++
        }
        counter++
    }

    return letterCount
}