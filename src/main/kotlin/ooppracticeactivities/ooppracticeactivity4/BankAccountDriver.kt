package ooppracticeactivities.ooppracticeactivity4
fun main(){
    var newBankAccount = BankAccount("13065651948",10000.0)

    newBankAccount.deposit(1000.0)
    newBankAccount.withdraw(5000.0)
    newBankAccount.withdraw(8000.0)
    newBankAccount.deposit(20000.0)
}