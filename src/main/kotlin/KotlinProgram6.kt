fun main(){
    var andOperator = (6>1) && (5>2) // will only be true if both statements are true
    var orOperator = (1>1) || (6 >2) // will only be false if both statements are false
    var notOperator = !(5==5) //inverts the result

    println(andOperator)
    println(orOperator)
    println(notOperator)
}