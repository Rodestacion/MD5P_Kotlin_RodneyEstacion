package practiceactivities

fun main() {
    var inputText: String = ""
    var counter: Int = 0

    print("Enter a text: ")
    inputText = readln()

    print("\nThe reverse characters of input string is: ")
    counter = inputText.length

    //loop to display and reverse each character
    while (counter>0){
        print("${inputText[counter-1]}")
        counter--
    }

}