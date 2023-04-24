package practiceactivities

fun main() {
    var inputText: String = ""
    var counter: Int = 0
    var countA: Int = 0
    var countE: Int = 0
    var countI: Int = 0
    var countO: Int = 0
    var countU: Int = 0

    print("Enter a text: ")
    inputText = readln()

    //loop to count the vowel letter
    while (counter<inputText.length){
        when(inputText[counter].uppercase()){
            'A'.toString()->{
                countA++
            }
            'E'.toString()->{
                countE++
            }
            'I'.toString()->{
                countI++
            }
            'O'.toString()->{
                countO++
            }
            'U'.toString()->{
                countU++
            }
        }
        counter++
    }

    println("The number of letter 'A' within the text is: $countA")
    println("The number of letter 'E' within the text is: $countE")
    println("The number of letter 'I' within the text is: $countI")
    println("The number of letter 'O' within the text is: $countO")
    println("The number of letter 'U' within the text is: $countU")

}