package practiceactivities
fun main(){
    //Create an application that will accept 1 string.
    //Your application will print “Palindrome” if the string is a palindrome.
    
    var inputString:String = ""
    var stringReverse : String = ""
    print("Enter first string: ")
    inputString = readln()

    stringReverse = reverseTexts(inputString)


    if(inputString.uppercase()==stringReverse.uppercase()){
        println("$inputString - Palindrome")
    }else{
        println("$inputString - Not Palindrome")
    }
}

fun reverseTexts(text:String): String {
    var reverse:String = ""
    var count: Int = text.length

    //loop to reverse the string
    while(count>0){
        reverse+=text.substring(count-1,count)
        count--
    }

    return reverse
}