package practiceactivities

fun main(){
    myHigherOrderFunction3(numberList)
}
var myStringList= mutableListOf<String>()
var numberList = {number:Int -> repeat(number){myStringList.add("Number $number")}
    myStringList} //return the value

//var numberList = {vararg number:Int -> repeat(number){myStringList*=(it+1)}
//    myStringList} //return the value

fun myHigherOrderFunction3 (myFunction: (Int) -> MutableList<String>){
    //var numbers = listOf<Int>(1,2,3,4,5)
    println(myFunction(1)) //,2,3,4,5))
    //println(myFunction(numbers))

}