package kotlinprograms

fun main(){
    //length
    val myText = "Hello World!"
    val stringLength = myText.length
    println(stringLength)

    //LowerCase and UpperCase
    val upperCase = myText.uppercase()
    val lowerCase = myText.lowercase()
    println(upperCase)
    println(lowerCase)

    //contains
    var searchText = "Hello"
    //var result = myText.contains(searchText)
    var result = myText.uppercase().contains(searchText.uppercase())
    println(result)

    //replace
    var replacedText = myText.replace("World","Kotlin")
    println(replacedText)

    //accessing by index
    println("${myText[0]} ${myText[11]}")
}