package practiceactivities

fun main(){
    myHigherOrderFunction3(numberList)
}
var myStringList= mutableListOf<String>()
var numberList = {number:MutableList<Int>-> repeat(number.size){myStringList.add("Number ${number.elementAt(it)}")}
    myStringList} //return the value

fun myHigherOrderFunction3 (myFunction: (MutableList<Int>) -> MutableList<String>){
    var numbers = listOf<Int>(1,2,3,4,5)
    println(myFunction(numbers.toMutableList()))

}