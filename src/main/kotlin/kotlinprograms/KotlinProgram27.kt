package kotlinprograms

fun main(){
    //concatenation
    val  firstName = "Juan"
    val middleName = "D."
    val lastName = "Dela Cruz"
    var fullName = firstName + " "+ middleName +" "+ lastName
    fullName = firstName.plus(" ").plus(middleName).plus(" ").plus(lastName)

    println(fullName)
    //interpolation
    fullName = "$firstName $middleName $lastName"
    println(fullName)

    //substring
    var myText = "Hello World!"
    var subText = myText.substring(6,12)
    println(subText)

    //split
    var text = "Peter,Paul,Mary"
    var splitText = text.split(",")
    println(splitText)

    //trim
    var textToTrim = " \nHello World!  "
    var trimmedText = textToTrim.trim()
    println(trimmedText)
}