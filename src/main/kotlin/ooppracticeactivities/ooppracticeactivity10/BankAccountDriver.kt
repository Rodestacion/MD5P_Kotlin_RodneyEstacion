package ooppracticeactivities.ooppracticeactivity10

fun main(){
    println("First Constructor")
    val newAccount1 = BankAccount("3-186132186-41")
    println("Account Number: ${newAccount1.account}")
    println("Balance: ${newAccount1.balance}")

    println("Second Constructor")
    val newAccount2 = BankAccount("8-752656254-64",27020.0)
    println("Account Number: ${newAccount2.account}")
    println("Balance: ${newAccount2.balance}")
}