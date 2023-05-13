package ooppracticeactivities.ooppracticeactivity7

fun  main(){
    println("First Constructor")
    val newPerson1 = Person("Juan Dela Cruz")
    println(newPerson1.name)
    println(newPerson1.age)

    println("Second Constructor")
    val newPerson2 = Person("Nathan",7)
    println(newPerson2.name)
    println(newPerson2.age)
}