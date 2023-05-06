package practiceactivities

fun main(){
    var myStringList= mutableListOf<String>()
    var numberList = {number:MutableList<Int>-> repeat(number.size){myStringList.add("Number:${number.elementAt(it)}")}
        myStringList} //return the value

    higherOrderFunction(numberList)
}

fun higherOrderFunction (inputList: (MutableList<Int>) -> MutableList<String>){
    var numbers = listOf<Int>(1,2,3,4,5)
    println(inputList(numbers.toMutableList()))

}