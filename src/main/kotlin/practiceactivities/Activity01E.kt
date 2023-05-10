package practiceactivities
fun main(){
    //Identify 3 use cases that will efficiently use an Array, ArrayList, Set, Map.
    //Show in code the examples you mentioned.

    //Array
    println("Array")

    //1)
    //2)
    //3)

    println("******************************************")
    //ArrayList
    println("Array List")
    println("Sample value: arrayList1 = arrayListOf<Int>()")
    var arrayList1 = arrayListOf<String>()

    println("1) Handle multiple value in one variable")
    arrayList1.add("Cycling")
    arrayList1.add("Mountain Climbing")
    println("Sample Display: $arrayList1 \n")

    println("2) Add new value in any order of array")
    arrayList1.add(1,"Swimming")
    arrayList1.add(0,"Basketball")
    println("Sample Display: $arrayList1 \n")

    println("3) Remove an element")
    arrayList1.remove("Mountain Climbing")
    println("Sample Display: $arrayList1 \n")


    println("******************************************")
    //SET
    println("Set is a collection of unique elements")
    println("Sample value: setOf<Int>(1,47,90,20,90,40)")
    var set1 = setOf<Int>(1,47,90,20,90,40)

    println("1) Eliminated repeated value and display unique element")
    println("Sample Display: $set1 \n")

    println("2) Easily to re-arrange the order")
    println("Sample Display: ${set1.toSortedSet()} \n")

    println("3) Do mathematical operation. however omitted the value that repeated")
    println("Sample Display: ${set1.sum()} \n")

    println("******************************************")
    //MAP
    println("Map (or dictionary) is a set of key-value pairs.")
    println("Sample value: mutableMapOf<String,String>(\"001\" to \"Basketball\",\"002\" to \"Cycling\",\"003\" to \"Swimming\",\"004\" to \"Mountain Climbing\")")
    var outdoorActivity = mutableMapOf<String,String>("001" to "Basketball","002" to "Cycling","003" to "Swimming","004" to "Mountain Climbing")

    println("1) Use the key to search a value")
    println("Search key: 002")
    println("Display output ${outdoorActivity["002"]}\n")

    println("2) Replace the element of a key")
    println("Replace key: 003 element to Volleyball")
    outdoorActivity.replace("003","Volleyball")
    println("Display output: $outdoorActivity \n")

    println("3) Check if an element is exist in the map")

    println("Search key: Basketball")
    println("Sample Display: ${outdoorActivity.containsValue("Basketball")} \n")




}